package tw.demospringmvcproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import tw.demospringmvcproject.exception.MySystemException;

@Controller
public class ExceptionController {

	@GetMapping("/exception1.controller")
	public void processAction1() throws Exception {
		throw new Exception();
	}

	@GetMapping("/exception2.controller")
	public void processAction2() throws MySystemException {
		throw new MySystemException("something happened");
	}

}
