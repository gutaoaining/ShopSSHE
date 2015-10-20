package com.gt.dao.base;


import com.gt.model.User;


public interface UserDaoI extends BaseDaoI<User> {
  public User Login(User user);
}
