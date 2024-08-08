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
	private int gender;			
	private String postal_code; //sqlテーブルはint型
	private String prefecture;
	private String address_1;
	private String address_2;
	private int authority;
	
	String result = ERROR;
	
	public String message=null;
	private Map<String,Object> session;
	
	public String execute() {
		//空でないかのチェック
		if(!family_name.equals("")
			&&!last_name.equals("")
			&&!family_name_kana.equals("")
			&&!last_name_kana.equals("")
			&&!mail.equals("")
			&&!password.equals("")
			&&!postal_code.equals("")
			&&!prefecture.equals("")
			&&!address_1.equals("")
			&&!address_2.equals("")
			){
				message="未入力の項目があります。";
			}else {
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
			}
		
		return result;
	}
	
	
	public String getFamily_name() {
		return family_name;
	}
	
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
	
}
