package com.yuxia.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yuxia.hello.HelloSpring;

public class HelloSpringTest {

	private ApplicationContext context=null;
	@Before
	public void init(){
		context=new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void helloSpringTest(){

		HelloSpring hs = (HelloSpring) context.getBean("helloSpring");
		hs.print();
	}

}
