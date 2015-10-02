package com.gt.action.common;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.gt.action.base.BaseAction;
import com.gt.model.Category;

@ParentPackage("basePackage")
@Namespace("/usershop")
@Action(value = "categoryaction", results = {
		@Result(name = "stream", type = "stream", params = { "inputName", "inputStream" }) })
/*
 * namespace的命名要加上斜杠，否则会找不到路径
 */
public class CategoryAction extends BaseAction<Category> {
	/**
	 * request,session,application都放在baseAction中
	 */
	private static final long serialVersionUID = 1L;

	public void query() {
		map = new HashMap<String, Object>();
		Long total = categoryService.countAll(model.getType());
		System.out.println("type的值为：" + model.getType());
		System.out.println(total);
		List<Category> list = new ArrayList<Category>();
		list = categoryService.findCategoryAll(model.getType(), page, rows);
		System.out.println(list);
		map.put("total", total);
		map.put("rows", list);
		WriteJson(map);
	}
    /*
     * 通过stream的方式返回，这是stream的基本返回类型中的一种
     * */
	// public String deleteCategory(){
	// categoryService.deleteCategory(ids);
	// inputStream = new ByteArrayInputStream("true".getBytes());
	// return "stream";
	// }
	public void deleteCategory() {
		categoryService.deleteCategory(ids);
		map();
	}

	public void deleteCategoryArray() {
		categoryService.deleteCategoryArray(idArray);
		map();
	}

	public void map() {
		map = new HashMap<String, Object>();
		map.put("msg", true);
		WriteJson(map);
	}
}
