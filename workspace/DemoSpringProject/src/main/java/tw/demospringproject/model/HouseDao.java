package tw.demospringproject.model;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.PersistenceContext;

@Repository
@Transactional
public class HouseDao {

	@PersistenceContext
	private Session session;

	public House selectById(Integer id) {
		House resultBean = session.get(House.class, id);
		return resultBean;
	}

	public List<House> selectAll() {
		Query<House> query = session.createQuery("from House", House.class);
		return query.list();

	}
}
