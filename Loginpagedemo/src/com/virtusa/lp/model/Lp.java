package com.virtusa.lp.model;

public class Lp 
{
    public int empId;
    public String name;
    public long phone;
    private String password;
    public int mark;
	
    public Lp(int id, String nam, long phon, String pass) {
		this.empId=id;
    	this.name=nam;
    	this.phone=phon;
    	this.password=pass;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getMark() 
    {
		return mark;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public int getEmpId() 
	{
		return empId;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public long getPhone() 
	{
		return phone;
	}
	
}
