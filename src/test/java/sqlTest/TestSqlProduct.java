package sqlTest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gt.model.Product;
import com.gt.services.base.ProductServiceI;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-hibernate.xml", "classpath*:spring.xml" })
public class TestSqlProduct {
	/**
	 * 一般的aop的是基于动态代理模式，动态代理模式有两种：
	 * 1.基于jdk Proxy代理，此方法适合有接口的类，
	 * 2.如果类没有接口则生成的aop就是CGLIB代理
	 */
	@Autowired
    private ProductServiceI productService;
	@Test
    public void testCategoryCopy(){
    	List<Product> list = productService.findProductAll("", 1, 5);
        for (Product product : list) {
        	//这里必须对account进行设置，否则，json在解析的时候会一直向下去找，然而这时
        	//已经查询结束，session已经关闭，如果不进行设置会报no session的错误，
        	//这里是因为hibernate的lazy加载
        	product.getCategory().setAccount(null);
			System.out.println(product);
		}
    }
	

	
}
