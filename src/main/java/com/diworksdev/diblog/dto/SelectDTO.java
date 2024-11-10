package com.diworksdev.diblog.dto;

public class SelectDTO {
	
	private int id;
	private String family_name;
	private String last_name;
	private String family_name_kana;
	private String last_name_kana;
	private String mail;
	private String password;
	private String gender;
	private String authority;
	private String delete_flag;
	private String registared_time;
	private String update_time;
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}
	
	public String getFamily_name() {
		return this.family_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name=last_name;
	}
	
	public String getLast_name() {
		return this.last_name;
	}
	
	public void setFamily_name_kana(String family_name_kana) {
		this.family_name_kana = family_name_kana;
	}
	
	public String getFamily_name_kana() {
		return family_name_kana;
	}
	
	public void setLast_name_kana(String last_name_kana) {
		this.last_name_kana = last_name_kana;
	}
	
	public String getLast_name_kana() {
		return last_name_kana;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getMail() {
		return this.mail;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password; 
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return this.gender;
	}
	
	
	
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	public String getAuthority() {
		return this.authority;
	}
	
	public void setDelete_flag(String delete_flag) {
		this.delete_flag = delete_flag;
	}
	
	public String getDelete_flag() {
		return this.delete_flag;
	}
	
	public void setRegistared_time(String registared_time) {
		this.registared_time = registared_time;
	}
	
	public String getRegistared_time() {
		return registared_time;
	}
	
	public void setUpdate_time(String update_time) {
		this.update_time = update_time;
	}
	
	public String getUpdate_time() {
		return this.update_time;
	}

}
