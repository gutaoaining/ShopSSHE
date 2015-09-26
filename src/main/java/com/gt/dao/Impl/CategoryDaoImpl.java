package com.gt.dao.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gt.dao.base.CategoryDaoI;
import com.gt.model.Category;

@Repository("categoryDao")
public class CategoryDaoImpl extends BaseDaoImpl<Category>implements CategoryDaoI {
	public CategoryDaoImpl() {
		super();
	}
	// public static void main(String[] args) {
	// new AccountDaoImpl();
	// }

	@Override
	public List<Category> findCategoryAll(String type) {
		String hql = " from Category c left join fetch c.account where c.type like :type";
		return getSession().createQuery(hql).setString("type", "%" + type + "%").list();
	}

	@Override
	public List<Category> findCategoryAll(String type, int page, int size) {
		String hql = " from Category c left join fetch c.account where c.type like :type";
		return getSession().createQuery(hql).setString("type", "%" + type + "%").setFirstResult((page - 1) * size)
				.setMaxResults(size).list();
	}
}
