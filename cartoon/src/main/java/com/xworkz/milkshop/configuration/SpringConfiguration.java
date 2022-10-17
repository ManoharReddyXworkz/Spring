package com.xworkz.milkshop.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
@Configuration
@ComponentScan(basePackages = "com")
public class SpringConfiguration {

	public SpringConfiguration() {
	System.out.println("created"+this.getClass().getSimpleName());
	}
	
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("calling  ViewResolver");
		return new InternalResourceViewResolver("/",".jsp") ;
		
	}
}