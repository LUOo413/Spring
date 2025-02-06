package tw.demospringproject.util;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LogProviderTest {

	//TODO 找到註冊的原件，不用new了直接.，降低出錯
	@Autowired
	private LogProvider logProvider;
	
	@Test
	void testLog() {
		logProvider.log("hola");
	}

}
