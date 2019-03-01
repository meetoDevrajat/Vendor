package com.model;

public class Product {
	int productId =0,rating=0;
	float price = 0.0f;
	String category = "",Description ="",brand="",name="",username="";
	public String getUsername() {
		return username;
	}






	public void setUsername(String username) {
		this.username = username;
	}
	

	public Product(int productId, String name, String category, int rating, float price, String brand) {
		super();
		this.productId = productId;
		this.name = name;
		this.category = category;
		this.rating = rating;
		this.price = price;
		this.brand = brand;
	}
	




	
	public Product(int rating, String category, String description, String brand, String name, float price) {
		super();
		this.rating = rating;
		this.category = category;
		this.Description = description;
		this.brand = brand;
		this.name = name;
		this.price = price;
	}

	

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Product(String category, int rating, String description, String brand, float price) {
		super();
		this.rating = rating;
		this.category = category;
		this.Description = description;
		this.brand = brand;
		this.price = price;
	}

	public Product(int productId, int rating, String category, String brand, float price) {
		super();
		this.productId = productId;
		this.rating = rating;
		this.category = category;
		this.brand = brand;
		this.price = price;
	}
	
	public Product(int productId, int rating, String category, String description, String brand, float price) {
		super();
		this.productId = productId;
		this.rating = rating;
		this.category = category;
		this.Description = description;
		this.brand = brand;
		this.price = price;
	}
	
	

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", rating=" + rating + ", category=" + category + ", Description="
				+ Description + ", brand=" + brand + ", name=" + name + ", price=" + price + "]";
	}
	


	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		this.Description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	

}
