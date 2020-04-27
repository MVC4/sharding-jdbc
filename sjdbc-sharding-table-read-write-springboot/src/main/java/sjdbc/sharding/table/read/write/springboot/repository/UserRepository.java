package sjdbc.sharding.table.read.write.springboot.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import sjdbc.sharding.table.read.write.springboot.po.User;


@Mapper
public interface UserRepository {
	
	Long addUser(User user);
	
	List<User> list();
	
	User findById(Long id);
	
	User findByName(String name);
}
