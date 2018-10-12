package com.vigyaan.educationVending.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class UserController {
	
	@Autowired
	private UserService user_service;
	
	
	//to get all registered users
	@RequestMapping("/users")
	public List<user> getAllUsers(){
		return user_service.getAllUsers();
	}
	
	@RequestMapping(method=RequestMethod.POST , value="/adduser")
	public void addUser(@RequestBody user u ) {		//request is converted to the body and added to the list
		user_service.addUser(u);
	}
	
	
}
