package com.diworksdev.diblog.action;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.diworksdev.diblog.dao.SearchDAO;
import com.diworksdev.diblog.dto.SelectDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ListAction extends ActionSupport implements SessionAware{
	
	SearchDAO searchDAO = new SearchDAO();
	private List<SelectDTO> searchList = new ArrayList<SelectDTO>();
	private String family_name;
	private String last_name;
	private String family_name_kana;
	private String last_name_kana;
	private String mail;
	private String gender;
	private String authority;
	private int errorFlag=0;
	
	private Map<String,Object> session;
	
	
	public String execute() throws SQLException {
		if(family_name!=null&&
			last_name!=null&&
			family_name_kana!=null&&
			last_name_kana!=null&&
			mail!=null) {
		 searchList = searchDAO.search(family_name,
									  last_name,
									  family_name_kana,
									  last_name_kana,
									  mail,
									  gender,
									  authority);
		
		}
		if(searchDAO.getErrorFlag()==1) {
			errorFlag=1;
		}
		String result=SUCCESS;
		return result;
	}
	
	public void setFamily_name(String family_name) {
		this.family_name = family_name;
	}
	
	public String getFamily_name() {
		return family_name;
	}
	
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public void setFamily_name_kana(String family_name_kana) {
		this.family_name_kana = family_name_kana;
	}
	
	public String getFamily_name_kana() {
		return family_name_kana;
	}
	
	public void setLast_name_kana(String last_name_kana) {
		this.last_name_kana= last_name_kana;
	}
	
	public String getLast_name_kana() {
		return last_name_kana;
	}
	
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	public String getMail() {
		return mail;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender() {
		return gender;
	}
	
	public void setAuthority(String authority){
		this.authority = authority;
	}
	
	public String getAuthority() {
		return authority;
	}
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
	public Map<String,Object> getSession(){
		return this.session;
	}
	
	public void setSearchList(List<SelectDTO> searchList) {
		this.searchList = searchList;
	}
	
	public List<SelectDTO> getSearchList(){
		return searchList;
	}
	
	public int getErrorFlag() {
		return errorFlag;
	}
	
	public void setErrorFlag(int errorFlag) {
		this.errorFlag = errorFlag;
	}
}
