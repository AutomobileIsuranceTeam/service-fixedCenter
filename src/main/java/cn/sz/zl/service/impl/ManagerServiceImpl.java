package cn.sz.zl.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.sz.zl.dao.IManagerDao;
import cn.sz.zl.pojo.Manager;
import cn.sz.zl.service.IManagerService;

@Service
public class ManagerServiceImpl implements IManagerService {

	@Autowired
	private IManagerDao managerdao;
	
	@Override
	public Manager checklogin(Manager manager) {
		if(manager==null) {
			return null;
		}
		return managerdao.checklogin(manager);
	}

}
