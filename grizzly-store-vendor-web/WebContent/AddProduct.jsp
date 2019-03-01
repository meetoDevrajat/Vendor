<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>AddProduct</title>
</head>
<body>
<link href="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/css/bootstrap-combined.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//netdna.bootstrapcdn.com/twitter-bootstrap/2.3.2/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<div class="container">
	<div class="row-fluid">
      <form  action = "NewProduct" class="form-horizontal">
        <fieldset>
          <div id="legend">
            <legend class="">Add the Product Details</legend>
          </div>
     
        
          <div class="control-group">
            <label class="control-label"  for="username">Name</label>
            <div class="controls">
              <input type="text"  name="name" placeholder="" class="input-xlarge">
            </div>
          </div>
     
       
          <div class="control-group">
            <label class="control-label" for="email">Category</label>
            <div class="controls">
              <input type="text" name="category" placeholder="" class="input-xlarge">
            </div>
          </div>
     
         
        <div class="control-group">
            <label class="control-label" for="email">Rating</label>
            <div class="controls">
              <input type="text"   name="rating" placeholder="" class="input-xlarge">
            </div>
          </div>
     
        <div class="control-group">
            <label class="control-label" for="email">Price</label>
            <div class="controls">
              <input type="text" name="price" placeholder="" class="input-xlarge">
            </div>
          </div>
     	 <div class="control-group">
            <label class="control-label" for="email">Brand</label>
            <div class="controls">
              <input type="text"   name="brand" placeholder="" class="input-xlarge">
            </div>
            
             <div class="control-group">
             
            <label class="control-label" for="email">Description</label>
            <div class="controls">
              <input type="text" name="description" placeholder="" class="input-xlarge">
            </div>
          
        
     
          <!-- Submit -->
          
          <div class="control-group">
            <div class="controls">
          <button class="btn btn-success">Submit</button>
            </div>
          </div>
     
        </fieldset>
      </form>
    </div>
</div>
</body>
</html>