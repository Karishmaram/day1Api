package com.karishma.restApi.day2.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class day2 {
	@Value("${StudentName}")
	
           private String StudentName;
           
	@GetMapping("getname")
	public String getName() {
		return "Name is: " + StudentName;
	}
}




























