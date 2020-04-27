package sjdbc.db.sharding.springboot.service;

import java.util.List;

import sjdbc.db.sharding.springboot.po.LouDong;

public interface LouDongService {

	List<LouDong> list();
	
	Long addLouDong(LouDong louDong);
		
}
