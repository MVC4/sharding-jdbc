package sjdbc.sharding.table.springboot.repository;



import org.apache.ibatis.annotations.Mapper;
import sjdbc.sharding.table.springboot.entity.User;

import java.util.List;


@Mapper
public interface UserRepository {
	
	Long addUser(User user);
	
	List<User> list();
	
	User findById(Long id);
	
	User findByName(String name);
}
