/**
 * @{#} HelloController.java Create on 2016年5月25日 上午9:35:38
 *
 * Copyright (c) 2016 by JRJ. 
 */

package com.swj.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
  *
  * 测试controller
  * @history 
  * <PRE> 
  * --------------------------------------------------------- 
  * VERSION       DATE            BY       CHANGE/COMMENT 
  * --------------------------------------------------------- 
  * 1.0           2016年5月25日       wenjie.shi               create  
  * ---------------------------------------------------------
  * </PRE>
  *
  */

@Controller
public class HelloController {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello(Long username){
		return "hello, "+ username +" welcome study spring boot";
	}
	
	@RequestMapping("/hellow")
	public String hellow(Map<String, Object> model){
		
		List<String> list = new ArrayList<String>();
		list.add("hello,zookeeper");
		list.add("hello,spring boot");
		list.add("hello,mybatis");
		//将数据放入到map中，页面velocity上 直接使用key访问
		model.put("data", list);
		return "hello";
	}
}
