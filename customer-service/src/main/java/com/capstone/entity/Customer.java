package com.capstone.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Customer {
	@Id
	private String custid;
	@Column(length = 30)
	private String name;
	@Column(length = 15)
	private String password;
	@Column(length = 11)
	private String mobile;
	@Column(length = 30)
	private String email;
	
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
