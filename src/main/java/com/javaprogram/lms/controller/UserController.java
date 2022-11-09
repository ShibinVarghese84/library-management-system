package com.javaprogram.lms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaprogram.lms.model.User;
import com.javaprogram.lms.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/adduser")
	public User addUser(@RequestBody User user) {
		return userService.addUser(user);
	}

	@GetMapping("/listusers")
	public List<User> listAllUsers() {
		return userService.getAllUsers();
	}

	@PostMapping("/updateuser")
	public User updateUser(@RequestBody User user) {
		return userService.updateUser(user);
	}

	@DeleteMapping("/deleteuser/{userId}")
	public void deleteUser(@PathVariable Long userId) {
		userService.deleteUser(userId);
	}

	@GetMapping("/listuserbyid/{userId}")
	public User listUserById(@PathVariable Long userId) {
		return userService.getUserById(userId);
	}

}
