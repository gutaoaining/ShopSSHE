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
@Action(value = "accountaction",results={@Result(name="index",location="/index.jsp"),@Result(name="send",location="/WEB-INF/main/aindex.jsp")})
/*
 * namespace的命名要加上斜杠，否则会找不到路径
 * */
public class AccountAction extends BaseAction<Account>{
     /**
	 * request,session,application都放在baseAction中
	 */
	private static final long serialVersionUID = 1L;

	public String query(){
    	 request.put("requestlist",accountService.query());
    	 session.put("sessionlist",accountService.query());
    	 application.put("applicationlist",accountService.query());
    	 return "index";
     }
	public String aindex(){
		System.out.println("----------send-----------");
		return "send";
	}
}
