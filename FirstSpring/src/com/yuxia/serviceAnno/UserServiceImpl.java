package com.yuxia.serviceAnno;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

	public void save() {
		System.out.println("sava方法");
		
	}

	public void display() {
		System.out.println("dispaly方法");
	}

}
