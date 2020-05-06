package cn.sz.zl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sz.zl.dao.Loss_ProDao;
import cn.sz.zl.pojo.Loss_Pro;
import cn.sz.zl.pojo.Up_Loss;
import cn.sz.zl.service.Loss_ProService;

@Service
public class Loss_ProServiceImpl implements Loss_ProService {
	
	@Autowired
	
	private Loss_ProDao prodao;
	
	@Override
	public String addLossPro(Loss_Pro Loss_Pro) {
		
		if(Loss_Pro==null) {
			return "defalut";
		}
		prodao.add(Loss_Pro);
		return "suc";
	}

	@Override
	public String updateLoss(Loss_Pro Loss_Pro) {

		if(Loss_Pro==null) {
			return "defalut";
		}
		prodao.updateLoss(Loss_Pro);
		return "suc";
	}

	@Override
	public List<Loss_Pro> findAll() {
		return prodao.findAll();
	}

	@Override
	public Loss_Pro findbyId(Integer id) {
		if(id==null) {
			return null;
		}
		
		return prodao.findbyId(id);
	}

	@Override
	public List<Loss_Pro> findbytype(String type) {
		if(type==null) {
			return null;
		}
		return prodao.findbytype(type);
	}

	@Override
	public List<Up_Loss> findUp() {
		
		return prodao.findUp();
	}

	@Override
	public List<Loss_Pro> findbymoney(Loss_Pro Losspro) {
		
		return prodao.findbymoney(Losspro);
	}	
}
