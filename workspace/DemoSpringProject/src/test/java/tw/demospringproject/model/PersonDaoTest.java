package tw.demospringproject.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PersonDaoTest {

	@Autowired
	private PersonDao pDao;

	@Test
	void testShowInfo() {
		pDao.showInfo();
	}

}
