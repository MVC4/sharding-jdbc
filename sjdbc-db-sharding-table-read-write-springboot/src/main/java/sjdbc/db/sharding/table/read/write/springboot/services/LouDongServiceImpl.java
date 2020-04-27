package sjdbc.db.sharding.table.read.write.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sjdbc.db.sharding.table.read.write.springboot.po.LouDong;
import sjdbc.db.sharding.table.read.write.springboot.repository.LouDongRepository;


@Service
public class LouDongServiceImpl implements LouDongService {

	@Autowired
	private LouDongRepository louDongRepository;
	
	@Override
	public List<LouDong> list() {
		return louDongRepository.list();
	}

	@Override
	public Long addLouDong(LouDong louDong) {
		return louDongRepository.addLouDong(louDong);
	}

}
