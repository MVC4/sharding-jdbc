package sjdbc.sharding.table.read.write.springboot.service;

import java.util.List;

import sjdbc.sharding.table.read.write.springboot.po.User;

public interface UserService {

	List<User> list();
	
	Long add(User user);
	
	User findById(Long id);
	
	User findByName(String name);
	
}
