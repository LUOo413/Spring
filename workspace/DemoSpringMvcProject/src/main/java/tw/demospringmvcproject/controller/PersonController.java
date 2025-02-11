package tw.demospringmvcproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tw.demospringmvcproject.model.Person;

@RestController
@RequestMapping("check")
public class PersonController {

	@Autowired
	private Person person;

//	http://localhost:8081/check/person.controller
	@GetMapping("/person.controller")
//	@RequestMapping(path="/path/person.controller",method = RequestMethod.GET)
	public Person processAction() {
		return person;
	}
}
