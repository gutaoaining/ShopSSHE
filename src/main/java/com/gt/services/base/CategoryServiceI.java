package com.gt.services.base;

import java.util.List;

import com.gt.model.Category;
import com.gt.model.ComboType;

public interface CategoryServiceI extends BaseServiceI<Category> {
	public List<Category> findCategoryAll(String type);

	public List<Category> findCategoryAll(String type, int page, int size);

	public Long countAll(String type);
	
	public void deleteCategory(String ids);
	
	public void deleteCategoryArray(List<Integer> ids);

	public List<ComboType> queryType();
	
	public List<Category> getTypeByHot(boolean hot);
}
