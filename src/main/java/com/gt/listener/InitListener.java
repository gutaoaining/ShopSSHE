package com.gt.listener;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.gt.model.Category;
import com.gt.model.Product;
import com.gt.services.base.CategoryServiceI;
import com.gt.services.base.ProductServiceI;

public class InitListener implements ServletContextListener {
    
	private ProductServiceI productService = null;
	private CategoryServiceI categoryService = null;
	ApplicationContext applicationContext = null;
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		//解决方案一:通过直接拿配置文件来获得service,但是并不好，因为加载了两次配置文件
//		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml","classpath:spring-hibernate.xml");
//      productService = (ProductServiceI)applicationContext.getBean("productService");
//      System.out.println("-------------自己的监听器："+productService);
	    //解决方案二:项目在启动时把spring配置文件通过配置加载，存储了servletContext,只需要获取就可以了
		  //这里key值有点长，不方便
//		ApplicationContext applicationContext =(ApplicationContext)sce.getServletContext().getAttribute(WebApplicationContext.ROOT_WEB_APPLICATION_CONTEXT_ATTRIBUTE);
//		productService = (ProductServiceI)applicationContext.getBean("productService");
//		System.out.println("---------productService:"+productService);
		//解决方案三:利用spring提供的一个工具类
		applicationContext =(ApplicationContext)WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
	    productService = (ProductServiceI)applicationContext.getBean("productService");
	    categoryService = (CategoryServiceI)applicationContext.getBean("categoryService");
	    List<List<Product>> alllist = new ArrayList<List<Product>>();
	    for (Category category : categoryService.getTypeByHot(true)) {
			alllist.add(productService.getProductByCid(category.getId()));
		}
	    sce.getServletContext().setAttribute("alllist", alllist);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}

}
