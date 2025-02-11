package tw.demospringmvcproject.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes(names = { "userName" }) // 跨多頁
public class ReceiveController {
	
	@GetMapping("/receivemain.controller") //利用這個網址導到form.jsp
	public String pocessMainAction() {
		return "form";
	}

//	@GetMapping("/receive.controller")
	@PostMapping("/receive.controller")
	public String processAction(@RequestParam String userName, Model m, SessionStatus status) {
		Map<String, String> errors = new HashMap<String, String>();
		m.addAttribute("errors", errors);

		if (userName == null || userName.length() == 0) {
			errors.put("name", "name is required");
		}

		if (errors != null && !errors.isEmpty()) {
			return "form";
		}

		status.setComplete();// 清掉session 可用在logout

		m.addAttribute("userName", userName);
		return "success";
	}

}
