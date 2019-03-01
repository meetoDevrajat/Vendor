
<%@page import="com.dao.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import= "java.util.*" %>
    <%@ page import = "com.model.Product" %>
     <%@ page import = "com.model.Login" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
img {
  border-radius: 50%;
}
.tab {
  overflow: hidden;
  border: 1px solid #ccc;
  background-color: #f1f1f1;
}

/* Style the buttons inside the tab */
.tab button {
  background-color: inherit;
  float: left;
  border: none;
  outline: none;
  cursor: pointer;
  padding: 14px 16px;
  transition: 0.3s;
  font-size: 17px;
}

/* Change background color of buttons on hover */
.tab button:hover {
  background-color: #ddd;
}

/* Create an active/current tablink class */
.tab button.active {
  background-color: #ccc;
}

/* Style the tab content */
.tabcontent {
  display: none;
  padding: 6px 12px;
  border: 1px solid #ccc;
  border-top: none;
}

/* Style the close button */
.topright {
  float: right;
  cursor: pointer;
  font-size: 28px;
}

.topright:hover {color: red;}
.card {
  box-shadow: 5px 10px 8px #888888;
  max-width: 300px;
  margin: auto;
  text-align: center;
  font-family: Serif;
   border: 1px solid;
  padding: 20px;
}
nav {
  float: left;
  width: 25%;
  height: 400px; 
  background: #FFFFFF;
  padding: 20px;
  margin-top:62px;
}

article {
  float: left;
  padding: 20px;
  width: 70%;
  background-color: #FFFFFF;
  height: 300px; 
}

section:after {
  content: "";
  display: table;
  clear: both;
}
@media (max-width: 600px) {
  nav, article {
    width: 100%;
    height: auto;
  }
}
* {box-sizing: border-box;}

.body {
  margin: 0;
  font-family: Arial, Helvetica, sans-serif;
}
.title {
  color: grey;
  font-size: 18px;
}

.topnav {
  overflow: hidden;
  background-color: #757575;
}
.topnav {
    background-color: #333;
    overflow: hidden;
}
.topnav a {
  float: left;
  display: block;
  color: black;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
  font-size: 17px;
}

.topnav a:hover {
  background-color: #ddd;
  color: black;
}

.topnav a.active {
 font-size:40px;
  color: white;
}

.topnav .search-container {
  float: right;
}

.topnav input[type=text] {
  padding: 6px;
  margin-top: 8px;
  font-size: 17px;
  border: none;
}

.topnav .search-container button {
  float: right;
  padding: 6px 10px;
  margin-top: 8px;
  margin-right: 16px;
  background: #ddd;
  font-size: 17px;
  border: none;
  cursor: pointer;
}

.topnav .search-container button:hover {
  background: #ccc;
  
}

@media screen and (max-width: 600px) {
  .topnav .search-container {
    float: none;
  }
  .topnav a, .topnav input[type=text], .topnav .search-container button {
    float: none;
    display: block;
    text-align: left;
    width: 100%;
    margin: 0;
    padding: 14px;
  }
  .topnav input[type=text] {
    border: 1px solid #ccc;  
  }
}

.button {
  background-color:#757575; 
  border: none;
  color: white;
  padding: 10px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
  font-size: 16px;
  margin: 4px 2px;
  cursor: pointer;
}
.button4 {border-radius: 24px;}
</style>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<div class="topnav">
  <a class="active" href="#home">Grizzly Store</a>
  
  <div class="topnav-right">
   <input type="text" placeholder="Search.." name="search">
    
  </div>

  <div class="search-container">
  
    <form action="Product.jsp">
     
     
     
    </form>
  </div>
</div>

<header>
  
</header>
<% List<Product> list = (ArrayList<Product>)session.getAttribute("productdetails"); %>
<%Login Llist = (Login)session.getAttribute("userdetails"); %>
<section>
  <nav>
  
<div class="card">

  <img src="data:image/jpg;base64",<% Llist.getImage(); %>/>
  
  		<p class="title">ID</p>
  <p><% out.print(Llist.getUser_id()); %></p>
  		<p class="title">Designation</p>
  <p><% out.print(Llist.getDesignation()); %></p>
  		<p class="title">Office</p>
  <p><% out.print(Llist.getOffice()); %></p>
  <div style="margin: 24px 0;">
    
  </div>
  </nav>
  
  <article>
      <div class="table-responsive">  
       
      <div class="tab">
  <button class="tablinks" onclick="openCity(event, 'London')" id="defaultOpen">Products</button>
  <button class="tablinks" onclick="openCity(event, 'Paris')">Inventory</button>
 
</div>

<div id="London" class="tabcontent">
  <span onclick="this.parentElement.style.display='none'" class="topright">&times</span>
  
 
</div>

<div id="Paris" class="tabcontent">
  <span onclick="this.parentElement.style.display='none'" class="topright">&times</span>
 

</div>      
  <table  border="2" class="table table-striped">
    <thead>
      <tr>
     
      	 <th  bgcolor="#FAFAFA">Name</th>
        <th  bgcolor="#FAFAFA">Category</th>
        <th   bgcolor="#FAFAFA">Price</th>
        <th  bgcolor="#FAFAFA">Rating</th>
        <th   bgcolor="#FAFAFA">Brand</th>
      
       <th></th>
       <th></th>
       <th></th>
       
      </tr>
    </thead>
		<%for(Product p :list)
		{
			
			out.print("<tr><td>"+p.getName()+"</td><td>"+p.getCategory()+"</td><td>"+p.getPrice()+"Rs</td><td>"+p.getRating()+"</td><td>"+p.getBrand()+"</td><td><a href=>Block</a></td><td><a href=del?id="+p.getProductId()+">Remove Product</a></td><td><a href=view?id="+p.getProductId()+">View Description</a></td></tr>");
		}
		
		%>
  </table>
  
  <a  href=new><button class="button button4 pull-right">Add Product</button></a>
  
  </div>
  
   

  </article>
</section>

	

</body>
</html>