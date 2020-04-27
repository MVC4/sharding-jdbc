package sjdbc.db.sharding.table.springboot.repository;

import org.apache.ibatis.annotations.Mapper;
import sjdbc.db.sharding.table.springboot.entity.LouDong;

import java.util.List;


@Mapper
public interface LouDongRepository {
	
	Long addLouDong(LouDong louDong);
	
	List<LouDong> list();
}
