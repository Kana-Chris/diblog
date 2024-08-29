package com.diworksdev.diblog.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.diworksdev.diblog.util.DBConnector;
import com.diworksdev.diblog.util.DateUtil;

public class RegistCompleteDAO{
	//gender,authority をString からint型にしておく
	int result = 0;
	private int intGender;
	private int intPostal_code;
	private int intAuthority;
	
	private DBConnector dbConnector = new DBConnector();
	private Connection connection = dbConnector.getConnection();
	
	DateUtil dateUtil = new DateUtil();
	
	public int regist(String family_name,String last_name,
					  String family_name_kana,String last_name_kana,
					  String mail,String password,String gender,
					  String postal_code,String prefecture,String address_1,
					  String address_2,String authority){
		
		if(gender.equals("男")) {
			intGender = 0;
		}else if(gender.equals("女")) {
			intGender = 1;
		}
		
		if(authority.equals("一般")) {
			intAuthority = 0;
		}else if(authority.equals("管理者")){
			intAuthority = 1;
		}
		String sql ="INSERT INTO user_info (family_name,last_name,family_name_kana,last_name_kana,mail,password,"
				+ "gender,postal_code,prefecture,address_1,address_2,authority,registared_time) values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setString(1, family_name);
			preparedStatement.setString(2, last_name);
			preparedStatement.setString(3, family_name_kana);
			preparedStatement.setString(4, last_name_kana);
			preparedStatement.setString(5, mail);
			preparedStatement.setString(6, password);
			preparedStatement.setInt(7, intGender);
			preparedStatement.setInt(8,intPostal_code);
			preparedStatement.setString(9, prefecture);
			preparedStatement.setString(10,address_1);
			preparedStatement.setString(11,address_2);
			preparedStatement.setInt(12,intAuthority);
			preparedStatement.setString(13, dateUtil.getDate());
			
			result = preparedStatement.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
