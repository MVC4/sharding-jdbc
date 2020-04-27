package sjdbc.sharding.table.springboot.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import sjdbc.sharding.table.springboot.entity.LouDong;


@Mapper
public interface LouDongRepository {
	
	Long addLouDong(LouDong louDong);
	
	List<LouDong> list();
}
