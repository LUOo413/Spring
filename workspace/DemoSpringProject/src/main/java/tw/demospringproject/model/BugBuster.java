package tw.demospringproject.model;

import org.springframework.stereotype.Component;

@Component
public class BugBuster {

//	public BugBuster() {
//		System.out.println("Initial BugBuster");
//	}

	public void scanBug() {
		System.out.println("Scanning Bug");
	}

	public void killBug() {
		System.out.println("Killing Bug");
	}

}
