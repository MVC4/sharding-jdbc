package sjdbc.db.read.write.sharding.springboot.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import sjdbc.db.read.write.sharding.springboot.entity.LouDong;


@Mapper
public interface LouDongRepository {
	
	Long addLouDong(LouDong louDong);
	
	List<LouDong> list();
}
