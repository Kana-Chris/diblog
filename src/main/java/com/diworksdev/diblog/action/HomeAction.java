package com.diworksdev.diblog.action;

import com.diworksdev.diblog.dao.LoginDAO;
import com.diworksdev.diblog.dto.LoginDTO;
import com.diworksdev.diblog.util.PassUtil;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport{
	
	String result=ERROR;
	private String mail;
	private String password;
	public String execute() {
		
		
		LoginDAO loginDAO = new LoginDAO();
		LoginDTO loginDTO = new LoginDTO();
		PassUtil passUtil = new PassUtil();
		
		loginDTO = loginDAO.login(mail);  
		
		String hash = passUtil.password_hash(password);
		System.out.println(hash);
		if(hash.equals(loginDTO.getPassword())){  //LoginDTOのパスワードはすでにハッシュ化されている
			result = SUCCESS;
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
}
