package com.diworksdev.diblog.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.diworksdev.diblog.dao.SelectDAO;
import com.diworksdev.diblog.dto.SelectDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction extends ActionSupport implements SessionAware{
	
	public Map<String,Object> session;
	private int updateId;
	
	public String execute() {
		
		//初回アクセス時
		if(session.get("u_family_name")==null) {
			SelectDAO selectDAO = new SelectDAO();
			SelectDTO selectDTO = new SelectDTO();	
			selectDTO = selectDAO.Select(updateId);
			
			session.put("u_family_name",selectDTO.getFamily_name());
			session.put("u_last_name", selectDTO.getLast_name());
		    session.put("u_family_name_kana", selectDTO.getFamily_name_kana());
		    session.put("u_last_name_kana", selectDTO.getLast_name_kana());
		    session.put("u_mail",selectDTO.getMail());
		    session.put("u_password", selectDTO.getPassword());
		    session.put("u_gender",selectDTO.getGender());
		    session.put("u_postal_code",selectDTO.getPostal_code());
		    session.put("u_prefecture",selectDTO.getPrefecture());
		    session.put("u_address_1", selectDTO.getAddress_1());
		    session.put("u_address_2",selectDTO.getAddress_2());
		    session.put("u_authority",selectDTO.getAuthority());
			}
		
		//セッションがあるとき、つまりupdate_confirm.jspから戻った時
		if(session.get("u_family_name")!=null) {
			session.put("u_id", updateId); //多分いらない
			//ここから修正。DTOそのままじゃなくて各項目ごとにセッション追加したい
		
			session.get("u_family_name");
			session.get("u_last_name");
			session.get("u_family_name_kana");
			session.get("u_last_name_kana");
			session.get("u_mail");
		    session.get("u_password");
		    session.get("u_gender");
		    session.get("u_postal_code");
		    session.get("u_prefecture");
		    session.get("u_address_1");
		    session.get("u_address_2");
		    session.get("u_authority");
		    session.get("u_last_name");
		    session.get("u_family_name_kana");
		    session.get("u_last_name_kana");
		    session.get("u_mail");
		    session.get("u_password");
		    session.get("u_gender");
		    session.get("u_postal_code");
		    session.get("u_prefecture");
		    session.get("u_address_1");
		    session.get("u_address_2");
		    session.get("u_authority");
			session.get("selectDTO");
		}
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
	
}
