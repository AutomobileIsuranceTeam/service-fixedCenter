package cn.sz.zl.service.impl;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sz.zl.dao.UpLossDao;
import cn.sz.zl.pojo.Up_Loss;
import cn.sz.zl.service.UplossService;

@Service
public class UpLossServiceImpl implements UplossService {

	@Autowired
	private UpLossDao updao;
	
	@Override
	public List<Up_Loss> findUp(BigInteger loss) {
		
		return updao.findUp(loss);
	}

}
