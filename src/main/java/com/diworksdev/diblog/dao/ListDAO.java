package com.diworksdev.diblog.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.diworksdev.diblog.dto.ListDTO;
import com.diworksdev.diblog.util.DBConnector;

public class ListDAO {
	DBConnector dbconnector = new DBConnector();
	Connection connection = dbconnector.getConnection();
	ListDTO listDTO = new ListDTO();
	List<ListDTO> accountList= new ArrayList<ListDTO>();
	
	private String sql = "SELECT id,family_name,last_name,family_name_kana,last_name_kana,mail,gender,authority,delete_flag,"
			+ "cast(registared_time AS DATE),cast(update_time AS DATE) FROM user_info ORDER BY id DESC";
	
	String gender;
	String authority;
	String deleteFlg;
	
	public List<ListDTO> selectAll(){
		try{
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			while(resultSet.next()) {
				ListDTO listDTO = new ListDTO();
				listDTO.setId(resultSet.getString("id"));
				listDTO.setFamily_name(resultSet.getString("family_name"));
				listDTO.setLast_name(resultSet.getString("last_name"));
				listDTO.setFamily_name_kana(resultSet.getString("family_name_kana"));
				listDTO.setLast_name_kana(resultSet.getString("last_name_kana"));
				listDTO.setMail(resultSet.getString("mail"));
				
				if(resultSet.getInt("gender")==0) {
					listDTO.setGender("男");
				}else {
					listDTO.setGender("女");
				}
				
				if(resultSet.getInt("authority")==0) {
					listDTO.setAuthority("一般");
				}else {
					listDTO.setAuthority("管理者");
				}
				
				if(resultSet.getInt("delete_flag")==0) {
					listDTO.setDelete_flag("有効");
				}else {
					listDTO.setDelete_flag("無効");
				}
				listDTO.setRegistared_time(resultSet.getString("cast(registared_time AS DATE)"));
				listDTO.setUpdate_time(resultSet.getString("cast(update_time AS DATE)"));
				
				accountList.add(listDTO);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		finally {
			if(connection!=null) {
				try {
					connection.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return accountList;
	}
}