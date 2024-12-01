package com.diworksdev.diblog.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.diworksdev.diblog.dao.UpdateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateCompleteAction extends ActionSupport implements SessionAware{
	Map<String,Object> session;
	private String message;
	public String execute() {
	UpdateCompleteDAO updateDAO = new UpdateCompleteDAO();
	int daoResult;
	daoResult = updateDAO.update(session.get("u_id").toString(),
			 		session.get("u_family_name").toString(),
					session.get("u_last_name").toString(),
					session.get("u_family_name_kana").toString(),
					session.get("u_last_name_kana").toString(),
					session.get("u_mail").toString(),
					session.get("u_password").toString(),
					session.get("u_gender").toString(),
					session.get("u_postal_code").toString(),
					session.get("u_prefecture").toString(),
					session.get("u_address_1").toString(),
					session.get("u_address_2").toString(),
					session.get("u_authority").toString()
					);
	
	if(daoResult==1) {
		setMessage("更新完了しました");
	}
	
	else {
		setMessage("エラーが発生したためアカウント更新できません。");
	}
		
	
		return SUCCESS;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
	
	public void setSession(Map<String,Object> session) {
		this.session=session;
	}
	
	public Map<String,Object> getSession(){
		return session;
	}
}
