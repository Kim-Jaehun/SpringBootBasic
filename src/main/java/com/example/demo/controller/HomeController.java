package com.example.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/user")
public class HomeController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/{userid}")
	public User getUserByUserId(@PathVariable("userId") String userid) {
		return userService.getUserByUserId(userid);
	}
	
	@PostMapping("")
	public User registerUser(@RequestBody User user) {
		return userService.registerUser();
	}
	
	@PutMapping("/{userid}")
	public void modifyUser(
			@PathVariable("userId") String userId, @RequestBody User user) {
		userService.modifyUser(userId, user);
	}
	
	@DeleteMapping("/{userid}")
	public void deleteUser(
			@PathVariable("userId") String userId) {
		userService.deleteUser(userId);
	}
	
}
