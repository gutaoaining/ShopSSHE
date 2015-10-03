package com.gt.action.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.springframework.beans.factory.annotation.Autowired;

import com.gt.action.base.BaseAction;
import com.gt.model.Product;
import com.gt.services.base.ProductServiceI;
@ParentPackage("basePackage")
@Namespace("/usershop")
@Action("productAction")
public class ProductAction extends BaseAction<Product> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void query() {
		map = new HashMap<String, Object>();
		Long total = productService.countAll(model.getName());
		List<Product> list = new ArrayList<Product>();
		list = productService.findProductAll(model.getName(), page, rows);
		map.put("total", total);
		map.put("rows", list);
		WriteJson(map);
	}
	public void saveProduct() {
		productService.save(model);
		map();
	}
	public void updateProduct() {
		productService.update(model);
		map();
	}
	public void deleteProduct() {
		productService.deleteProduct(ids);
		map();
	}

	public void deleteProductArray() {
		productService.deleteProductArray(idArray);
		map();
	}

	public void map() {
		map = new HashMap<String, Object>();
		map.put("msg", true);
		WriteJson(map);
	}
}
