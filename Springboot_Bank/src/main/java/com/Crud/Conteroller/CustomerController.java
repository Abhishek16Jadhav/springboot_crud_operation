package com.Crud.Conteroller;

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

import com.Crud.Entity.Customer;
import com.Crud.Service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	CustomerService service;
	
	@PostMapping("/insert")
	public String inserData(@RequestBody Customer c) {
		String str = service.insertData(c);
		return str;
	}
	
	@DeleteMapping("/delete/{cust_ID}")
	public String deletData(@PathVariable("cust_ID") int id) {
		String str = service.deleteData(id);
		return str;
	}
	
	@PutMapping("/update/{id}")
	public String updateData(@RequestBody Customer c,@PathVariable int id) {
		String str = service.updateData(c, id);
		return str;	
	}
	@GetMapping("/fatch")
	public Customer getSingleData(@RequestParam int id) {
		Customer c1 = service.GetSingleData( id);
		return c1;
		
	}
	@GetMapping("/allrecord")
	public List<Customer> getAllData(){
		List<Customer> list = service.GetAllData();
		return list;
	}
}
