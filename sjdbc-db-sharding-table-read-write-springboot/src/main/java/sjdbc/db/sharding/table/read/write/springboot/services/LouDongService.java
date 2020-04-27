package sjdbc.db.sharding.table.read.write.springboot.services;

import sjdbc.db.sharding.table.read.write.springboot.po.LouDong;

import java.util.List;



public interface LouDongService {

	List<LouDong> list();
	
	Long addLouDong(LouDong louDong);
		
}
