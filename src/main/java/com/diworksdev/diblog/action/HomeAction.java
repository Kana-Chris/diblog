package com.diworksdev.diblog.action;


import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.diworksdev.diblog.dao.LoginDAO;
import com.diworksdev.diblog.dto.LoginDTO;
import com.diworksdev.diblog.util.PassUtil;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware{	
	String result=ERROR;
	private String mail;
	private String password;
	private String authority;
	public Map<String,Object> session;
	private int errorFlag=0;
	private String login_flag="0";
	
	public String execute() throws SQLException{
		
		if(login_flag=="1") {  					//LoginAcionから来たならセッションを作り直す
			if(session.containsKey("authority")) {
				((SessionMap<String,Object>)session).invalidate();
			}
			
		}
		if(session.containsKey("authority")) {						  //セッションにログイン情報があればindexへ
			result = SUCCESS;
			
		}else if(password!=null&&!session.containsKey("authority")) { //初回アクセス、セッション作成
			
		LoginDAO loginDAO = new LoginDAO();
		LoginDTO loginDTO = new LoginDTO();
		PassUtil passUtil = new PassUtil();
		
		loginDTO = loginDAO.login(mail);  
		
		String hash = passUtil.password_hash(password);
				
			
			if(loginDAO.getConnectionError()==0) {
				if(hash.equals(loginDTO.getPassword())){  			 //パスワード一致ならindex.jspへ
					result = SUCCESS;
					session.put("authority", loginDTO.getAuthority());
				
				}else if(!hash.equals(loginDTO.getPassword())){
					setErrorFlag(1);
					result = ERROR;		  						 //パスワード不一致ならlogin.jspへ
				}
			}else if(loginDAO.getConnectionError()==1) {		//mysqlにアクセスできない時
				setErrorFlag(2);
				result = ERROR;
				System.out.println(loginDAO.getConnectionError());
			}
			
		}
			
		
		return result;
		
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	public String getAuthority() {
		return authority;
	}
	
	public void setErrorFlag(int errorFlag) {
		this.errorFlag = errorFlag;
	}
	
	public int getErrorFlag() {
		return errorFlag;
	}
	
	
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
	
	public Map<String,Object> getSession(){
		return session;
	}
	
	public void setLogin_flag(String login_flag) {
		this.login_flag = login_flag;
	}
	
	public String getLogin_flag() {
		return login_flag;
	}
}
