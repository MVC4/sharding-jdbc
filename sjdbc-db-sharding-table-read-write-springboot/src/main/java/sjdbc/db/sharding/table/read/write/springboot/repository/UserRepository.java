package sjdbc.db.sharding.table.read.write.springboot.repository;

import org.apache.ibatis.annotations.Mapper;
import sjdbc.db.sharding.table.read.write.springboot.po.User;


import java.util.List;


@Mapper
public interface UserRepository {
	
	Long addUser(User user);
	
	List<User> list();
	
	User findById(Long id);
	
	User findByName(String name);
}
