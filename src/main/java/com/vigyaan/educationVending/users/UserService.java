package com.vigyaan.educationVending.users;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
    @Autowired
	private UserRepository user_repo;
    
	//user list - data obtained from database
   
	public List<user> getAllUsers() {
		
		List<user> ulist = new ArrayList<>();
		 user_repo.findAll()
		 .forEach(ulist::add);
		
		 return ulist;
	}

	public void addUser(user u) {
		user_repo.save(u);
		
	}

	
}
