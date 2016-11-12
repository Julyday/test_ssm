package com.julyday.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julyday.dao.UserDao;
import com.julyday.domain.User;
import com.julyday.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	@Override
	public void insert(User user) {
		userDao.insert(user);
	}

	@Override
	public User find(int id) {
		return userDao.find(id);
	}

	@Override
	public List<User> getList(User user) {
		return userDao.getList(user);
	}

	@Override
	public void update(User user) {
		userDao.update(user);
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}

}
