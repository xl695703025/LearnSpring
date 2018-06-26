package com.yuxia.mapper;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.yuxia.entity.User;

public interface UserMapper {

	public int addUser(User user);
	public List<User> selectUserListById(Integer[] roleIds);
	public List<User> selectByRoleId(@Param("userName") String userName,
			@Param("userRole") Integer roleId,
			@Param("from")Integer currentPageNo,
			@Param("pageSize")Integer pageSize);
	
	
	public List<User> getUserList_choose(@Param("userName") String userName,
			@Param("userRole") Integer roleId,
			@Param("userCode") String userCode,
			@Param("creationDate") Date creationDate);

}
