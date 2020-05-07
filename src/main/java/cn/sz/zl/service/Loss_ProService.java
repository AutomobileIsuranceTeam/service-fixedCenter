package cn.sz.zl.service;

import java.util.List;

import cn.sz.zl.pojo.Loss_Pro;
import cn.sz.zl.pojo.Up_Loss;

public interface Loss_ProService {

	public String addLossPro(Loss_Pro Loss_Pro);
	
	public String updateLoss(Loss_Pro Loss_Pro);
	
	public List<Loss_Pro> findAll();

	public Loss_Pro findbyId(Integer id);
	
	public List<Loss_Pro> findbytype(String type);//通过状态查询，及是否为驳回状态
	
	
	public List<Loss_Pro> findbymoney(Loss_Pro Losspro );//查询未处理项目
	
}
