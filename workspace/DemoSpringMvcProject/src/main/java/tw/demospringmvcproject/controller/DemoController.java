package tw.demospringmvcproject.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {

	@GetMapping("/retreivefields.controller")
	public String processAction(@RequestParam String name,@RequestParam String age,@RequestParam Map<String,String> formData,Model m) {
		m.addAttribute("name",name);
		m.addAttribute("age",age);
		m.addAttribute("formData",formData);
		
		return "retreivefieldsInfo";
	}
}
