package com.dao;


import java.sql.*;

import com.model.Product;
import com.service.ProductService;
import com.util.ConnectionManager;
import java.util.*;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProductDAOImpl implements ProductDAO{
		Product p;
		
	ConnectionManager cm;
	 public ProductDAOImpl() {
		// TODO Auto-generated constructor stub
		cm = new ConnectionManager();
		
	}
	@Override
	public List<Product> listallproduct() throws SQLException {
		// TODO Auto-generated method stub
		Connection conn = cm.connect();
		String q = "Select productid,category,brand,rating,price,name from product";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(q);
		List<Product> productlist  = new ArrayList<>();
		while(rs.next())
		{
			int productid = rs.getInt("productid");
			String category = rs.getString("category");
			String name = rs.getString("name");
			String brand = rs.getString("brand");
			int rating = rs.getInt("rating");
			float price = rs.getFloat("price");
			p =  new Product(productid, name, category, rating, price, brand);
					
					
					
			productlist.add(p);
		}
		return productlist;
		
	}
	@Override
	public int insertProduct(Product product) throws SQLException {
		Connection conn = cm.connect();
			String sql = "INSERT INTO product (category,description,price,rating,brand,name) VALUES(?,?,?,?,?,?)";
			System.out.println(product);
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1,product.getCategory());
			ps.setString(2,product.getDescription());
			ps.setFloat(3,product.getPrice());
			ps.setInt(4,product.getRating());
			ps.setString(5,product.getBrand());
			ps.setString(6,product.getName());
			
			int a= ps.executeUpdate();
			
			return a;
			
			
			
			
			
		
	}

	public int deleteProduct(HttpServletRequest request,HttpServletResponse response) throws SQLException
	{
		Connection conn = cm.connect();
		String productid = request.getParameter("id");
		String q = "Delete from  product where productid =?";
		
		PreparedStatement ps = conn.prepareStatement(q);
		ps.setString(1, productid);
		int a= ps.executeUpdate();
		return a;
	}
	@Override
	public String view(String id) throws SQLException {
		Connection conn = cm.connect();
		
		String q = "Select description from product where productid =?";
		
		PreparedStatement ps = conn.prepareStatement(q);
		ps.setInt(1, Integer.parseInt(id));
		ResultSet rs = ps.executeQuery();
		String desc ="";
		if(rs.next())
		desc = rs.getString("description");
		
		return desc;
	}

	

	




	
	

	
}
