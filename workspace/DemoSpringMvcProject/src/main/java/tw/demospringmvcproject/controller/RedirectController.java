package tw.demospringmvcproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//導入頁面 不是return
@Controller
public class RedirectController {

	@GetMapping("/redirect.controller")
	public String processAction() {
		return "redirect:receivemain.controller";
	}
	
}
