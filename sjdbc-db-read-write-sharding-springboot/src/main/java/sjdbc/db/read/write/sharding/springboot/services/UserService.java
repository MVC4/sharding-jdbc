package sjdbc.db.read.write.sharding.springboot.services;

import java.util.List;

import sjdbc.db.read.write.sharding.springboot.entity.User;

public interface UserService {

	List<User> list();
	
	Long add(User user);
	
	User findById(Long id);
	
	User findByName(String name);
	
}
