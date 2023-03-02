package com.techinfo.cqrs.dto;

import java.io.Serializable;

public class EmployeeInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String name;
    private String address;
    private String role;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
    
    
}
