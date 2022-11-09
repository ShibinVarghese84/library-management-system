package com.javaprogram.lms.service;

import java.util.List;

import com.javaprogram.lms.model.User;

public interface UserService {

	public User addUser(User user);

	public List<User> getAllUsers();

	public User getUserById(Long userId);

	public void deleteUser(Long userId);

	public User updateUser(User user);

}
