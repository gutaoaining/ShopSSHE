package sqlTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gt.model.Product;
import com.gt.services.base.ProductServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-hibernate.xml", "classpath*:spring.xml" })
public class TestCache {
   @Autowired
   private ProductServiceI productService;
   @Test
   public void test1(){
//	   System.out.println(productService.get(1));
//	   System.out.println(productService.get(1));
	   Product product =productService.get(1);
	   product.setName("gutao");
	   productService.update(product);
   }
   @Test
   public void test2(){
     productService.delete(1);;
   }
   @Test
   public void test3(){
	   Product product =productService.get(1);
	   product.setName("gutao");
	   productService.save(product);
   }

}
