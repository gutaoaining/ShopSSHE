package com.gt.action.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.gt.action.base.BaseAction;
import com.gt.model.Category;


@ParentPackage("basePackage")
@Namespace("/usershop")
@Action(value = "categoryaction")
/*
 * namespace的命名要加上斜杠，否则会找不到路径
 * */
public class CategoryAction extends BaseAction<Category>{
     /**
	 * request,session,application都放在baseAction中
	 */
	private static final long serialVersionUID = 1L;

	public void query(){
		map = new HashMap<String , Object>();
		Long total=categoryService.countAll(model.getType());
		System.out.println("type的值为："+model.getType());
		System.out.println(total);
    	List<Category> list = new ArrayList<Category>(); 
    	list = categoryService.findCategoryAll(model.getType(), page, rows);
    	System.out.println(list);
    	map.put("total", total);
    	map.put("rows", list);
    	WriteJson(map);
        
     }
	
}
