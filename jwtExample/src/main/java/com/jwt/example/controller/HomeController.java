package com.jwt.example.controller;

import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.entity.User;
import com.jwt.example.service.UserService;

@RestController

@RequestMapping("/home")
public class HomeController {

	@Autowired
	private UserService userService;

	@GetMapping("/users")
	public List<User> getUser() {
		System.out.println("gettig users");

		return userService.getUsers();

	}
	
	@GetMapping("/current-user")
	public String getLoggedInUser(Principal principal)
	{
		return "Logged User: "+ principal.getName();
		
	}
	

}
