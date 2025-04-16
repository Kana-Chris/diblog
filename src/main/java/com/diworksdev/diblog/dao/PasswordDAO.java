package com.diworksdev.diblog.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.diworksdev.diblog.util.DBConnector;
import com.diworksdev.diblog.util.PassUtil;


public class PasswordDAO {
	PassUtil passutil = new PassUtil();
	private String sql ="UPDATE user_info SET password = ? WHERE id = ?";
	DBConnector dbconnector = new DBConnector();
	Connection con = dbconnector.getConnection();
	
	public int updatePassword(String password,String id) {
		
		int result=0;
		try {
			String hashed_pass = passutil.password_hash(password);
			PreparedStatement preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, hashed_pass);
			preparedStatement.setString(2, id);
			result = preparedStatement.executeUpdate();
			return result;
			
		}catch(SQLException e) {
			e.printStackTrace();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		finally{
			if(con!=null) {
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
	
}
