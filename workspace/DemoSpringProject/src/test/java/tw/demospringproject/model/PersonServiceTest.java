package tw.demospringproject.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PersonServiceTest {

	@Autowired
	private PersonService pService;

	@Test
	void testShowInfo() {
		pService.showInfo();
	}

}
