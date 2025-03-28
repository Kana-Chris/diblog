package com.diworksdev.diblog.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private String result;
	
	public String execute() {
		if(session==null) {
			result=ERROR;
		}else if(session!=null) {
			result=SUCCESS;
		}
		
		return result;
		
	}
	
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
	
	public Map<String,Object> getSession(){
		return session;
	}
	
}
