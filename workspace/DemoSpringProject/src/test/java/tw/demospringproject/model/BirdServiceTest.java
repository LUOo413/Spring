package tw.demospringproject.model;

import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BirdServiceTest {

	@Autowired
	private BirdService birdService;

//	@Test
	void testInsert() {
		Bird insertBean = new Bird("BlueBird", "S", "blue", 5);
		Bird resultBean = birdService.insert(insertBean);
		System.out.println(resultBean.getBid() + "-" + resultBean.getBname() + "-" + resultBean.getSize() + "-"
				+ resultBean.getColor() + "-" + resultBean.getAge());

	}

//	@Test
	void testUpdate() {
		Bird updateBean = new Bird(102, "SunBird", "M", "yellow", 12);
		Bird resultBean = birdService.insert(updateBean);
		System.out.println(resultBean.getBid() + "-" + resultBean.getBname() + "-" + resultBean.getSize() + "-"
				+ resultBean.getColor() + "-" + resultBean.getAge());
		;
	}

//	@Test
	void testDeleteById() {
		birdService.deleteById(102);
		System.out.println("Delete OK");

	}

//	@Test
	void testSelectById() {
		Bird queryBean = birdService.selectById(100);
		if (queryBean != null) {
			System.out.println(queryBean.getBid() + "-" + queryBean.getBname() + "-" + queryBean.getSize() + "-"
					+ queryBean.getColor() + "-" + queryBean.getAge());
			;
		} else {
			System.out.println("no result");
		}

	}

//	@Test
	void testSelectAll() {
		List<Bird> lists = birdService.selectAll();
		Iterator<Bird> i1 = lists.iterator();
		while (i1.hasNext()) {
			Bird resultBean = i1.next();
			System.out.println(resultBean.getBid() + "-" + resultBean.getBname() + "-" + resultBean.getSize() + "-"
					+ resultBean.getColor() + "-" + resultBean.getAge());
			;
		}
	}

}
