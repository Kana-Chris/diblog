package com.diworksdev.diblog.action;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;
import java.util.Map;

public class DeleteConfirmAction extends ActionSupport implements SessionAware{
	private Map<String,Object> session;
	public String execute() {
		session.get("selectDTO");
		return SUCCESS;
	}
	
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
	
	public Map<String,Object> getSession(){
		return session;
	}
}
