package com.gt.services.Impl;



import org.springframework.stereotype.Service;

import com.gt.model.Account;
import com.gt.services.base.AccountServiceI;

@Service("accountService")
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountServiceI{
   
	public  AccountServiceImpl() {
	    super();
	}

	

}
