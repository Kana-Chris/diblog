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
