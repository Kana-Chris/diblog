package com.diworksdev.diblog.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.diworksdev.diblog.dao.RegistCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class RegistCompleteAction extends ActionSupport implements SessionAware{
	
	private String family_name;
	private String last_name;
	private String family_name_kana;
	private String last_name_kana;
	private String mail;
	private String password;
	private String gender;
	private String postal_code;
	private String prefecture;
	private String address_1;
	private String address_2;
	private String authority;
	private Map<String,Object> session;
	
	private String resultMessage; //登録結果のメッセージ
	
	String result = ERROR;
	
	public String execute() throws SQLException{
		
		RegistCompleteDAO dao = new RegistCompleteDAO();
		
		int daoResult;
		daoResult =dao.regist(
			(session.get("family_name")).toString(),
			(session.get("last_name")).toString(),
			(session.get("family_name_kana")).toString(),
			(session.get("last_name_kana")).toString(),
			(session.get("mail")).toString(),
			(session.get("password")).toString(),
			(session.get("gender")).toString(),
			(session.get("postal_code")).toString(),
			(session.get("prefecture")).toString(),
			(session.get("address_1")).toString(),
			(session.get("address_2")).toString(),
			(session.get("authority")).toString()
			);	
		
		if(daoResult==1) {
			setResultMessage("登録完了しました");
		}else {
			setResultMessage("エラーが発生したためアカウント登録できません。");
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
	
	public String getResultMessage() {
		return resultMessage;
	}
	
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	
	
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
	
	
	
	
}
