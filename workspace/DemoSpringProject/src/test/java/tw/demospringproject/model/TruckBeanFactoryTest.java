package tw.demospringproject.model;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TruckBeanFactoryTest {

	@Autowired
	@Qualifier("ferrariTruck")
	private TruckBean truck3;

	@Autowired
	@Qualifier("subaruTruck")
	private TruckBean truck4;

	@Test
	void testGetTruckBean() {

		System.out.println("truck3 id:" + truck3.getId());
		System.out.println("truck3 brand:" + truck3.getBrand());

		System.out.println("truck4 id:" + truck4.getId());
		System.out.println("truck4 brand:" + truck4.getBrand());
	}

}
