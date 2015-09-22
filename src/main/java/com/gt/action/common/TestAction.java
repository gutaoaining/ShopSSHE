package com.gt.action.common;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;

@ParentPackage("basePackage")
@Namespace("/usershop")
@Action(value = "testaction")
/*
 * namespace的命名要加上斜杠，否则会找不到路径
 * */
public class TestAction {
     public void test(){
    	 System.out.println("获得到请求");
     }
}
