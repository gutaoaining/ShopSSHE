package com.gt.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 
* @ClassName: LoginFilter 
* @Description: TODO(用来分辨用户是支付登录还是普通登录) 
* @author gutao
* @date 2015年10月17日 下午12:57:36 
*
 */

public class LoginFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
           HttpServletRequest req = (HttpServletRequest)request;
           HttpServletResponse resp = (HttpServletResponse)response;
           if(req.getSession().getAttribute("user")==null){
        	   req.setAttribute("error", "请求非法，请登录后重试！");
        	   System.out.println("test:"+req.getServerPort());
        	   System.out.println("test:"+req.getRequestURI());
        	   System.out.println("test:"+req.getLocalPort());
        	   System.out.println("请求路径："+req.getContextPath());
        	   resp.sendRedirect(req.getContextPath()+"/ulogin.jsp");
           }else{
        	   chain.doFilter(request, response);
           }
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
