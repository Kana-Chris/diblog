package com.diworksdev.diblog.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.diworksdev.diblog.dto.SelectDTO;
import com.diworksdev.diblog.util.DBConnector;


public class SelectDAO {
	
	DBConnector dbconnector = new DBConnector();
	Connection connection = dbconnector.getConnection();
	SelectDTO selectDTO = new SelectDTO();
	
	private String sql = "SELECT * FROM user_info WHERE id = ?";
	
	public SelectDTO Select(String updateId) {
		try {
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setString(1,updateId);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				selectDTO.setId(rs.getInt("id"));
				selectDTO.setFamily_name(rs.getString("family_name"));
				selectDTO.setLast_name(rs.getString("last_name"));
				selectDTO.setFamily_name_kana(rs.getString("family_name_kana"));
				selectDTO.setLast_name_kana(rs.getString("last_name_kana"));
				selectDTO.setMail(rs.getString("mail"));
				
				if(rs.getInt("gender")==0) {
					selectDTO.setGender("男");
				}else {
					selectDTO.setGender("女");
				}
				
				selectDTO.setPostal_code(rs.getString("postal_code"));
				selectDTO.setPrefecture(rs.getString("prefecture"));
				selectDTO.setAddress_1(rs.getString("address_1"));
				selectDTO.setAddress_2(rs.getString("address_2"));
				
				if(rs.getInt("authority")==0) {
					selectDTO.setAuthority("一般");
				}else {
					selectDTO.setAuthority("管理者");
				}
				
				if(rs.getInt("delete_flag")==0) {
					selectDTO.setDelete_flag("有効");
				}else {
					selectDTO.setDelete_flag("無効");
				}
				
				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return selectDTO;
	}
}
