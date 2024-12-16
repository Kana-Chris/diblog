package com.diworksdev.diblog.action;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.diworksdev.diblog.dao.ListDAO;
import com.diworksdev.diblog.dto.ListDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ListAction extends ActionSupport implements SessionAware{
	
	private List<ListDTO> accountList = new ArrayList<ListDTO>();
	private Map<String,Object> session;
	
	public String execute() {
		session.remove("u_family_name");
		session.remove("u_last_name");
		session.remove("u_family_name_kana");
		session.remove("u_last_name_kana");
		session.remove("u_mail");
		session.remove("u_password");
		session.remove("u_gender");
		session.remove("u_postal_code");
		session.remove("u_prefecture");
		session.remove("u_address_1");
		session.remove("u_address_2");
		session.remove("u_authority");
		session.remove("deleteId");
		session.remove("selectDTO");
		
		ListDAO listDAO = new ListDAO();
		accountList =listDAO.selectAll();
		session.put("accountList",accountList);
		String result=SUCCESS;
		return result;
	}
	
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
	public Map<String,Object> getSession(){
		return this.session;
	}
}
