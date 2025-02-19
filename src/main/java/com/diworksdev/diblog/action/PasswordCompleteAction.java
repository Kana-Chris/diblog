package com.diworksdev.diblog.action;
import com.diworksdev.diblog.dao.PasswordDAO;
import com.opensymphony.xwork2.ActionSupport;

public class PasswordCompleteAction extends ActionSupport{
	private int daoresult;
	private String password;
	private String updateId;
	private String result_message;
	
	public String execute() {
		PasswordDAO passwordDAO = new PasswordDAO();
		daoresult = passwordDAO.updatePassword(password,updateId);
		if(daoresult==1) {
			result_message = "パスワードを更新しました。";
		}
		else{
			result_message = "エラーが発生したためパスワード更新できません。";
		}
		return SUCCESS;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUpdateId() {
		return updateId;
	}
	
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}
	
	public String getResult_message() {
		return result_message;
	}
	
	public void setResult_message(String result_message) {
		this.result_message = result_message;
	}
}
