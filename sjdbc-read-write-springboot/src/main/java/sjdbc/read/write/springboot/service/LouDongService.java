package sjdbc.read.write.springboot.service;



import sjdbc.read.write.springboot.po.LouDong;

import java.util.List;

public interface LouDongService {

	List<LouDong> list();
	
	Long addLouDong(LouDong louDong);
		
}
