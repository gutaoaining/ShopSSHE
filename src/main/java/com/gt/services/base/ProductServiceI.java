package com.gt.services.base;

import java.util.List;

import com.gt.model.Product;

public interface ProductServiceI extends BaseServiceI<Product> {
	public List<Product> findProductAll(String name);

	public List<Product> findProductAll(String name, int page, int size);

	public Long countAll(String name);
	
	public void deleteProduct(String ids);
	
	public void deleteProductArray(List<Integer> ids);
}
