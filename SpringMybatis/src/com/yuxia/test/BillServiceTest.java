package com.yuxia.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yuxia.entity.Bill;
import com.yuxia.service.BillService;

public class BillServiceTest {

	ApplicationContext applicationContext;
	@Before
	public void init(){
		String xml="applicationContext-mybatis.xml";
		applicationContext = new ClassPathXmlApplicationContext(xml);
	}
	@Test
	public void getBillListTest(){
		BillService billService = (BillService) applicationContext.getBean("billService");
		List<Bill> billList = billService.getBillList("肥宅", 1, 2);
		System.out.println(billList);
	}
}
