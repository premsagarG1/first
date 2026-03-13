package com.nt.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value = "/user")
	//@ResponseBody
	public String GetTest() {
		return " i am still live";
	}
}
