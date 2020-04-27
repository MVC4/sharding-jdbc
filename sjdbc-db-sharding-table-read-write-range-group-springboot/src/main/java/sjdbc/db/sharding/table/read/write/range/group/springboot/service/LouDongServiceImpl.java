package sjdbc.db.sharding.table.read.write.range.group.springboot.service;

import java.util.List;

import sjdbc.db.sharding.table.read.write.range.group.springboot.repository.LouDongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sjdbc.db.sharding.table.read.write.range.group.springboot.po.LouDong;

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
