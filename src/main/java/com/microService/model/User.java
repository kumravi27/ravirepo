package com.microService.model;

import java.util.List;

public class User {
	private String name;
	private String title;
	private String address;
	private List <String> phone;
	private String dob;
	
	public User(String name, String title,String address,List<String> phonelist,String dob){
		this.name = name;
		this.title =title;
		this.address = address;
		this.phone = phonelist;
		this.dob = dob;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public List<String> getPhone() {
		return phone;
	}

	public void setPhone(List<String> phone) {
		this.phone = phone;
	}

	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
	
}
