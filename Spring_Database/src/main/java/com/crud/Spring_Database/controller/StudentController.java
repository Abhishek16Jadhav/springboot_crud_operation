package com.crud.Spring_Database.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.Spring_Database.entity.Student;
import com.crud.Spring_Database.service.Student_Service;

@RestController
public class StudentController {
		@Autowired
		Student_Service service;
		@PostMapping("/save")
		public String inserdata(@RequestBody Student s) {
			String str = service.insertdata(s);
			return str;
		}
		
		@DeleteMapping("/deletedata/{studid}")
		public String deletedata( @PathVariable ("studid") int id) {
			String str = service.deletedata(id); 
			return str;
			
		}
		
		@PutMapping("/updatedata/{id}")
		public String updatedata(@RequestBody Student s ,@PathVariable int id) {
			String str = service.updatedata(s, id);
			return str;
			
		}
		
//		@GetMapping("/getdata/{id}")
//		public Student readdata(@PathVariable int id) {
//			Student s = service.getSingleData(id);
//			return s;
//			or
//		}
		
		
		@GetMapping("/getdata")
		public Student readdata(@RequestParam int id) {
			Student s = service.getSingleData(id);
			return s;
		}
		
		@GetMapping("/getallData")
		public List<Student> getallData() {
			List<Student> list = service.getallData();
			return list;
		}
}
