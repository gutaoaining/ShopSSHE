package com.gt.services.Impl;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gt.dao.base.CategoryDaoI;
import com.gt.model.Category;
import com.gt.model.Category;
import com.gt.model.ComboCategory;
import com.gt.model.ComboType;
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

	@Override
	public List<Category> findCategoryAll(String type, int page, int size) {
		
//		List<Category> list = new ArrayList<Category>(); 
//		list = categoryDao.findCategoryAll(type,page,size);
//		List<Category> clist = new ArrayList<Category>();
//        for (Category category : list) {
//			Category c = new Category();
//			BeanUtils.copyProperties(category, c);
//			c.getAccount().setPass("");
//			clist.add(c);
//			System.out.println(c);
//		}
//        System.out.println("clist");
//        for (Category category : clist) {
//        	System.out.println("clist");
//			System.out.println(category);
//		}
		return categoryDao.findCategoryAll(type,page,size);
	}

	@Override
	public Long countAll(String type) {
		Long total = categoryDao.countAll(type);
		return total;
	}

	@Override
	public void deleteCategory(String ids) {
		String hql = "delete Category c where c.id in ("+ids+")";
		System.out.println("获得到的hql语句："+hql);
		categoryDao.deleteMore(hql);
		
	}

	@Override
	public void deleteCategoryArray(List<Integer> ids) {
		  categoryDao.deleteArray(ids);
	}

	@Override
	public List<ComboType> queryType() {
		List<Category> list = categoryDao.query();
		List<ComboType> clist = new ArrayList<ComboType>();
		for (Category Category : list) {
			ComboType type = new ComboType();
			BeanUtils.copyProperties(Category, type);
			clist.add(type);
		}
		return clist;
	}

	@Override
	public List<Category> getTypeByHot(boolean hot) {
		List<Category> list = categoryDao.getTypeByHot(hot);
		return list;
	}
	

}
