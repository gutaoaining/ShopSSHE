package com.gt.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
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

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
