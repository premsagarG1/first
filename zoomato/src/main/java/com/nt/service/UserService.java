package com.nt.service;

import org.springframework.stereotype.Service;

import com.nt.userRegister.UserRegistration;
@Service
public class UserService {

	public String getUserDetails(UserRegistration registration) {
		System.out.println(registration.getEname());
		System.out.println(registration.getMobile());
		return "register successfully";
	}
}
