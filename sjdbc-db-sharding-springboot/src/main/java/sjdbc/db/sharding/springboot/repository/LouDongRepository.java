package sjdbc.db.sharding.springboot.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import sjdbc.db.sharding.springboot.po.LouDong;


@Mapper
public interface LouDongRepository {
	
	Long addLouDong(LouDong louDong);
	
	List<LouDong> list();
}
