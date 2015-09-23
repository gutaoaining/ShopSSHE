package sqlTest;

import java.util.List;

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
	@Test
	public void testsave() {
		Account account = new Account();
		account.setLogin("gutao");
		account.setName("nibei");
		account.setPass("1111");
		accountService.save(account);
	}
	@Test
	public void testupdate() {
		Account account = new Account();
		account.setId(3);
		account.setLogin("gutao");
		account.setName("顾涛");
		account.setPass("1111");
		accountService.update(account);
	}
	@Test
	public void testQuery() {
		List<Account> list = accountService.query();
	    System.out.println(list);
	}

	
}
