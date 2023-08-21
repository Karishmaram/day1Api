package com.karishma.restApi.day1.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@GetMapping("/welcome")
	public String Welcome() {
		return "Welcome String Boot!";
	}
	@GetMapping("/get")
	public String getName() {
		String studentName="IamNeo";
		return "Welcome "+studentName+"!";
	}
	@GetMapping("/color")
	public String getMyFav() {
		String getFavColor="Green";
		return "My favorite color is "+getFavColor;
	}

}
	


