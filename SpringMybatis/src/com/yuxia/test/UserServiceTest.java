package com.yuxia.test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yuxia.entity.User;
import com.yuxia.service.UserService;

public class UserServiceTest {
	private ApplicationContext ctx=null;
	@Before
	public void init(){
		ctx=new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
	}
	@Test
	public void UserServiceTest(){
		UserService userService=(UserService) ctx.getBean("userService");
		User userCondition=new User();
		userCondition.setUserName("00");
		userCondition.setUserRole(1);
		List<User> userList=userService.findUserWithConditions(userCondition);
		
		for(User u:userList){
			System.out.println(u);
		}
	}
	@Test
	public void addNewUserTest() throws ParseException{
		UserService userService=(UserService) ctx.getBean("userService");
		User user=new User();
		user.setId(3);
		user.setUserCode("test001");
		user.setUserName("测试001");
		user.setUserPassword("123456");
		Date birthday = new SimpleDateFormat("yyyy-MM-dd")
				.parse("1997-07-13");
		user.setBirthday(birthday);
		user.setAddress("测试地址");
		user.setGender(1);
		user.setPhone("12345678910");
		user.setCreatedBy(1);
		user.setCreationDate(new Date());
		userService.addNewUser(user);
	}

}
