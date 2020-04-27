package sjdbc.sharding.table.read.write.springboot.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import sjdbc.sharding.table.read.write.springboot.po.LouDong;


@Mapper
public interface LouDongRepository {
	
	Long addLouDong(LouDong louDong);
	
	List<LouDong> list();
}
