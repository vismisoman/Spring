package com.demo;

public class CustomerService1{

	private String name;
	private String  url;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public void printName() {
		System.out.println("Customer Name: "+this.name);
	}
	public void printUrl() {
		System.out.println("Cutomer URL "+this.url);
	}
	public void printThrowException() {
		throw new IllegalArgumentException();
	}
}
