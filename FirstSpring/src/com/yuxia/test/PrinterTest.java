package com.yuxia.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yuxia.printer.Printer;

public class PrinterTest {

	private ApplicationContext context = null;

	@Before
	public void init() {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@Test
	public void PrinterTest() {
		Printer printer = (Printer) context.getBean("printer");
		String str = "2、更深的层次——提到DI，依赖注入，是IOC的一种重要实现 "
				+ "一个对象的创建往往会涉及到其他对象的创建，比如一个对象A的成员变量持有着另"
				+ "一个对象B的引用，这就是依赖，A依赖于B。IOC机制既然负责了对象的创建，那么这"
				+ "个依赖关系也就必须由IOC容器负责起来。负责的方式就是DI——依赖注入，通过将依"
				+ "赖关系写入配置文件，然后在创建有依赖关系的对象时，由IOC容器注入依赖的对象，如在创"
				+ "建A时，检查到有依赖关系，IOC容器就把A依赖的对象B创建后注入到"
				+ "A中（组装，通过反射机制实现），然后把A返回给对象请求者，完成工作。";
		printer.print(str);
	}
}
