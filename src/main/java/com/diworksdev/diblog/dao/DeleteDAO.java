package com.diworksdev.diblog.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.diworksdev.diblog.util.DBConnector;

public class DeleteDAO {
	DBConnector dbconnector = new DBConnector();
	private String sql = "UPDATE user_info SET delete_flag = 1 WHERE id = ?";
	
	public int Delete(String id) {
		int result =0;
		Connection connection = dbconnector.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			result = preparedStatement.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		try {
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
}
