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

import com.yuxia.entity.Provider;
import com.yuxia.mapper.ProviderMapper;

public class SelectByIdTest {

	private SqlSessionFactory factory;

	@Before
	public void init() {
		try {
			InputStream is = new FileInputStream("res/mybatis-config.xml");
			factory = new SqlSessionFactoryBuilder().build(is);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void test() {
		SqlSession sqlSession = factory.openSession();
		ProviderMapper providerMapper = sqlSession
				.getMapper(ProviderMapper.class);
		Provider p = providerMapper.selectById(1);
		List<Provider> proList = providerMapper.selectAll();
		for (Provider pro : proList) {
			System.out.println(pro.getProName());
		}
		// 关闭sqlSession
		sqlSession.close();
	}

	@Test
	public void test2() {
		SqlSession sqlSession = factory.openSession();
		Provider p = sqlSession.selectOne(
				"com.yuxia.mapper.ProviderMapper.selectById", 1);
		// 关闭sqlSession
		System.out.println(p);
		sqlSession.close();
	}
	@Test
	public void test3() {
		SqlSession sqlSession = factory.openSession();
		ProviderMapper mapper = sqlSession.getMapper(ProviderMapper.class);
		List<Provider> proList = mapper.selectByProId(1);
		System.out.println("供应商数量"+proList.size());
		for(Provider p :proList){
			System.out.println("订单数量:"+p.getBillList().size());
			System.out.println(p);
		}
		sqlSession.close();
	}
}
