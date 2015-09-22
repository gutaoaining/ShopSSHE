package com.gt.services.Impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.dao.base.AccountDaoI;
import com.gt.model.Account;
import com.gt.services.base.BaseServiceI;
@Service("accountService")
public class AccountServiceImpl implements BaseServiceI{
    private AccountDaoI accountDao;
   

	public AccountDaoI getAccountDao() {
		return accountDao;
	}
    @Autowired
	public void setAccountDao(AccountDaoI accountDao) {
		this.accountDao = accountDao;
	}


	@Override
	public Account get() {
		// TODO Auto-generated method stub
		
		return accountDao.get(Account.class, 1);
	}
       
}
