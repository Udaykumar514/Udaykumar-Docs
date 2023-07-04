package com.spring.mydairy.services;

import java.util.List;

import com.spring.mydairy.entities.User;

public interface UserServices {

	public void save(User user);
	public void update(User user);
	public void delete(User user);
	public User findById(long id);
	public List<User>  findAll();
	public User findByUserName(String username);
	
}
