package tw.demospringproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkerService {

	@Autowired
	private WorkerDao wDao;

	public void printDetails() {
		wDao.printDetail();
	}
}
