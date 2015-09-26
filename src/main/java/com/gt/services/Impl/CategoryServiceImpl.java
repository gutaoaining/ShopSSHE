package com.gt.services.Impl;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.dao.base.CategoryDaoI;
import com.gt.model.Category;
import com.gt.services.base.CategoryServiceI;


@Service("categoryService")
public class CategoryServiceImpl extends BaseServiceImpl<Category> implements CategoryServiceI{
    @Autowired
	private CategoryDaoI categoryDao;
	public  CategoryServiceImpl() {
	    super();
	}

	@Override
	public List<Category> findCategoryAll(String type) {
	    return categoryDao.findCategoryAll(type);
	}
	

}
