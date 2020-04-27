package sjdbc.read.write.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sjdbc.read.write.springboot.po.LouDong;
import sjdbc.read.write.springboot.repository.LouDongRepository;


import java.util.List;

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
