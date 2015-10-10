package com.gt.dao.base;

import java.util.List;

import com.gt.model.Product;


public interface ProductDaoI extends BaseDaoI<Product> {
	public List<Product> findProductAll(String name);

	public List<Product> findProductAll(String name, int page, int size);

	public Long countAll(String name);

	public List<Product> getProductByCid(int cid);
	
}
