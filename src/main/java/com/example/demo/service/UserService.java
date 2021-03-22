package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.model.User;

@Service
public interface UserService {

	List<User> getAllUsers();

	User getUserByUserId(String userId);

	User registerUser();

	void modifyUser(String userId, User user);

	void deleteUser(String userId);

}
