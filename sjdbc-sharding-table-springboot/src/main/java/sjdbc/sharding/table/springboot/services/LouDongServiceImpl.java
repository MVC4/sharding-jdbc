package sjdbc.sharding.table.springboot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sjdbc.sharding.table.springboot.entity.LouDong;
import sjdbc.sharding.table.springboot.repository.LouDongRepository;


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
