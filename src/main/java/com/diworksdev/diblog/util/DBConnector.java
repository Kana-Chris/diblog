package com.diworksdev.diblog.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	private String driverName = "org.mariadb.jdbc.Driver";
	private String url = "jdbc:mysql://localhost/dibrog";	
	private String user = "root";
	private String password = "";
	
	public Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName(driverName);
			connection = DriverManager.getConnection(url,user,password);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
	
}
