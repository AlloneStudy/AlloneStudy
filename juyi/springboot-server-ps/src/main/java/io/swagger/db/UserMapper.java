package io.swagger.db;

import org.apache.ibatis.annotations.Select;

import io.swagger.model.User;


public interface UserMapper {
	@Select("select * from user where username=#{username}")
	public User findUserInfo(String username);
}
