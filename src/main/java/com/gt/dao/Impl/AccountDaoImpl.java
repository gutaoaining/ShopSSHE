package com.gt.dao.Impl;

import org.springframework.stereotype.Repository;

import com.gt.dao.base.AccountDaoI;
import com.gt.model.Account;
@Repository("accountDao")
public class AccountDaoImpl extends BaseDaoImpl<Account>implements AccountDaoI {
        public AccountDaoImpl(){
        	super();
        }
//        public static void main(String[] args) {
//			new AccountDaoImpl();
//		}
}
