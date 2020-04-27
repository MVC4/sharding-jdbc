package sjdbc.db.read.write.sharding.springboot.services;

import java.util.List;

import sjdbc.db.read.write.sharding.springboot.entity.LouDong;

public interface LouDongService {

	List<LouDong> list();
	
	Long addLouDong(LouDong louDong);
		
}
