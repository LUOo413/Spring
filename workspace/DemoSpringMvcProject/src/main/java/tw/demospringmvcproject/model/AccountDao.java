package tw.demospringmvcproject.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.transaction.Transactional;

@Repository
@Transactional
//用hibernate
public class AccountDao {

	@Autowired
	private SessionFactory factory;

	public boolean checkLogin(Account users) {
		Session session = factory.openSession();
		String hqlstr = "from Account where username = :user and userpwd = :pwd";
		Query<Account> query = session.createQuery(hqlstr, Account.class);
		query.setParameter("user", users.getUsername());
		query.setParameter("pwd", users.getUserpwd());

		Account resultBean = query.uniqueResult(); // null
		session.close();

		if (resultBean != null) {
			return true;
		}
		return false;
	}

}
