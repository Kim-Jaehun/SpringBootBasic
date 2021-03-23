package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.model.User;

@Mapper
public interface UserDao {

	List<User> getAllUsers();

	User getUserByUserId(User user);

	int registerUser(User user);

	int modifyUser(User user);

	int deleteUser(User user);

}
