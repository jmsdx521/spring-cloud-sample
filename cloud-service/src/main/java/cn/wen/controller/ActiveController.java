package cn.wen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.wen.service.ActiveService;

@Controller
@RequestMapping("/active")
public class ActiveController {
	
//	@Autowired
//	DataSourceProperties dataSourceProperties;
	@Autowired
	ActiveService activeService;
	
	@ResponseBody
	@RequestMapping("/index")
	public String index(){
		
		return activeService.index();
	}
}
