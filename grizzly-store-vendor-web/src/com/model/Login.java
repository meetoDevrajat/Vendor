package com.model;

public class Login {
	String uname,password;
	String user_id,designation,office;
	String image;
	public Login(String user_id, String designation, String office, String image) {
		super();
		this.user_id = user_id;
		this.designation = designation;
		this.office = office;
		this.image = image;
	}

	
	public String getImage() {
		return image;
	}



	public void setImage(String image) {
		this.image = image;
	}

	
	public String getUser_id() {
		return user_id;
	}



	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}



	public String getDesignation() {
		return designation;
	}



	public void setDesignation(String designation) {
		this.designation = designation;
	}



	public String getOffice() {
		return office;
	}



	public void setOffice(String office) {
		this.office = office;
	}



	public Login(String user_id, String designation, String office) {
		super();
		this.user_id = user_id;
		this.designation = designation;
		this.office = office;
	}



	public Login(String uname, String password, String user_id, String designation, String office) {
		super();
		this.uname = uname;
		this.password = password;
		this.user_id = user_id;
		this.designation = designation;
		this.office = office;
	}

	

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [uname=" + uname + ", password=" + password + ", user_id=" + user_id + ", designation="
				+ designation + ", office=" + office + "]";
	}

	public Login(String uname, String password) {
		super();
		this.uname = uname;
		this.password = password;
	}

	public Login() {
		super();
	}
	

}
