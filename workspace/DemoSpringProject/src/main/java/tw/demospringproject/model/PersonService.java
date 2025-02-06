package tw.demospringproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService {

	@Autowired
	private PersonDao pDao;
	
	public void showInfo() {
		pDao.showInfo();
	}
}
