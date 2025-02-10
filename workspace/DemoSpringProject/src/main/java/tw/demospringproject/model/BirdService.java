package tw.demospringproject.model;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BirdService {

	@Autowired
	private BirdRepository bResp;

	public Bird insert(Bird bird) {
		return bResp.save(bird);
	}

	public Bird update(Bird bird) {
		return bResp.save(bird);
	}

	public void deleteById(Integer id) {
		bResp.deleteById(id);
	}

	public Bird selectById(Integer id) {
		Optional<Bird> op1 = bResp.findById(id);
		if (op1.isPresent()) {
			return op1.get();
		}

		return null;
	}

	public List<Bird> selectAll() {
		return bResp.findAll();
	}
}
