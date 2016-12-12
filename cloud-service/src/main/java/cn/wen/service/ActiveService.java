package cn.wen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.wen.conf.DataSourceProperties;

@Service
public class ActiveService {
	@Autowired
	DataSourceProperties dataSourceProperties;
	public String index(){
		System.out.println(dataSourceProperties.getUrl());
		return dataSourceProperties.getUrl();
	}
}
