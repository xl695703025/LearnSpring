package com.yuxia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuxia.entity.User;
import com.yuxia.mapper.UserMapper;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	public List<User> findUserWithConditions(User user) {
		return userMapper.getUserList(user);
	}
	public boolean addNewUser(User user) {
		boolean res=false;
		
			try {
				if(userMapper.add(user)==1){
					res=true;
				}
			} catch (RuntimeException e) {
				e.printStackTrace();
				throw e;
			}
		return res;
	}
	public UserMapper getUserMapper() {
		return userMapper;
	}
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}
	
}
