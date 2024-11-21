package com.diworksdev.diblog.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.diworksdev.diblog.dao.SelectDAO;
import com.diworksdev.diblog.dto.SelectDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction extends ActionSupport implements SessionAware{
	
	public Map<String,Object> session;
	private int updateId;
	
	public String execute() {
		if(session!=null) {
		SelectDAO selectDAO = new SelectDAO();
		SelectDTO selectDTO = new SelectDTO();	
		selectDTO = selectDAO.Select(updateId);
		session.put("selectDTO", selectDTO);
		}
		return SUCCESS;
	}
	
	public int getUpdateId() {
		return updateId;
	}
	public void setUpdateId(int updateId) {
		this.updateId = updateId;
	}
	
	public Map<String,Object> getSession(){
		return session;
	}
	
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
	
}
