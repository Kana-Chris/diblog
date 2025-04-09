package com.diworksdev.diblog.action;

import java.util.Map;

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
	
	public String execute() {
		
		if(session.containsKey("authority")) {
			result = SUCCESS;
			
		}else if(password!=null&&!session.containsKey("authority")) {
			
		LoginDAO loginDAO = new LoginDAO();
		LoginDTO loginDTO = new LoginDTO();
		PassUtil passUtil = new PassUtil();
		
		loginDTO = loginDAO.login(mail);  
		
		String hash = passUtil.password_hash(password);
		
			if(hash.equals(loginDTO.getPassword())){   //パスワード一致ならindex.jspへ
				result = SUCCESS;
				session.put("authority", loginDTO.getAuthority());
				
			}else {
				result = ERROR;		                   //パスワード不一致ならlogin.jspへ
			}
		
		}else if(password==null) {
			result = ERROR;
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
	
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
	
	public Map<String,Object> getSession(){
		return session;
	}
}
