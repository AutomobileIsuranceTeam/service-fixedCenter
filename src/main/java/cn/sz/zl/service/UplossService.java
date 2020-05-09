package cn.sz.zl.service;

import java.math.BigInteger;
import java.util.List;

import cn.sz.zl.pojo.Up_Loss;

public interface UplossService {
	public List<Up_Loss> findUp(BigInteger loss);//查询报案中心提交的案件
	
	
}
