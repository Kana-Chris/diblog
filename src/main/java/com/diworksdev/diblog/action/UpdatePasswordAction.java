package com.diworksdev.diblog.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;


public class UpdatePasswordAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private String password;
	private String updateId;
	private int emptycheck;
	
	public String execute() {

	return SUCCESS;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}
	
	public String getUpdateId() {
		return updateId;
	}
	
	public int getEmptycheck() {
		return emptycheck;
	}
	
	public void setEmptycheck(int emptycheck) {
		this.emptycheck = emptycheck;
	}
	
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
	public Map<String,Object> getSession(){
		return session;
	}
}

