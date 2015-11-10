package com.gt.action.common;


import java.util.HashSet;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.gt.action.base.BaseAction;
import com.gt.model.Busorder;
import com.gt.model.Sorder;
import com.gt.model.Status;
import com.gt.model.User;
@ParentPackage("basePackage")
@Namespace("/usershop")
@Action(value="busOrderAction",results={@Result(name="bankcount",type="redirect",location="/user/bank.jsp")})
public class BusOrderAction extends BaseAction<Busorder> {
    /**
	 * 
	 */
	private static final long serialVersionUID = -2907363270713143119L;

	@Override
	public Busorder getModel() {
		model = (Busorder)session.get("busOrder");
		return model;
	}
	
	public String save(){
		  System.out.println(model.getName()+",,,,"+model.getPhone());
    	  model.setUser((User)session.get("user"));
    	  model.setStatus(new Status(1));
    	  busOrderService.save(model);
    	  session.put("busOrder", new Busorder(new HashSet<Sorder>()));
    	  return "bankcount";
      }
}
