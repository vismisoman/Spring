package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // telling the spring contianer that we need a bean
public class Customers {
	
	private int custId;
	private String custName;
	private String courseName;
	@Autowired
	private Technologies techDetails;
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	

public Technologies getTechDetails() {
		return techDetails;
	}
	public void setTechDetails(Technologies techDetails) {
		this.techDetails = techDetails;
	}
public void display(){

System.out.println("Object created succcessfully");
techDetails.tech();
}	
	
}
