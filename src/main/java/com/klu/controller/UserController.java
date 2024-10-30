package com.klu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.klu.model.Users;
import com.klu.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/users")
	public List<Users> getAllUsers() {

		return userService.getAllUsers();
	}

	@RequestMapping(value = "/users/{id}")
	public Users getUser(@PathVariable String id) {
		return userService.getUser(id);
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public void addUser(@RequestBody Users user) {
		userService.addUser(user);
	}
	
	
	@RequestMapping(value="/users/{id}", method = RequestMethod.PUT)
	public void getUser(@PathVariable String id, @RequestBody Users user) {

	    userService.updateUser(id, user);

	}
	
	
	 @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
	 public void deleteUser(@PathVariable String id) {
	      userService.deleteUser(id);
	 }

}
