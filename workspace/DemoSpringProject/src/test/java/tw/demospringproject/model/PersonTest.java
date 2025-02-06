package tw.demospringproject.model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PersonTest {

	@Autowired
	@Qualifier("person2")
	private Person person;

	@Test
	void testGetId() {
		int id = person.getId();
		System.out.println("id:" + id);
	}

	@Test
	void testGetName() {
		String name = person.getName();
		System.out.println("name:" + name);
	}

	@Test
	void testGetAge() {
		int age = person.getAge();
		System.out.println("age:" + age);
	}

	@Test
	void testGetDate() {
		Date date = person.getDate();
		System.out.println("date:" + date);
	}

}
