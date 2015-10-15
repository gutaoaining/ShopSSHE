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
@Action(value="sorderAction",results={@Result(name="shopcar",type="redirect",location="/showCar.jsp")})
public class SorderAction extends BaseAction<Sorder> {
     public String addProduct(){
    	 //到数据库中找到相应的商品数据
    	 Product product = productService.get(model.getProduct().getId());
    	 //判断session中有没有购物车
    	 if(session.get("busOrder")==null){
    		 session.put("busOrder", new Busorder(new HashSet<Sorder>()));
    	 }
    	 System.out.println("----shopcar-----");
    	 System.out.println(model.getProduct().getId());
    	 //把商品信息转化为sorder
    	 Busorder border = (Busorder)session.get("busOrder");
    	 Busorder busorder = sorderService.Sorderadd(border, product);
    	 //计算总价格
    	 busorder.setTotal(busOrderService.TotalCount(busorder));
    	 System.out.println(busorder.getSorderSet().size());
    	 session.put("ordertotal",busorder.getSorderSet().size());
    	 session.put("busOrder", busorder);
    	 return "shopcar";
     }
}
