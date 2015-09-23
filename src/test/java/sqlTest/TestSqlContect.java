package sqlTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gt.model.Account;
import com.gt.services.Impl.AccountServiceImpl;
import com.gt.services.base.AccountServiceI;
import com.gt.services.base.BaseServiceI;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath*:spring-hibernate.xml", "classpath*:spring.xml" })
public class TestSqlContect {
	@Autowired
    protected AccountServiceI accountService;
	@Test
	public void test() {
		System.out.println(accountService.get());
	}

	
}
