package sjdbc.db.sharding.table.read.write.range.group.springboot.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import sjdbc.db.sharding.table.read.write.range.group.springboot.po.User;


@Mapper
public interface UserRepository {
	
	Long addUser(User user);
	
	List<User> list();
	
	User findById(Long id);
	
	User findByName(String name);
}
