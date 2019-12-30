package com.jgs1902.service;

import com.jgs1902.dao.mapper.UserMapper;
import com.jgs1902.pojo.User;
import com.jgs1902.pojo.UsersList;
import com.jgs1902.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(propagation = Propagation.REQUIRED)//添加事务注解,放在此处是全局添加，也可以添加到具体方法上面
@Service("userService")//注解创建实例
public class UserServiceImpl implements UserService{
	
	@Autowired
	@Qualifier("userMapper")//指定固定的对象，直接从spring配置文件获取，而不是注解里
	private UserMapper dao;

	public List<UsersList> getUsers(String username) {
		return dao.getUsers(username);
	}

	public void addUser(User user) {
		dao.addUser(user);
	}

	public void deleteUser(String username) {
		dao.deleteUser(username);
	}

	public void updateUser(User user) {
		dao.updateUser(user);		
	}

	public void addListUsers(List<User> users) {
//		事务处理多次添加，失败一个都会失败
		for(User user:users) {
			addUser(user);
		}
	}

}
