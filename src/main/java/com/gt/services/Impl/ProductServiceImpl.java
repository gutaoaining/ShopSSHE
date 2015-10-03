package com.gt.services.Impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.dao.base.ProductDaoI;
import com.gt.model.Product;
import com.gt.services.base.ProductServiceI;


@Service("productService")
public class ProductServiceImpl extends BaseServiceImpl<Product> implements ProductServiceI{
    @Autowired
	private ProductDaoI productDao;
    
	public  ProductServiceImpl() {
	    super();
	}
	@Override
	public List<Product> findProductAll(String name) {
	    return productDao.findProductAll(name);
	}

	@Override
	public List<Product> findProductAll(String name, int page, int size) {
		List<Product> list = productDao.findProductAll(name,page,size);
        for (Product product : list) {
        	product.getCategory().setAccount(null);
		}
		return list;
	}

	@Override
	public Long countAll(String name) {
		Long total = productDao.countAll(name);
		return total;
	}

	@Override
	public void deleteProduct(String ids) {
		String hql = "delete Product p where p.id in ("+ids+")";
		System.out.println("获得到的hql语句："+hql);
		productDao.deleteMore(hql);
		
	}

	@Override
	public void deleteProductArray(List<Integer> ids) {
		  productDao.deleteArray(ids);
	}
	

}
