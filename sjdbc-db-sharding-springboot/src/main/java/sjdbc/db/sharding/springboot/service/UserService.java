package sjdbc.db.sharding.springboot.service;

import java.util.List;

import sjdbc.db.sharding.springboot.po.User;

public interface UserService {

	List<User> list();
	
	Long add(User user);
	
	User findById(Long id);
	
	User findByName(String name);
	
}
