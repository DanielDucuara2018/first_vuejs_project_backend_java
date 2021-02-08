package com.danob22.app.ws.ui.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.danob22.app.ws.ui.model.request.UserDetailsRequestModel;

@RestController
@RequestMapping("users") // http://localhost:8080/users
public class UserController {
	
	private ArrayList<UserDetailsRequestModel> userDetails = new ArrayList<UserDetailsRequestModel>();
	
	@GetMapping
	public ResponseEntity<ArrayList<UserDetailsRequestModel>> getUser() {		
		return new ResponseEntity<ArrayList<UserDetailsRequestModel>>(this.userDetails, HttpStatus.OK);		
	}
	
	@PostMapping
	public ResponseEntity<UserDetailsRequestModel> createUser(@RequestBody UserDetailsRequestModel userDetails) {
		this.userDetails.add(userDetails);
		return new ResponseEntity<UserDetailsRequestModel>(userDetails, HttpStatus.OK);		
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
