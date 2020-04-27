package sjdbc.db.sharding.table.read.write.springboot.services;

import sjdbc.db.sharding.table.read.write.springboot.po.User;

import java.util.List;



public interface UserService {

	List<User> list();
	
	Long add(User user);
	
	User findById(Long id);
	
	User findByName(String name);
	
}
