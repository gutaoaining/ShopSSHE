package com.gt.action.common;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.gt.action.base.BaseAction;
import com.gt.model.Sorder;
@ParentPackage("basePackage")
@Namespace("/usershop")                                                                              
@Action(value="sorderAction",results={@Result(name="shopcar",type="redirect",location="/shopcar.jsp")})
public class SorderAction extends BaseAction<Sorder> {
     public String addProduct(){
    	 System.out.println("----shopcar-----");
    	 System.out.println(model.getProduct().getId());
    	 return "shopcar";
     }
}
