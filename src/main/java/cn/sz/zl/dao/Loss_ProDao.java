package cn.sz.zl.dao;

import java.util.List;

import cn.sz.zl.pojo.Loss_Pro;
import cn.sz.zl.pojo.Up_Loss;

public interface Loss_ProDao {

	public void add(Loss_Pro Loss_Pro);//创建定损项目
	
	public Loss_Pro updateLoss(Loss_Pro Loss_Pro);//定损
	
	public List<Loss_Pro> findAll();

	public Loss_Pro findbyId(Integer id);//查询单个案件
	
	public List<Loss_Pro> findbytype(String type);//通过状态查询，及是否为驳回状态
	
	public List<Up_Loss> findUp();//查询报案中心提交的案件
	
	public List<Loss_Pro> findbymoney(Loss_Pro pro);//查询未处理项目
}
