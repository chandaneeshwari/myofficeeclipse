package com.virtusa.lp.model;

public class Batch 
{
	public String batchName;
	public int batchSize;
	public String startDate;
	public String endDate;
	public String getBatchName() 
	{
		return batchName;
	}
	public void setBatchId(String batchId1) 
	{
		this.batchName = batchId1;
	}
	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}
	public int getBatchSize() 
	{
		return batchSize;
	}
	public void setBatchSize(int batchSize1) 
	{
		this.batchSize = batchSize1;
	}
	public String getStartDate() 
	{
		return startDate;
	}
	public void setStartDate(String startDate1) 
	{
		this.startDate = startDate1;
	}
	public String getEndDate() 
	{
		return endDate;
	}
	public void setEndDate(String endDate1) 
	{
		this.endDate = endDate1;
	}
}
