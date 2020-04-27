package sjdbc.sharding.table.springboot.services;

import sjdbc.sharding.table.springboot.entity.User;

import java.util.List;



public interface UserService {

	List<User> list();
	
	Long add(User user);
	
	User findById(Long id);
	
	User findByName(String name);
	
}
