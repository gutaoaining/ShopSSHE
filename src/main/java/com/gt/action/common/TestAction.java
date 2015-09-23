package com.gt.action.common;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;

import com.gt.action.base.BaseAction;
import com.gt.model.Account;
import com.opensymphony.xwork2.ActionContext;

@ParentPackage("basePackage")
@Namespace("/usershop")
@Action(value = "testaction")
/*
 * namespace的命名要加上斜杠，否则会找不到路径
 * */
public class TestAction extends BaseAction<Account>{
     public void test(){
    	 System.out.println("获得到请求");
     }
}
