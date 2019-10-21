package com.virtusa.lp.model;

import java.util.ArrayList;

public class Venue 
{
	public String venueName;
	public String location;
	public int capacity;
	 public Venue(int cap,String name1,String loc)
	    {
	    	this.venueName=name1;
	    	this.location=loc;
	    	this.capacity=cap;
	    }
	
	public String getVenueName() 
	{
		return venueName;
	}
	public void setVenueName(String venueName1) 
	{
		venueName = venueName1;
	}
	public String getLocation() 
	{
		return location;
	}
	public void setLocation(String location1) 
	{
		location = location1;
	}
	public int getCapacity() 
	{
		return capacity;
	}
	public void setCapacity(int capacity1) 
	{
		capacity = capacity1;
	}
}