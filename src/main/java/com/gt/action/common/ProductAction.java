package com.gt.action.common;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.apache.commons.io.FilenameUtils;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.aspectj.util.FileUtil;

import com.gt.action.base.BaseAction;
import com.gt.model.Product;
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
		for (Product product : list) {
			product.getCategory().setAccount(null);
		}
		map.put("total", total);
		map.put("rows", list);
		WriteJson(map);
	}
	public void updateProduct() {
		productService.update(model);
		map();
	}
	public void deleteProduct() {
		productService.deleteProduct(ids);
		map();
	}
	public void addproduct() throws Exception{
		String pic = uploadFile.uploadFile(fileImage);
		model.setPic(pic);
		productService.save(model);
		System.out.println(model);
		map();
	}
	public void map() {
		map = new HashMap<String, Object>();
		map.put("msg", true);
		WriteJson(map);
	}
}
