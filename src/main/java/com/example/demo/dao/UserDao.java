package com.example.demo.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.User;

@Repository
public interface UserDao {

	List<User> getAllUsers();

	User getUserByUserId(String userId);

	User registerUser();

	void modifyUser(String userId, User user);

	void deleteUser(String userId);

}
