package com.diworksdev.diblog.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteConfirmAction extends ActionSupport implements SessionAware{
	private Map<String,Object> session;
	private String deleteId;
	public String execute() {
		setDeleteId(deleteId);
		return SUCCESS;
		
	}
	
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
	
	public Map<String,Object> getSession(){
		return session;
	}
	
	public void setDeleteId(String deleteId) {
		this.deleteId = deleteId;
	}
	
	public String getDeleteId() {
		return this.deleteId;
	}
}
