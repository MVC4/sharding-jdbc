package sjdbc.db.sharding.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sjdbc.db.sharding.springboot.po.LouDong;
import sjdbc.db.sharding.springboot.repository.LouDongRepository;

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
