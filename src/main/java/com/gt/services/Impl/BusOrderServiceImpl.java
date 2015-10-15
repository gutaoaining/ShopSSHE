package com.gt.services.Impl;

import org.springframework.stereotype.Service;

import com.gt.model.Busorder;
import com.gt.model.Sorder;
import com.gt.services.base.BusOrderServiceI;

@Service("busOrderService")
public class BusOrderServiceImpl extends BaseServiceImpl<Busorder> implements BusOrderServiceI{

	@Override
	public double TotalCount(Busorder busorder) {
		double total = 0.0;
        for (Sorder sorder : busorder.getSorderSet()) {
			total += sorder.getNumber()*sorder.getPrice();
		 }
		return total;
	}

}
