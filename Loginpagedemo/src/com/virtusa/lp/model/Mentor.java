package com.virtusa.lp.model;
public class Mentor 
{
    public int mentorId;
    public String name;
    public String phone;
    public String password;
    public Mentor(int id1,String name1,String phone1,String pass)
    {
    	this.mentorId=id1;
    	this.name=name1;
    	this.phone=phone1;
    	this.password=pass;
    }
    public String getPassword()
    {
        return password;
    }
   
    public int getMentorId()
    {
    	return mentorId;
    }
   
    public String getPhone()
    {
    	return phone;
    }
    
    public String getName()
    {
    	return name;
    }
}