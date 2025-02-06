package tw.demospringproject.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TruckBeanStaticFactoryTest {

	@Autowired
	@Qualifier("toyotaTruck")
	private TruckBean truck1;

	@Autowired
	@Qualifier("nissanTruck")
	private TruckBean truck2;

	@Test
	void testGetTruckBean() {
		System.out.println("Truck1 ID :" + truck1.getId());
		System.out.println("Truck1 BRAND :" + truck1.getBrand());

		System.out.println("Truck2 ID :" + truck2.getId());
		System.out.println("Truck2 BRAND :" + truck2.getBrand());

	}

}
