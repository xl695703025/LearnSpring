package com.yuxia.test;

import static org.junit.Assert.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.yuxia.entity.User;
import com.yuxia.mapper.UserMapper;

public class UserTest {

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

	/**
	 * 
	 */
	@Test
	public void addUserTest() {
		SqlSession sqlSession=null;
		int res=0;
		try {
			sqlSession = factory.openSession(false);
			UserMapper mapper = sqlSession.getMapper(UserMapper.class);
			User user = new User();
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
			res=mapper.addUser(user);
			sqlSession.commit();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			sqlSession.rollback();
			res=0;
		}finally{
			sqlSession.close();
		}
	}
	@Test
	public void selectByRoleIdTest(){
		SqlSession sqlSession=null;
		try {
			sqlSession=factory.openSession();
			UserMapper mapper = sqlSession.getMapper(UserMapper.class);
			List<User> userList = mapper.selectByRoleId("00",1,0,1);
			for(User u:userList	){
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
	}
	@Test
	public void selectUserListByIdTest(){
		SqlSession sqlSession=null;
		try {
			sqlSession=factory.openSession();
			UserMapper mapper = sqlSession.getMapper(UserMapper.class);
			mapper.selectUserListById(new Integer[]{1,2});
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
	}
	
	@Test
	public void getUserList_chooseTest(){
		SqlSession sqlSession=null;
		try {
			sqlSession=factory.openSession();
			UserMapper mapper = sqlSession.getMapper(UserMapper.class);
			String userName="";
			Integer roleId=1;
			String userCode="001";
			Date creationDate = new SimpleDateFormat("yyyy-MM-dd").parse("2018-01-01");
			mapper.getUserList_choose(userName, roleId, userCode, creationDate);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			sqlSession.close();
		}
	}
}
