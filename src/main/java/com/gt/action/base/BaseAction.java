package com.gt.action.base;

import java.io.IOException;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;

import com.alibaba.fastjson.JSON;

@ParentPackage("basePackage")
@Namespace("/")
public class BaseAction {
  
	public void WriteJson(Object obj){
 
      try {
        String json = JSON.toJSONStringWithDateFormat(obj , "yyyy-MM-dd HH:mm:ss");
        ServletActionContext.getResponse().setContentType("text/html;charset=utf-8");
		ServletActionContext.getResponse().getWriter().write(json);
		ServletActionContext.getResponse().getWriter().flush();
		ServletActionContext.getResponse().getWriter().close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    } 
}
