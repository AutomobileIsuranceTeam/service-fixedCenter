package cn.sz.zl.controller;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sz.zl.pojo.Up_Loss;
import cn.sz.zl.service.UplossService;

@Controller
@RequestMapping("/uploss")
public class UpLossController {

	@Autowired
	private UplossService upservice;
	
	@ResponseBody
	@RequestMapping(value="/findup",method=RequestMethod.POST)
	public List<Up_Loss> findup(BigInteger loss){
		if(upservice.findUp(loss).equals(null)) {
			return null;
		}
		return upservice.findUp(loss);
		
	}
	
	
}
