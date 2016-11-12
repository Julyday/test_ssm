package com.julyday.dao;

import java.util.List;

import com.julyday.annotation.JulydayRepository;
import com.julyday.domain.User;

@JulydayRepository
public interface UserDao {
	public void insert(User user);
	
	public User find(int id);
	
	public List<User> getList(User user);
	
	public void update(User user);
	
	public void delete(int id);
}
