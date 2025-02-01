package com.spring.SpringAPIs;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Classes")
public class MyContrllerwithSpringBOOT {
	
	
	@PostMapping("/TKA")
	public String firstAPI() {
		return "THE KIRAN ACADEMY";
	}
	
	@DeleteMapping("/Seven")
	public String secondAPI() {
		return "The seven mentor";
		
	}
	
	@PutMapping("/author")
	public String thirdAPI() {
		return "the author class";
		
	}
	@PutMapping("/IT")
	public String fourthAPI() {
		return "the IT solution class";
		
	}
	
	

}
