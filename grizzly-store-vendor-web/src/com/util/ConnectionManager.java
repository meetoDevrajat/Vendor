package com.util;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;



public class ConnectionManager {
	String jdbcURL,jdbcUser,jdbcPassword;
	Connection conn;
	public ConnectionManager()
	{
		jdbcURL = "jdbc:mysql://localhost:3306/gizzlystore";
		jdbcUser= "root";
		jdbcPassword="root";
	}

	public Connection connect() throws SQLException
	{
		if(conn==null || conn.isClosed())	
		{
			try{
				Class.forName("com.mysql.jdbc.Driver");
				
			}catch(ClassNotFoundException E)
			{
				
				E.printStackTrace();
				
			}
			conn =  DriverManager.getConnection(jdbcURL, jdbcUser, jdbcPassword);
			
			
		}
		return conn;
		
		
		
	}
}
