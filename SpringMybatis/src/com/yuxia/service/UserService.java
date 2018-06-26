package com.yuxia.service;

import java.util.List;

import com.yuxia.entity.User;

public interface UserService {
	public List<User> findUserWithConditions(User user);
	public boolean addNewUser(User user);
}
