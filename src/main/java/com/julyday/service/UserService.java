package com.julyday.service;

import java.util.List;

import com.julyday.domain.User;

public interface UserService {
	public void insert(User user);
	
	public User find(int id);
	
	public List<User> getList(User user);
	
	public void update(User user);
	
	public void delete(int id);
}
