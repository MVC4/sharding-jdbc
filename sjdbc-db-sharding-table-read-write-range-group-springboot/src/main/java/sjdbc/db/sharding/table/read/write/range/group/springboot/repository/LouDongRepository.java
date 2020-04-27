package sjdbc.db.sharding.table.read.write.range.group.springboot.repository;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import sjdbc.db.sharding.table.read.write.range.group.springboot.po.LouDong;


@Mapper
public interface LouDongRepository {
	
	Long addLouDong(LouDong louDong);
	
	List<LouDong> list();
}
