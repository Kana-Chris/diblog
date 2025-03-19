package com.diworksdev.diblog.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.diworksdev.diblog.util.DBConnector;
import com.diworksdev.diblog.util.DateUtil;

public class UpdateCompleteDAO {
	
	DBConnector dbconnector = new DBConnector();
	Connection connection = dbconnector.getConnection();
	

	private String sql ="UPDATE user_info SET family_name=?,last_name=?,family_name_kana=?,last_name_kana=?,"
			+ " mail=?,gender=?,postal_code=?,prefecture=?,address_1=?,address_2=?,authority=?,"
			+ "update_time=? WHERE id = ?";
	
	DateUtil dateUtil = new DateUtil();
	public int update_result;
	private int int_gender;
	private int int_postal_code;
	private int int_authority;
	
	public int update(String id,
					String family_name,
					String last_name,
					String family_name_kana,
					String last_name_kana,
					String mail,
					String gender,
					String postal_code,
					String prefecture,
					String address_1,
					String address_2,
					String authority) {
		
		
		int_postal_code = Integer.parseInt(postal_code);
		
		if(gender.equals("男")) {
			int_gender=0;
		}else{
			int_gender=1;
		}
		
		if(authority.equals("一般")){
			int_authority=0;
		}else {
			int_authority=1;
		}
		
		try {
			
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1,family_name);
			preparedStatement.setString(2, last_name);
			preparedStatement.setString(3, family_name_kana);
			preparedStatement.setString(4,last_name_kana);
			preparedStatement.setString(5, mail);
			preparedStatement.setInt(6, int_gender);
			preparedStatement.setInt(7,int_postal_code);
			preparedStatement.setString(8, prefecture);
			preparedStatement.setString(9, address_1);
			preparedStatement.setString(10, address_2);
			preparedStatement.setInt(11,int_authority);
			preparedStatement.setString(12,dateUtil.getDate());
			preparedStatement.setString(13,id);
			
			update_result = preparedStatement.executeUpdate();
		
			try {
				connection.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}catch(NullPointerException e) {
			update_result = 0;
			return update_result;
			
		}catch(SQLException e) {  
			e.printStackTrace();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return update_result;
		
	}
}
