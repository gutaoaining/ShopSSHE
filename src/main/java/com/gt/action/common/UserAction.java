package com.gt.action.common;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.web.context.request.SessionScope;

import com.gt.action.base.BaseAction;
import com.gt.model.User;
@ParentPackage("basePackage")
@Namespace("/usershop")
@Action(value = "useraction")
/**
 * 
* @ClassName: UserAction 
* @Description: TODO(这里处理user的action请求) 
* @author gutao 
* @date 2015年10月20日 下午6:24:51 
*
 */
public class UserAction extends BaseAction<User> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    public String Login(){
    	System.out.println(model.getLogin()+","+model.getPass());
    	model = userService.Login(model);
    	if(model == null){
    		System.out.println(model);
    		session.put("error", "登录失败！");
    		return "ulogin";
    	}else{
    		session.put("user", model);
    		if(session.get("goURL")==null){
    			return "index";
    		}else{
    			return "goURL";
    		}
    		
    	}
    }
}
