package tw.demospringproject.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TruckBeanTest {

	@Autowired
	private TruckBean tBean;

	@Test
	void testTruckBean() {
		System.out.println("ID:" + tBean.getId());
		System.out.println("BRAND" + tBean.getBrand());
	}

}
