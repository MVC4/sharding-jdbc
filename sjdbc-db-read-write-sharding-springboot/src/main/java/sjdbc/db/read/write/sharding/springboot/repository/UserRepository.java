package sjdbc.db.read.write.sharding.springboot.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import sjdbc.db.read.write.sharding.springboot.entity.User;


@Mapper
public interface UserRepository {
	
	Long addUser(User user);
	
	List<User> list();
	
	User findById(Long id);
	
	User findByName(String name);
}
