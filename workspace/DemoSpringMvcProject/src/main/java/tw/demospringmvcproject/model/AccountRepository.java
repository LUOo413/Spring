package tw.demospringmvcproject.model;

import org.springframework.data.jpa.repository.JpaRepository;

//springdatajpa
//對比AccountDao來說更方便簡單不用寫sql語法
public interface AccountRepository extends JpaRepository<Account, Integer> {

	public Account findByUsernameAndUserpwd(String user,String pwd);
	
}
