package com.diworksdev.diblog.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.diworksdev.diblog.dto.LoginDTO;
import com.diworksdev.diblog.util.DBConnector;


public class LoginDAO {
  private int connectionError=0;  //1→データベース接続エラー
  private String sql="SELECT password,authority FROM user_info WHERE mail=?";
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
				loginDTO.setAuthority(rs.getString("authority"));
			}

	  
	  }catch(SQLException e) {
		  setConnectionError(1);
	  }catch(Exception e) {
		  e.printStackTrace();
		  setConnectionError(1);
	  }
	  finally {
		 if(connection!=null) {
			try {
				connection.close();
			}catch (SQLException e) {
				e.printStackTrace();		
			}
		}
	  }
	  
    return loginDTO;
	
  }
  public void setConnectionError(int connectionError) {
	  this.connectionError = connectionError;
  }
  public int getConnectionError() {
	  return connectionError;
  }
}
