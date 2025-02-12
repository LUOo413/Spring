package tw.demospringmvcproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
@Transactional
//對照AccountService和AccountDao更方便
public class AccountService2 {

	@Autowired
	private AccountRepository aRepos;

	public boolean checkLogin(Account users) {
		Account resultBean = aRepos.findByUsernameAndUserpwd(users.getUsername(), users.getUserpwd());

		if (resultBean != null) {
			return true;
		}
		return false;
	}
}
