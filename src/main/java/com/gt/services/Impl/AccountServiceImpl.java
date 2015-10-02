package com.gt.services.Impl;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.dao.Impl.AccountDaoImpl;
import com.gt.dao.base.AccountDaoI;
import com.gt.model.Account;
import com.gt.model.ComboCategory;
import com.gt.services.base.AccountServiceI;

@Service("accountService")
public class AccountServiceImpl extends BaseServiceImpl<Account> implements AccountServiceI{
    @Autowired
	private AccountDaoI accountDao;
	public  AccountServiceImpl() {
	    super();
	}

	@Override
	public List<ComboCategory> queryAccount() {
		List<Account> list = accountDao.query();
		List<ComboCategory> clist = new ArrayList<ComboCategory>();
		for (Account account : list) {
			ComboCategory category = new ComboCategory();
			BeanUtils.copyProperties(account, category);
			clist.add(category);
		}
		return clist;
	}

	

}
