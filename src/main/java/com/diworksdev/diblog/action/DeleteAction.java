package com.diworksdev.diblog.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.diworksdev.diblog.dao.SelectDAO;
import com.diworksdev.diblog.dto.SelectDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport implements SessionAware{
	
	private int deleteId;
	private Map<String,Object> session;
	SelectDAO selectDAO = new SelectDAO();
	SelectDTO selectDTO = new SelectDTO();
	
	public String execute() {
		if(session.get("selectDTO")==null) {
		  selectDTO = selectDAO.Select(deleteId);
		  session.put("deleteId",deleteId);
		  session.put("selectDTO", selectDTO);
		}else {
			session.get("selectDTO");
		}
		return SUCCESS;
	}
	
	public void setDeleteId(int deleteId) {
		this.deleteId = deleteId;
	}
	public int getDeleteId() {
		return deleteId;
	}
	
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
	public Map<String,Object> getSession(){
		return session;
	}
}
