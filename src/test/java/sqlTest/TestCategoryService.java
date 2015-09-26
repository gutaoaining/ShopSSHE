package sqlTest;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gt.model.Account;
import com.gt.model.Category;
import com.gt.services.base.AccountServiceI;
import com.gt.services.base.CategoryServiceI;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-hibernate.xml", "classpath*:spring.xml" })
public class TestCategoryService {
	/**
	 * 一般的aop的是基于动态代理模式，动态代理模式有两种：
	 * 1.基于jdk Proxy代理，此方法适合有接口的类，
	 * 2.如果类没有接口则生成的aop就是CGLIB代理
	 */
	@Autowired
    protected CategoryServiceI categoryService;
	@Test
	public void test() {
          List<Category> list = categoryService.findCategoryAll("");
          for (Category category : list) {
			System.out.println(category);
		}
	}
	@Test
	public void testpage() {
          List<Category> list = categoryService.findCategoryAll("",2,2);
          for (Category category : list) {
			System.out.println(category);
		}
	}


	
}
