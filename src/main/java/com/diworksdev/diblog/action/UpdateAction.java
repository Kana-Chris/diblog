package com.diworksdev.diblog.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.diworksdev.diblog.dao.SelectDAO;
import com.diworksdev.diblog.dto.SelectDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction extends ActionSupport implements SessionAware{
	
	public Map<String,Object> session;
	private int updateId;
	private SelectDTO selectDTO;
	
	public String execute() {
		
		SelectDAO selectDAO = new SelectDAO();
		selectDTO = new SelectDTO();	
		selectDTO = selectDAO.Select(updateId);
		
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
	
	public void setSelectDTO(SelectDTO selectDTO) {
		this.selectDTO = selectDTO;
	}
	
	public SelectDTO getSelectDTO() {
		return selectDTO;
	}
	
}
