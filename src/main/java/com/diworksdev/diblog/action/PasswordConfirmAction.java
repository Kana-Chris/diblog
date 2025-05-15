package com.diworksdev.diblog.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class PasswordConfirmAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	private String result;
	private String password;
	private String updateId;
	private int emptycheck;
	
	public String execute() { //パスワードが空ならパスワード入力画面に戻る
		if(password.equals("")) {
			result = ERROR;
			setEmptycheck(1);
		}else if(!password.equals("")){ //パスワードが空でなければ確認画面へ
			setEmptycheck(0);
			result = SUCCESS;
		}
		return result;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	public String getUpdateId() {
		return updateId;
	}
	
	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}
	
	public void setEmptycheck(int emptycheck) {
		this.emptycheck = emptycheck;
	}
	public int getEmptycheck() {
		return emptycheck;
	}
	
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
	public Map<String,Object> getSession(){
		return session;
	}
}
