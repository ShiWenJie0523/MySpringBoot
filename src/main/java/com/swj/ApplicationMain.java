/**
 * @{#} ApplicationMain.java Create on 2016年5月25日 上午9:48:04
 *
 * Copyright (c) 2016 by JRJ. 
 */

package com.swj;

import java.util.Properties;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;

/**
  *
  * 程序启动main入口
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

@Configuration//配置控制
@EnableAutoConfiguration//启动自动配置
@ComponentScan//启动扫描
public class ApplicationMain extends WebMvcConfigurerAdapter{

	//用于处理编码
	@Bean
	public Filter characterEncodingFilter(){
		CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
		characterEncodingFilter.setEncoding("UTF-8");
		characterEncodingFilter.setForceEncoding(true);
		return characterEncodingFilter;
	}
	
	/*@Bean
	public VelocityConfigurer velocityConfigurer(){
		VelocityConfigurer velocityConfigurer = new VelocityConfigurer();
		velocityConfigurer.setResourceLoaderPath("/WEB-INF/templates");
		Properties velocityProperties = new Properties();
		velocityProperties.setProperty("input.encoding", "UTF-8");
		velocityProperties.setProperty("output.encoding", "UTF-8");
		velocityConfigurer.setVelocityProperties(velocityProperties);
		return velocityConfigurer;
	}*/
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationMain.class, args);
	}
}
