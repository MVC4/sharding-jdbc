package sjdbc.db.sharding.table.read.write.range.group.springboot.service;

import java.util.List;

import sjdbc.db.sharding.table.read.write.range.group.springboot.po.LouDong;

public interface LouDongService {

	List<LouDong> list();
	
	Long addLouDong(LouDong louDong);
		
}
