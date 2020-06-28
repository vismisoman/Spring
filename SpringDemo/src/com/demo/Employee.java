package com.demo;

public class Employee {
	//Attributes
	int eid;
	String ename;
	int salary;
	Address address;
	
	//Constructors
	public Employee() {
		System.out.println("Employee object contructed");
	}
	//Constructor Injection
	public Employee(Address address) {
		this.address = address;
	}
	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Address getAddress() {
		return address;
	}

	//Setter Injection
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", salary=" + salary + ", address=" + address + "]";
	}
	
	public void myInit() {
		System.out.println("Object Initialized ");
	}
	public void myDestory() {
		System.out.println("Object destroyed ");
	}
}
