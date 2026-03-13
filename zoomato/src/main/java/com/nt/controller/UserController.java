package com.nt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nt.service.UserService;
import com.nt.userRegister.UserRegistration;

@RestController
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public String getUserDetails(@RequestBody UserRegistration registration) {
		String response=userService.getUserDetails(registration);
		return response;
	}
	@GetMapping("/demo")
	public String getAllDetails() {
		return "hello i am login";
	}
	
	
}
