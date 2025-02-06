package tw.demospringproject.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TreeBeanTest {

	@Autowired
	private TreeBean tree;

	@Test
	void testGetName() {
		System.out.println("Name:" + tree.getName());
	}

	@Test
	void testGetAge() {
		System.out.println("Age:" + tree.getAge());
	}

}
