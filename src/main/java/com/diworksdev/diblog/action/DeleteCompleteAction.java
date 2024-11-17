package com.diworksdev.diblog.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.diworksdev.diblog.dao.DeleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class DeleteCompleteAction extends ActionSupport implements SessionAware{
	private Map<String,Object> session;
	DeleteDAO deleteDAO = new DeleteDAO();
	
	public String execute() {
		int deleteId = (Integer)session.get("deleteId");
		deleteDAO.Delete(deleteId);
		return SUCCESS;
	}
	
	public void setSession(Map<String,Object>session) {
		this.session = session;
	}
	
	public Map<String,Object> getSession(){
		return session;
	}
	
	
}
