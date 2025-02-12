package tw.demospringmvcproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class AccountService {

	@Autowired
	private AccountDao aDao;

	public boolean checkLogin(Account users) {
		return aDao.checkLogin(users);
	}
}
