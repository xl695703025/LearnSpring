package com.yuxia.mapper;

import java.util.List;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.yuxia.entity.User;
/**
 * 在配置了MapperFactorBean后，该文件就没用了，可以删除
 * @author YuXia
 * @date 2018年6月23日
 */
/*public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{
//继承SqlSessionDaoSupport后，就不用自己建立SqlSessionTemplate了
	private SqlSessionTemplate sqlSession;
	
	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}

	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	public List<User> getUserList(User user) {
		return this.getSqlSession().getMapper(UserMapper.class).getUserList(user);
	}

}*/
