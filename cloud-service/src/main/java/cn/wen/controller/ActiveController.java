package cn.wen.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.wen.service.ActiveService;

@Controller
@RequestMapping("/active")
public class ActiveController {

	// @Autowired
	// DataSourceProperties dataSourceProperties;
	@Autowired
	ActiveService activeService;

	@ResponseBody
	@RequestMapping("/index")
	public String index() {

		String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
		Object obj = JSONValue.parse(s);
		JSONArray array = (JSONArray) obj;

		return s;
	}
}
