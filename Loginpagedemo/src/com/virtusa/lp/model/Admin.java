package com.virtusa.lp.model;

public class Admin
{
	public int adminId;
	public  String name;
	public String phone;
	public String password;
	
	public Admin(int id1, String name1, String phone1, String pass) 
	{
		this.adminId=id1;
    	this.name=name1;
    	this.phone=phone1;
    	this.password=pass;
	}

	public String getPassword() 
	{
		return password;
	}
	
	public int getAdminId() 
	{
		return adminId;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public String getPhone() 
	{
		return phone;
	}
}