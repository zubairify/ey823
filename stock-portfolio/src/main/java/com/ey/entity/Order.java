package com.ey.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "orders")
public class Order {
	@Id
	@GeneratedValue
	private int oid;
	private int quantity;
	@Column(name = "txn_type", length = 8)
	private String txnType;
	@Column(name = "txn_date")
	private LocalDate txnDate;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "sid")
	private Stock share;
	
	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "pid")
	private Portfolio portfolio;

	// Getters and Setters
	public int getOid() {
		return oid;
	}
	public void setOid(int oid) {
		this.oid = oid;
	}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getTxnType() {
		return txnType;
	}
	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public LocalDate getTxnDate() {
		return txnDate;
	}
	public void setTxnDate(LocalDate txnDate) {
		this.txnDate = txnDate;
	}

	public Stock getShare() {
		return share;
	}
	public void setShare(Stock share) {
		this.share = share;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}
	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}
}
