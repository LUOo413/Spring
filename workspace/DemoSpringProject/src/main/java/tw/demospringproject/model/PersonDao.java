package tw.demospringproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component // 不想註冊Bean就加@Component
public class PersonDao {

	@Autowired
	@Qualifier("person1")
	private Person p;

	public void showInfo() {
		System.out.println(p.getId() + " " + p.getName() + " " + p.getAge() + " " + p.getDate());
	}
}
