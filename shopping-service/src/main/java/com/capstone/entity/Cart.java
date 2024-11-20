package com.capstone.entity;

import javax.persistence.Entity;

import org.springframework.data.annotation.Id;

@Entity
public class Cart {
	@Id
	private int cid;
	private String custid;
	private int id;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
