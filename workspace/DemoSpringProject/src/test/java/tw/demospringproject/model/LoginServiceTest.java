package tw.demospringproject.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LoginServiceTest {

	@Autowired
//	@Qualifier("loginService2")
	@Qualifier("loginS2")
	private LoginService loginService;

	@Test
	void testCheckLogin() {
		boolean result2 = loginService.checkLogin("mary", "12345");
		System.out.println("result2:" + result2);

	}

}
