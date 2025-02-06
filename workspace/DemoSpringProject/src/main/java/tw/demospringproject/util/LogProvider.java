package tw.demospringproject.util;

import org.springframework.stereotype.Component;

//TODO 註冊

@Component
public class LogProvider {

	public void log(String msg) {
		System.out.println("msg: "+ msg);
	}
}
