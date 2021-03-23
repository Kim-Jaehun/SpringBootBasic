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
	
	private User user;
	
	@Override
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	public User getUserByUserId(String userId) {
		user = new User();
		user.setUserId(userId);
		return userDao.getUserByUserId(user);
	}


	@Override
	public void registerUser(User user) {
		int count = userDao.registerUser(user);
		System.out.println("등록 갯수 : " + count);
	}

	@Override
	public void modifyUser(String userId, User user) {
		user = new User();
		user.setUserId(userId);
		int count = userDao.modifyUser(user);
		System.out.println("수정 갯수 : " + count);
	}

	@Override
	public void deleteUser(String userId) {
		user = new User();
		user.setUserId(userId);
		int count = userDao.deleteUser(user);
		System.out.println("삭제 갯수 : " + count);
	}

	
}
