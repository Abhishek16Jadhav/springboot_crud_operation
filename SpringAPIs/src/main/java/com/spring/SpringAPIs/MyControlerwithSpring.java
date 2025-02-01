package com.spring.SpringAPIs;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;


@RestController
@RequestMapping("collage")
public class MyControlerwithSpring {
	@RequestMapping(value = "/DYP" , method = RequestMethod.PUT)
	public String firstAPI() {
		return "D.Y.PATIL collage";
	}
	@RequestMapping(value = "/PCCO", method = RequestMethod.GET)
	public String secondAPI() {
		return "pimpri chinchwad collage";
	}
	@RequestMapping(value = "/jspm" , method = RequestMethod.DELETE)
	public String thirdAPI() {
		return "rejeshree shahu collage";
	}
	@RequestMapping(value = "/alard" , method = RequestMethod.POST)
	public String fourthAPI() {
		return "alard collage engg";
	}
	
	
	
}
