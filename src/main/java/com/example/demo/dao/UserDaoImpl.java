package com.example.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Override
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setUserId("naver");
		user.setUserName("kim");
		user.setUserNo(1);
		user.setUserPassword("password1234");
		users.add(user);
		
		user = new User();
		user.setUserId("kakao");
		user.setUserName("park");
		user.setUserNo(2);
		user.setUserPassword("password5678");
		users.add(user);
		
		return users;
	}

	@Override
	public User getUserByUserId(String userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User registerUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifyUser(String userId, User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteUser(String userId) {
		// TODO Auto-generated method stub
		
	}
	
}
