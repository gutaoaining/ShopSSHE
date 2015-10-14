package com.gt.action.common;


import java.util.HashSet;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.gt.action.base.BaseAction;
import com.gt.model.Busorder;
import com.gt.model.Product;
import com.gt.model.Sorder;
@ParentPackage("basePackage")
@Namespace("/usershop")                                                                              
@Action(value="sorderAction",results={@Result(name="shopcar",type="redirect",location="/shopcar.jsp")})
public class SorderAction extends BaseAction<Sorder> {
     public String addProduct(){
    	 //到数据库中找到相应的商品数据
    	 Product product = productService.get(model.getProduct().getId());
    	 //判断session中有没有购物车
    	 System.out.println("-----------");
    	 if(session.get("busOrder")==null){
    		 session.put("busOrder", new Busorder(new HashSet<Sorder>()));
    	 }
    	 System.out.println("----shopcar-----");
    	 System.out.println(model.getProduct().getId());
    	 //把商品信息转化为sorder
    	 model.setName(product.getName());
    	 model.setNumber(1);
    	 model.setPrice(product.getPrice());
    	 model.setProduct(product);
    	 Busorder busorder = (Busorder)session.get("busOrder");
    	 busorder.getSorderSet().add(model);
    	 double total = 0.0;
    	 for (Sorder sorder : busorder.getSorderSet()) {
			 total += sorder.getPrice()*sorder.getNumber();
		 }
    	 busorder.setTotal(total);
    	 session.put("busOrder", busorder);
    
    	 return "shopcar";
     }
}
