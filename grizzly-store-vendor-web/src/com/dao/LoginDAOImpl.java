package com.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Login;
import com.util.ConnectionManager;
import java.sql.*;

public class LoginDAOImpl implements LoginDAO{
	Login l;
	ConnectionManager cm;
 public LoginDAOImpl() {
	// TODO Auto-generated constructor stub
	cm = new ConnectionManager();
}

	@Override
	public void showLoginForm(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
		rd.forward(request, response);
	}

	@Override
	public boolean validateUser(String username, String password) throws SQLException {
		
		
		
		Connection conn = cm.connect();
		System.out.println(conn);
		String q =  "Select  username and password from user where username=? and password=?";
		PreparedStatement st = conn.prepareStatement(q);
		st.setString(1,username);
		st.setString(2, password);
		ResultSet rs = st.executeQuery();
		if(rs.next())
		{
			System.out.println("has values");
		return true;
		}
		else
			return false;
		
		
	}

	@Override
	public Login showprofile(String username) throws SQLException {
		// TODO Auto-generated method stub
		Login l= null;
		Connection conn  = cm.connect();
		byte [] b ;
		System.out.println(conn);
		String q="Select user_id,designation,office,image from user where username=?";
		PreparedStatement st = conn.prepareStatement(q);
		st.setString(1, username);
		ResultSet rs = st.executeQuery();
		while(rs.next())
		{
		String user_id  = rs.getString("user_id");
		String designation = rs.getString("designation");
		String office = rs.getString("office");
		b  = rs.getBytes("image");
		String image = Base64.getEncoder().encodeToString(b);
		System.out.println(image);
		l  = new Login(user_id, designation, office,image);
		
		
		}
		return l;
		
	}

	
	
}
