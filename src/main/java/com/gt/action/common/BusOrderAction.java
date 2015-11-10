package com.gt.action.common;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.gt.action.base.BaseAction;
import com.gt.model.Busorder;
@ParentPackage("basePackage")
@Namespace("/usershop")
@Action(value="busOrderAction",results={@Result(name="bankcount",type="redirect",location="/user/bank.jsp")})
public class BusOrderAction extends BaseAction<Busorder> {
      public String save(){
    	  Busorder busorder = (Busorder)session.get("busOrder");
    	  System.out.println("购物车的："+busorder);
    	  
    	  return "bankcount";
      }
}
