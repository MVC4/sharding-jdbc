package sjdbc.sharding.table.read.write.springboot.service;

import java.util.List;

import sjdbc.sharding.table.read.write.springboot.po.LouDong;

public interface LouDongService {

	List<LouDong> list();
	
	Long addLouDong(LouDong louDong);
		
}
