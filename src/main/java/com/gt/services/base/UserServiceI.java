package com.gt.services.base;


import com.gt.model.User;


public interface UserServiceI extends BaseServiceI<User> {
	 public User Login(User user);
}
