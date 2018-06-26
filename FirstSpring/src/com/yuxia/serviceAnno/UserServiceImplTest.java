package com.yuxia.serviceAnno;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceImplTest {
	ApplicationContext applicationContext=null;
	@Before
	public void init(){
		String xml="applicationContextAnno.xml";
		applicationContext= new ClassPathXmlApplicationContext(xml);
	}
	
	@Test
	public void saveTest(){
		UserService userService = (UserService) applicationContext.getBean("userService");
		userService.save();
	}
}
