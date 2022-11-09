package com.javaprogram.lms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaprogram.lms.model.User;
import com.javaprogram.lms.repository.UserRepository;
import com.javaprogram.lms.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User addUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User getUserById(Long userId) {
		return userRepository.findById(userId).get();
	}

	@Override
	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}

	@Override
	public User updateUser(User user) {

		User existingUser = userRepository.findById(user.getUserId()).get();

		existingUser.setUserName(user.getUserName());
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setAddress(user.getAddress());
		existingUser.setDob(user.getDob());
		existingUser.setAge(user.getAge());

		return userRepository.save(existingUser);
	}

}
