package tw.demospringmvcproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import tw.demospringmvcproject.model.Members;

@Controller
public class MembersController {
	@GetMapping("/membersmain.controller")
	public String processMainAction(Model m) {
//		Members mem1 = new Members();
		Members mem1 = new Members("mary", "female", 18);
		m.addAttribute("members", mem1);
		return "members";
	}

//	@RequestMapping(path = "/addmembers",method = RequestMethod.POST)
	@PostMapping("/addmembers")
	public String processAction(@ModelAttribute("members") Members mem2, BindingResult result, Model m) {
		if (result.hasErrors()) {
			return "membersError";
		}

		m.addAttribute("mName", mem2.getMemberName());
		m.addAttribute("mGender", mem2.getGender());
		m.addAttribute("mAge", mem2.getAge());
		m.addAttribute("members", mem2);

		return "membersResult";
	}

}
