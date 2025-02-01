package com.curd.Spring_Database_Employee.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int emp_id;
	private String name;
	private String city;
	private int age;
	private String email;
	private String branch;
	private String password;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeEntity(int emp_id, String name, String city, int age, String email, String branch, String password) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.city = city;
		this.age = age;
		this.email = email;
		this.branch = branch;
		this.password = password;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [emp_id=" + emp_id + ", name=" + name + ", city=" + city + ", age=" + age + ", email="
				+ email + ", branch=" + branch + ", password=" + password + "]";
	}
	
	
	

}
