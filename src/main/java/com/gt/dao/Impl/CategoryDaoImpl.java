package com.gt.dao.Impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.gt.dao.base.CategoryDaoI;
import com.gt.model.Category;
@Repository("categoryDao")
public class CategoryDaoImpl extends BaseDaoImpl<Category>implements CategoryDaoI {
        public CategoryDaoImpl(){
        	super();
        }
//        public static void main(String[] args) {
//			new AccountDaoImpl();
//		}

		@Override
		public List<Category> findCategoryAll(String type) {
			String hql=" from Category c left join fetch c.account where c.type like :type";
			System.out.println(hql);
			return getSession().createQuery(hql).setString("type", "%"+type+"%").list();
		}
}
