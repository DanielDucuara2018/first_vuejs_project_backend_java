package com.danob22.app.ws.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danob22.app.ws.entity.User;
import com.danob22.app.ws.service.UserService;

@RestController
@RequestMapping("users") // http://localhost:8080/users
public class UserController {
	
	@Autowired
	UserService userService;
	
	//private ArrayList<User> userDetails = new ArrayList<User>();
	
	@GetMapping
	public ResponseEntity<?> getUser() {
		List<User> users = userService.getUsers();
		return ResponseEntity.ok(users);		
	}
	
	@PostMapping
	public ResponseEntity<?> createUser(@RequestBody User user) {
		User userReturned = userService.saveUser(user);
		return ResponseEntity.ok(userReturned);	
	}
	
	@PutMapping
	public String updateUser() {
		return "update user was called";
	}
	
	@DeleteMapping
	public String deleteUser() {
		return "delete user was called";
	}
	

}
