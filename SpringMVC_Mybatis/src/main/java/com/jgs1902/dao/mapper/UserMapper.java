package com.jgs1902.dao.mapper;

import com.jgs1902.pojo.User;
import com.jgs1902.pojo.UsersList;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {
	public List<UsersList> getUsers(@Param("username") String username);
	public void addUser(User user);
	public void deleteUser(@Param("username") String username);
	public void updateUser(User user);
	
}
