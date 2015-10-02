package com.gt.services.base;


import java.util.List;

import com.gt.model.Account;
import com.gt.model.ComboCategory;
public interface AccountServiceI extends BaseServiceI<Account> {
    /**
     * 用来类别返回combobox
     * @return
     */
	public List<ComboCategory> queryAccount();

}
