package sjdbc.db.sharding.table.read.write.range.group.springboot.service;

import java.util.List;

import sjdbc.db.sharding.table.read.write.range.group.springboot.po.User;

public interface UserService {

	List<User> list();
	
	Long add(User user);
	
	User findById(Long id);
	
	User findByName(String name);
	
}
