package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@RequestMapping("/hello")
	public String getHello() {
		return "Hii! What is your DOB?!";
	}

}
