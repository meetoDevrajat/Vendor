package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialException;

import com.dao.LoginDAOImpl;
import com.service.ProductService;
import com.dao.*;
/**
 * Servlet implementation class GrizzlyController
 */
//@WebServlet("/GrizzlyController")
public class GrizzlyController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       LoginDAOImpl loginDao;
    /**
     * @see HttpServlet#HttpServlet()
     */
     
       public void init()
       {
    	   loginDao = new LoginDAOImpl();
    	   
       }
    public GrizzlyController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String action = request.getServletPath();
		switch(action)
		{
		case "/":
				//To Open the First Login From..
			loginDao.showLoginForm(request, response);
				break;
		
		default :
			loginDao.showLoginForm(request, response);
			break;
	
		
	
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
