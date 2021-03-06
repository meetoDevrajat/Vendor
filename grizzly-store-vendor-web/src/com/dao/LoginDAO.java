package com.dao;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Login;

public interface LoginDAO {
	void showLoginForm(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException;
	public  boolean validateUser( String  username,String password)throws SQLException ;
	public Login showprofile(String username) throws SQLException ;

}
