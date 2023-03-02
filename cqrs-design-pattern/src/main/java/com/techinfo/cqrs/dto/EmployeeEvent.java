package com.techinfo.cqrs.dto;

import java.io.Serializable;


public class EmployeeEvent implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private String uid;
    private String name;
    private String address;
    private String role;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
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
