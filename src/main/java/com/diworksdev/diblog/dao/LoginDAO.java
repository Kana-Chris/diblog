package com.diworksdev.diblog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.diworksdev.diblog.dto.LoginDTO;
import com.diworksdev.diblog.util.DBConnector;


public class LoginDAO {
  private String sql="SELECT password FROM user_info WHERE mail=?";
  LoginDTO loginDTO = new LoginDTO();
  DBConnector dbconnector = new DBConnector();
  
  public LoginDTO login(String mail) {
	  
	  Connection connection = dbconnector.getConnection();
	  
	  try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1,mail);
		ResultSet rs =preparedStatement.executeQuery();
			if(rs.next()) {
				
				loginDTO.setPassword(rs.getString("password"));
			}
			
	  }catch(SQLException e) {
		  e.printStackTrace();
	  }
	  
	  try{
		  connection.close();
	  }catch(SQLException e) {
		 e.printStackTrace(); 
	  }
	  
	  
    return loginDTO;
	
  }
}
