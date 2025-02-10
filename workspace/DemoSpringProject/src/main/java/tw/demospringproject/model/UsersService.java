package tw.demospringproject.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jakarta.transaction.TransactionScoped;

@Service
@Transactional
public class UsersService {

	@Autowired
	private UsersRepository uRepos;

	public Users selectByIdAndName(Integer id, String name) {
		return uRepos.findByIdAndName(id, name);
	}

	public List<Users> selectAll() {
		return uRepos.findAll();
	}
}
