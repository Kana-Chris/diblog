package com.diworksdev.diblog.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.diworksdev.diblog.dao.SelectDAO;
import com.diworksdev.diblog.dto.SelectDTO;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction extends ActionSupport implements SessionAware{
	
	private String deleteId;
	public Map<String,Object> session;
	SelectDAO selectDAO = new SelectDAO();
    private SelectDTO selectDTO;
	
	public String execute() {
		
		  selectDTO = selectDAO.Select(deleteId);
		  setSelectDTO(selectDTO);
		  setDeleteId(deleteId);
		
		return SUCCESS;
	}
	
	public void setDeleteId(String deleteId) {
		this.deleteId = deleteId;
	}
	public String getDeleteId() {
		return deleteId;
	}
	
	public void setSelectDTO(SelectDTO selectDTO) {
		this.selectDTO = selectDTO;
	}
	
	public SelectDTO getSelectDTO() {
		return this.selectDTO;
	}
	
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
	public Map<String,Object> getSession(){
		return session;
	}
}
