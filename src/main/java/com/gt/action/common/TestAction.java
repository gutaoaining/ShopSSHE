package com.gt.action.common;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;

import com.gt.action.base.BaseAction;
import com.gt.model.Account;
import com.opensymphony.xwork2.ActionContext;

@ParentPackage("basePackage")
@Namespace("/usershop")
@Action(value = "testaction",results={@Result(name="index",location="/index.jsp")})
/*
 * namespace的命名要加上斜杠，否则会找不到路径
 * */
public class TestAction extends BaseAction<Account>{
     public String test(){
    	 System.out.println("------获得 请求-----");
    	 System.out.println(model.getName());
    	 System.out.println(model.getId());
    	 request.put("requestlist",accountService.query());
    	 session.put("sessionlist",accountService.query());
    	 application.put("applicationlist",accountService.query());
    	 return "index";
     }
}
