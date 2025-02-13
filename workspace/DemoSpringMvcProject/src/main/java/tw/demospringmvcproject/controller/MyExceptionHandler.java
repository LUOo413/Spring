package tw.demospringmvcproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import tw.demospringmvcproject.exception.MySystemException;

@ControllerAdvice
public class MyExceptionHandler {

	@ExceptionHandler(Exception.class)
	public Object exceptHandle(Exception e) {
		String errMsg1 = "Error: Exception";
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errMsg1);
	}

	@ExceptionHandler(MySystemException.class)
	public Object exceptHandle2(MySystemException e) {
        String errMsg2 = "Error: MySystemException " + e.getMsg();
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(errMsg2);
	}
}