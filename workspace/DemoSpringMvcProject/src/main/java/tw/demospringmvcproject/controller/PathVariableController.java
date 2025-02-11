package tw.demospringmvcproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PathVariableController {

	@GetMapping("/member/{mid}")
	@ResponseBody // 上面是controller要加上ResponseBody找訊息 不然就是會找網頁
	public String processAction(@PathVariable("mid") String memberId) {
		return memberId;
	}

	@GetMapping("/member2/{mid2}")
	// 導到jsp
	public String processAction2(@PathVariable("mid2") String memberId, Model m) {
		m.addAttribute("memId", memberId); // 相當於servlet時的request.setAttribute("memId",memberId);
		return "memResult";
	}
}
