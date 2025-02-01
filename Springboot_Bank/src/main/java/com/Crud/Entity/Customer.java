package com.Crud.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String lastname;
	private long Account_no;
	private long mobile;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public long getAccount_no() {
		return Account_no;
	}
	public void setAccount_no(long account_no) {
		Account_no = account_no;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Customer(int id, String name, String lastname, long account_no, long mobile) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		Account_no = account_no;
		this.mobile = mobile;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", lastname=" + lastname + ", Account_no=" + Account_no
				+ ", mobile=" + mobile + "]";
	} 
	
}
