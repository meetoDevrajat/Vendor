package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Product;
import com.service.ProductService;

/**
 * Servlet implementation class ProductController
 */

//@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  ProductService ps;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        ps  = new ProductService();//initialize the object in the constructor
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String action = request.getServletPath();//getting the path of the servlet.so that which  one is called
		System.out.println(action);
		switch(action)
		{
		case "/ProductController":
			 
			  try {
			 ps.getallbooks(request, response);//for showing the all products in the database
			break;
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		case "/new":
				try {
					ps.addProduct(request, response);
				} catch (Exception e) {
					// TODO: handle exception
				}
					
			break;
		case "/NewProduct": //adding the new product in the database 
			try {
				ps.addnewProduct(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		case "/del":			//To removing the product from the datbase
			try {
				ps.removeproduct(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		case "/view":
			  try {
				ps.viewproduct(request, response);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		case "/back":
			try {
				ps.backbutton(request, response);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		
	
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
