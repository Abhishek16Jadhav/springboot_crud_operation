package com.curd.Spring_Database_Employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curd.Spring_Database_Employee.Entity.EmployeeEntity;
import com.curd.Spring_Database_Employee.dao.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao dao;
	
	public String insertData(EmployeeEntity e) {
		
		if(e.getAge()<18 || e.getAge()>60) {
			return "you are not eligible for this job";
		}
		
		if(!(e.getPassword().length()>10)) {
			return "you should contain minimum 10 character";
		}
		String str = dao.insertData(e);
		return str;
	}
	
	public String updateData(EmployeeEntity e, int emp_id) {

		if(e.getAge()<18 || e.getAge()>60) {
			return "you are not eligible for this job";
		}
		
		if(!(e.getPassword().length()>10)) {
			return "you should contain minimum 10 character";
		}
		String str = dao.updateData(e, emp_id);
		return str;
	}
	
	public String deleteData(int emp_id) {
		//chek employee exist or not
		EmployeeEntity existant = dao.getSingleData(emp_id);
		if(existant == null) {
			return " on this " + emp_id + "  employee doen't exist";
		}
		String str = dao.deleteData(emp_id);
		return str;
	}
	
	public EmployeeEntity getSingleData(int emp_id) {
		EmployeeEntity existant = dao.getSingleData(emp_id);
		if(existant == null) {
			throw new IllegalArgumentException(" on this " + emp_id + "employee doen't exist");
		}
		EmployeeEntity e = dao.getSingleData(emp_id);
		return e;
	}
	
	public List<EmployeeEntity> getAllRecord() {
		List<EmployeeEntity> list = dao.getAllRecord();
		return list;
	}

}
