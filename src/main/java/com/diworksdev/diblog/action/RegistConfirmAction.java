package com.diworksdev.diblog.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class RegistConfirmAction extends ActionSupport implements SessionAware{
	
	private String family_name;
	private String last_name;
	private String family_name_kana;
	private String last_name_kana;
	private String mail;
	private String password;
	private String gender;			
	private String postal_code; //sqlテーブルはint型
	private String prefecture;
	private String address_1;
	private String address_2;
	private String authority;
	
	String result = ERROR;
	
	public String message="";
	public Map<String,Object> session;
	
	public String execute() {
		//空チェック
		if(!(family_name.equals(""))
			&&!(last_name.equals(""))
			&&!(family_name_kana.equals(""))
			&&!(last_name_kana.equals(""))
			&&!(mail.equals(""))
			&&!(password.equals(""))
			&&!(postal_code.equals(""))
			&&!(prefecture.equals(""))
			&&!(address_1.equals(""))
			&&!(address_2.equals(""))
			){
				result=SUCCESS;
				
				session.put("family_name", family_name);
				session.put("last_name", last_name);
				session.put("family_name_kana", family_name_kana);
				session.put("last_name_kana", last_name_kana);
				session.put("mail",mail);
				session.put("password", password);
				session.put("gender",gender);
				session.put("postal_code", postal_code);
				session.put("prefecture", prefecture);
				session.put("address_1", address_1);
				session.put("address_2",address_2);
				session.put("authority",authority);
			
			}else {
				
				if(family_name=="") {
					setMessage("名前（姓）が未入力です。");
				}
				/*if(last_name=="") {
					message = message +"名前（名）が未入力です。<br>";
				}
				if(family_name_kana=="") {
					message = message +",カナ（姓）が未入力です。<br>";
				}
				if(last_name_kana=="") {
					message = message +",カナ（名）が未入力です。<br>";
				}
				if(mail=="") {
					message = message + ",メールアドレスが未入力です。<br>";
				}
				if(password=="") {
					message = message + ",パスワードが未入力です。<br>";
				}
				if(postal_code=="") {
					message = message + "パスワードが未入力です。<br>";
				}
			    if(prefecture=="") {
			    	message = message + "住所（都道府県）が選択されていません。<br>";
			    }
			    if(address_1=="") {
			    	message = message + "住所(市区町村）が未入力です。<br>";
			    }
			    if(address_2=="") {
			    	message = message + "番地が未入力です。";
			    }*/
			    
			    result = ERROR;
			    System.out.println(getMessage());
			 
			}
		
		return result;
	}
	
	
	public String getFamily_name() {
		return family_name;
	}
	
	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getFamily_name_kana() {
		return family_name_kana;
	}
	
	public void setFamily_name_kana(String family_name_kana) {
		this.family_name_kana = family_name_kana;
	}
	
	public String getLast_name_kana() {
		return last_name_kana;
	}
	
	public void setLast_name_kana(String last_name_kana) {
		this.last_name_kana = last_name_kana;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getPostal_code() {
		return postal_code;
	}
	
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	
	public String getPrefecture() {
		return prefecture;
	}
	
	public void setPrefecture(String prefecture) {
		this.prefecture = prefecture;
	}
	
	public String getAddress_1() {
		return address_1;
	}
	
	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}
	
	public String getAddress_2() {
		return address_2;
	}
	
	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}
	
	public String getAuthority() {
		return authority;
	}
	
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
	
	
}
