package cn.sz.zl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.sz.zl.pojo.Loss_Pro;
import cn.sz.zl.service.Loss_ProService;

@Controller
@RequestMapping("/fixed")
public class FixedCenterController {
	
	@Autowired
	private Loss_ProService proservice;
	
	
	//生成定损项目
	@ResponseBody
	@RequestMapping(value="/addlosspro",method=RequestMethod.POST)
	public String addlosspro(@RequestBody Loss_Pro pro) {
		if(proservice.addLossPro(pro).equals("default")) {
			return "default";
		}
		return "suc";
	}
	
	//修改定损信息、价格
	@ResponseBody
	@RequestMapping(value="/uplosspro",method=RequestMethod.POST)
	public String uplosspro(@RequestBody Loss_Pro pro) {
		if(proservice.updateLoss(pro).equals("default")) {
			return "default";
		}
		return "suc";
		
	}
	
	//查看所有定损项目
	@RequestMapping(value="/findall",method=RequestMethod.POST)
	public List<Loss_Pro> findall(){
		if(proservice.findAll().equals(null)) {
			return null;
		}
		return proservice.findAll();
	}
	
	
	//单个查询定损项目（按ID查询）
	@ResponseBody
	@RequestMapping(value="/findbyid",method=RequestMethod.POST)
	public Loss_Pro findbyid(@RequestBody Integer id) {
		if(proservice.findbyId(id).equals(null)) {
			return null;
		}
		return proservice.findbyId(id);
	}
	
	//按照项目状态查询
	@ResponseBody
	@RequestMapping(value="/findbytype",method=RequestMethod.POST)
	public List<Loss_Pro> findbytype(@RequestBody String type) {
		if(proservice.findbytype(type).equals(null)) {
			return null;
		}
		return proservice.findbytype(type);
	}
	
}
