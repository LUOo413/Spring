package tw.demospringproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository
public class WorkerDao {

	@Autowired //寫在屬性上
	@Qualifier("worker1")
	private Worker worker;

	public WorkerDao() {
	}
    //@Autowired 如果寫在建構子上面的話@Qualifier("worker1")要寫下面那樣
	public WorkerDao(Worker worker) { //public WorkerDao(@Qualifier("worker1") Worker worker)
		this.worker = worker;
	}

	public void printDetail() {
		System.out.println(worker.getId() + " " + worker.getName() + " " + worker.getTitle());
	}
}
