package com.curd.Spring_Database_Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.curd.Spring_Database_Employee.Entity.EmployeeEntity;
import com.curd.Spring_Database_Employee.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;

	@PostMapping("/insert")
	public String insertData(@RequestBody EmployeeEntity e) {
		String str = service.insertData(e);
		return str;
	}

	@PutMapping("/update/{emp_id}")
	public String updateData(@RequestBody EmployeeEntity e, @PathVariable int emp_id) {
		String str = service.updateData(e, emp_id);
		return str;
	}

	@DeleteMapping("/delete/{id}")
	public String deleteData(@PathVariable("id") int emp_id) {
		String str = service.deleteData(emp_id);
		return str;
	}
	@GetMapping("/fatch")
	public EmployeeEntity getSingleData(@RequestParam int emp_id) {
		EmployeeEntity e = service.getSingleData(emp_id);
		return e;
	}
	@GetMapping("/fatching")
	public List<EmployeeEntity> getAllData() {
		 List<EmployeeEntity> list = service.getAllRecord();
		 return list;
	}

}
