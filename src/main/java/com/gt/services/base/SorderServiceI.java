package com.gt.services.base;



import com.gt.model.Busorder;
import com.gt.model.Product;
import com.gt.model.Sorder;


public interface SorderServiceI extends BaseServiceI<Sorder> {
	 public Sorder productToSorder(Product product);
	 public Busorder Sorderadd(Busorder border, Product product);
}
