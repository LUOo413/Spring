package tw.demospringproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Engineer {

	@Autowired
	private BugBuster bugBuster;

	public void codeCheckAndFix() {
		bugBuster.scanBug();
		bugBuster.killBug();
	}

}
