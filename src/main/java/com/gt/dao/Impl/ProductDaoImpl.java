package com.gt.dao.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gt.dao.base.ProductDaoI;
import com.gt.model.Product;

@Repository("productDao")
public class ProductDaoImpl extends BaseDaoImpl<Product>implements ProductDaoI {
	public ProductDaoImpl() {
		super();
	}
	// public static void main(String[] args) {
	// new AccountDaoImpl();
	// }

	@Override
	public List<Product> findProductAll(String name) {
		String hql = " from Product p left join fetch p.category where p.name like :name";
		return getSession().createQuery(hql).setString("name", "%" + name + "%").list();
	}

	@Override
	public List<Product> findProductAll(String name, int page, int size) {
		String hql = " from Product p left join fetch p.category where p.name like :name";
		return getSession().createQuery(hql).setString("name", "%" + name + "%").setFirstResult((page - 1) * size)
				.setMaxResults(size).list();
	}

	@Override
	public Long countAll(String name) {
		String hql = "select count(p) from Product p where p.name like :name";
		return (Long)getSession().createQuery(hql).setString("name", "%" + name + "%").uniqueResult();
		
	}
	
}
