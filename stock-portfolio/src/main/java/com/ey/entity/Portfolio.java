package com.ey.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Portfolio {
	@Id
	private int pid;
	@Column(length = 25)
	private String holder;
	@Column(length = 20)
	private String password;
	private double investment;
	
	@JsonManagedReference
	@OneToMany(mappedBy = "portfolio")
	private List<Order> orders = new ArrayList<>();

	// Getters and Setters
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getInvestment() {
		return investment;
	}
	public void setInvestment(double investment) {
		this.investment = investment;
	}

	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
}
