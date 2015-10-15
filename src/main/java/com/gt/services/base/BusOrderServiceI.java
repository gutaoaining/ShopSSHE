package com.gt.services.base;


import com.gt.model.Busorder;


public interface BusOrderServiceI extends BaseServiceI<Busorder> {
	public double TotalCount(Busorder busorder);

}
