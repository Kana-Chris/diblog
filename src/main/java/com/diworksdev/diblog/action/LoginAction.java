package com.diworksdev.diblog.action;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private String result;
	
	public String execute() {
		
		result=SUCCESS;
		if(session.containsKey("authority")) {
			((SessionMap<String,Object>)session).invalidate();
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
