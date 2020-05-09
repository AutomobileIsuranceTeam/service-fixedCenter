package cn.sz.zl.dao;

import java.math.BigInteger;
import java.util.List;

import cn.sz.zl.pojo.Up_Loss;

public interface UpLossDao {

	public List<Up_Loss> findUp(BigInteger loss);//查询报案中心提交的案件
	
	
}
