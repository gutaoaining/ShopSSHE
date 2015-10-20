package com.gt.dao.Impl;


import org.springframework.stereotype.Repository;

import com.gt.dao.base.SorderDaoI;
import com.gt.dao.base.UserDaoI;
import com.gt.model.Sorder;
import com.gt.model.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User>implements UserDaoI {
	public UserDaoImpl() {
		super();
	}
	@Override
	public User Login(User user){
		String hql="from User u where u.login=:login and u.pass=:pass";		
		return (User)getSession().createQuery(hql)
				.setString("login", user.getLogin())
				.setString("pass", user.getPass())
				.uniqueResult();
	}
}
