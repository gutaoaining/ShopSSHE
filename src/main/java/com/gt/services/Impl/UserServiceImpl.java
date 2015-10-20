package com.gt.services.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.dao.base.UserDaoI;
import com.gt.model.User;
import com.gt.services.base.UserServiceI;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserServiceI{
    @Autowired
	private UserDaoI userDao;
	@Override
	public User Login(User user) {
		return userDao.Login(user);
	}

}
