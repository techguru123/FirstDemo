package com.example.demo.controllers;

import java.lang.reflect.Array;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;

@RestController
public class UserController {
	
	User user = new User();

	@RequestMapping("/hello")
	public User getHello() {
		user.setId(1);
		user.setName("Mohit");
		return user;
	}

}
