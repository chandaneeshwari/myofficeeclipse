package com.virtusa.lp.model;

public class Module 
{
	public int moduleId;
    public String startDate;
    public String endDate;
    public String topic;
    public Module(int id, String sDate, String eDate, String topic2) {
		this.moduleId=id;
		this.startDate=sDate;
		this.endDate=eDate;
		this.topic=topic2;
		
	}
	public int getModuleId() {
		return moduleId;
	}
	public void setModuleId(int moduleId) {
		this.moduleId = moduleId;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
}