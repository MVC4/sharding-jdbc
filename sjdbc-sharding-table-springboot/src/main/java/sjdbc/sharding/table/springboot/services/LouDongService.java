package sjdbc.sharding.table.springboot.services;

import sjdbc.sharding.table.springboot.entity.LouDong;

import java.util.List;



public interface LouDongService {

	List<LouDong> list();
	
	Long addLouDong(LouDong louDong);
		
}
