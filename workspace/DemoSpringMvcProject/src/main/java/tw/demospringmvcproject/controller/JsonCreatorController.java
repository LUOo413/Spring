package tw.demospringmvcproject.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;

import tw.demospringmvcproject.model.House;

@RestController // 沒有要回傳jsp用這個
public class JsonCreatorController {

	@GetMapping("/jsoncreator1.controller")
	public String processAction1() throws IOException {
		House hBean1 = new House(100, "Nice House");

		ObjectMapper om = new ObjectMapper();
		String jsonStr = om.writeValueAsString(hBean1);

		House hBean2 = om.readValue(jsonStr, House.class);
		System.out.println(hBean2.getHouseid() + " " + hBean2.getHousename());

		return "jsonStr:" + jsonStr;
	}

	@GetMapping("/jsoncreator2.controller")
	public House processAction2() {
		House hBean2 = new House(101, "Wonderful House");
		return hBean2;
	}

	@GetMapping("/jsoncreator3.controller")
	public List<House> processAction3() {
		House hBean3 = new House(102, "Great House");
		House hBean4 = new House(103, "Beautiful House");

		ArrayList<House> lists = new ArrayList<House>();
		lists.add(hBean3);
		lists.add(hBean4);

		return lists;
	}

	@GetMapping("/jsoncreator4.controller")
	public Map<String, Object> processAction4() {
		Map<String, Object> maps = new HashMap<String, Object>();

		House hBean5 = new House(104, "Green House");
		House hBean6 = new House(105, "Happy House");

		ArrayList<House> lists = new ArrayList<House>();
		lists.add(hBean5);
		lists.add(hBean6);

		maps.put("index", 1);
		maps.put("lists", lists);

		return maps;
	}
}
