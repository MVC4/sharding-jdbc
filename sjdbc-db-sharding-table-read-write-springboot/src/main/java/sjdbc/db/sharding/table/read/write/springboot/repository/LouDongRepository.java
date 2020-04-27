package sjdbc.db.sharding.table.read.write.springboot.repository;

import org.apache.ibatis.annotations.Mapper;
import sjdbc.db.sharding.table.read.write.springboot.po.LouDong;


import java.util.List;


@Mapper
public interface LouDongRepository {
	
	Long addLouDong(LouDong louDong);
	
	List<LouDong> list();
}
