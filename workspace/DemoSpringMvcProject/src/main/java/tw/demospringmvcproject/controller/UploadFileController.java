package tw.demospringmvcproject.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import tw.demospringmvcproject.model.Picture;
import tw.demospringmvcproject.model.PictureService;

@Controller
public class UploadFileController {

	@GetMapping("/uploadmain.controller")
	public String processMainAction() {
		return "uploadFile";
	}

	@PostMapping(path = "/upload.controller")
	@ResponseBody
	public String processAction(@RequestParam("myFiles") MultipartFile mf) throws IOException {
		String fileName = mf.getOriginalFilename();
		System.out.println("fileName:" + fileName);

		String saveFileDir = "C:/temp/upload/";
		File saveFilePath = new File(saveFileDir, fileName);

		byte[] b = mf.getBytes();
		mf.transferTo(saveFilePath);

		if (fileName != null && fileName.length() != 0) {
			savePicture(fileName, b);
		}

		return "saveFilePath:" + saveFilePath;
	}

	@Autowired
	private PictureService pService;

	private void savePicture(String fileName, byte[] b) {
		Picture p = new Picture(fileName, b);
		pService.insert(p);
	}

}