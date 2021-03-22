package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public User getUserByUserId(String userId) {
		return userDao.getUserByUserId(userId);
	}


	@Override
	public User registerUser() {
		return userDao.registerUser();
	}

	@Override
	public void modifyUser(String userId, User user) {
		userDao.modifyUser(userId, user);
	}

	@Override
	public void deleteUser(String userId) {
		userDao.deleteUser(userId);
	}

	
}
