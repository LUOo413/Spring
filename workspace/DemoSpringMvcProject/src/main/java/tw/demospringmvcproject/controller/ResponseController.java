package tw.demospringmvcproject.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ResponseController {

	@GetMapping(path = "/response1.controller")
	@ResponseBody // application/json
	public String processAction1() {
		return "How Are U?";
	}

	@GetMapping(path = "/response2.controller", produces = "text/plain;charset=UTF-8")
	@ResponseBody
	public String processAction2() {
		return "你好, How Are U?";
	}

	@GetMapping("/responsestatus.controller")
	public ResponseEntity<String> processAction3() {
		return new ResponseEntity<String>("Custom Information(403 Forbidden)", HttpStatus.FORBIDDEN);
	}

	@Value("WEB-INF/resources/images/p2.jpg")
	private Resource resource;

	@GetMapping(path = "/imagebytearray.controller", produces = "text/plain;charset-UTF-8")
	@ResponseBody
	public byte[] processImageByteArrayAction() throws IOException {
		File file = resource.getFile();
		System.out.println(file.getName() + "\n" + file.getPath() + "\n" + file.length());

		InputStream is1 = resource.getInputStream();
		return IOUtils.toByteArray(is1);
	}
}
