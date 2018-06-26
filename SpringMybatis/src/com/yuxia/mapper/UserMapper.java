package com.yuxia.mapper;

import java.util.List;

import com.yuxia.entity.User;

public interface UserMapper {

	public List<User> getUserList(User user);
	public int add(User user);
}
