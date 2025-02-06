package tw.demospringproject.model;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoginDaoTest {

	@Autowired
	private LoginDao loginDao;

	@Test
	void testCheckLogin() {
		boolean result = loginDao.checkLogin("john", "test123");
		System.out.println("result:" + result);
	}

}
