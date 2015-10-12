package com.gt.dao.Impl;


import org.springframework.stereotype.Repository;

import com.gt.dao.base.SorderDaoI;
import com.gt.model.Sorder;

@Repository("sorderDao")
public class SorderDaoImpl extends BaseDaoImpl<Sorder>implements SorderDaoI {
	public SorderDaoImpl() {
		super();
	}
	

	
}
