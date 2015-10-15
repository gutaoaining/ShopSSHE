package com.gt.dao.Impl;


import org.springframework.stereotype.Repository;

import com.gt.dao.base.BusOrderDaoI;
import com.gt.model.Busorder;


@Repository("busOrderDao")
public class BusOrderDaoImpl extends BaseDaoImpl<Busorder>implements BusOrderDaoI {
	public BusOrderDaoImpl() {
		super();
	}
	

	
}
