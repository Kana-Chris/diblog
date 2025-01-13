package com.diworksdev.diblog.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.diworksdev.diblog.dao.DeleteDAO;
import com.opensymphony.xwork2.ActionSupport;


public class DeleteCompleteAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private int DAOresult;
	private String deleteId;
	private String message = null;
	DeleteDAO deleteDAO = new DeleteDAO();
	
	public String execute() {

			DAOresult = deleteDAO.Delete(deleteId);
			if(DAOresult==1) {
				setMessage("削除完了しました");
			}else {
				setMessage("エラーが発生したためアカウント削除できません。");
			}
	
		return SUCCESS;
	}
	
	public void setSession(Map<String,Object>session) {
		this.session = session;
	}
	
	public Map<String,Object> getSession(){
		return session;
	}
	public String getDeletId() {
		return this.deleteId;
	}
	
	public void setDeleteId(String deleteId) {
		this.deleteId = deleteId;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
}
