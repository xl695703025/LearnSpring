package com.yuxia.test;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.yuxia.entity.Bill;
import com.yuxia.mapper.BillMapper;

public class BillSelectTest {

	private SqlSessionFactory factory;
	@Before
	public void init(){
		try {
			InputStream is = new FileInputStream("res/mybatis-config.xml");
			factory = new SqlSessionFactoryBuilder().build(is);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void BillMapperTest(){
		SqlSession sqlSession = factory.openSession();
		BillMapper mapper = sqlSession.getMapper(BillMapper.class);
		List<Bill> billList = mapper.selectByProductName("yuxia");
		mapper.selectByProviderId(1);
		mapper.selectByIsPayment(1);
		//在mybatis中设置autoMappingBehavior为NONE,会禁止自动匹配
		mapper.selectBill("yuxia", 1, 1);
		for(Bill bill : billList){
			System.out.println(bill);
		}
	}

	@Test
	public void BillMapperTest2(){
		SqlSession sqlSession = factory.openSession();
		BillMapper mapper = sqlSession.getMapper(BillMapper.class);
		mapper.selectBillList("肥宅片", 1,2);
	}

}
