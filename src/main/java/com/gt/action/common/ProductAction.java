package com.gt.action.common;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.gt.action.base.BaseAction;
import com.gt.model.Product;
@ParentPackage("basePackage")
@Namespace("/usershop")
@Action(value = "productAction", results={@Result(name="detail",location="/detail.jsp")})
/**
 * 
* @ClassName: ProductAction 
* @Description: TODO(用来处理商品的action) 
* @author gutao 
* @date 2015年11月10日 下午9:02:53 
*
 */
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
	public String detailProduct() {
		System.out.println("shoudao:"+model.getId());
		request.put("productdetail", productService.get(model.getId()));
		return "detail";
	}
	public void map() {
		map = new HashMap<String, Object>();
		map.put("msg", true);
		WriteJson(map);
	}
}
