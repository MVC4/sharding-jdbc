package sjdbc.sharding.table.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sjdbc.sharding.table.springboot.entity.User;
import sjdbc.sharding.table.springboot.repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<User> list() {
		return userRepository.list();
	}

	public Long add(User user) {
		return userRepository.addUser(user);
	}

	@Override
	public User findById(Long id) {
		return userRepository.findById(id);
	}

	@Override
	public User findByName(String name) {
		return userRepository.findByName(name);
	}

}
