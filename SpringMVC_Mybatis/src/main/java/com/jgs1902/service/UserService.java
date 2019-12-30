package com.jgs1902.service;


import com.jgs1902.pojo.User;
import com.jgs1902.pojo.UsersList;

import java.util.List;

public interface UserService {
	public List<UsersList> getUsers(String username);
	public void addUser(User user);
	public void deleteUser(String username);
	public void updateUser(User user);
	public void addListUsers(List<User> users);
}
