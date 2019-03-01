package com.dao;

import java.sql.SQLException;
import com.model.*;
import java.util.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface ProductDAO {
	
	public  List<Product> listallproduct() throws SQLException;

	int insertProduct(Product product) throws SQLException;

	public int deleteProduct(HttpServletRequest request,HttpServletResponse response) throws SQLException;
	 

	public String view(String id) throws SQLException;
	
	

}
