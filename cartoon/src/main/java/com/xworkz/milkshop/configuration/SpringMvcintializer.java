package com.xworkz.milkshop.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcintializer extends 
AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer{

	public SpringMvcintializer() {
		
		System.out.println("Calling:" + this.getClass().getSimpleName());
	}
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("calling getRootConfigClasses Method");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
	System.out.println("Created getServletConfigClasses");
		return new Class[]{SpringConfiguration.class};
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("created getServletMappings");
		return new String[] {"/"};
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Calling configureDefaultServletHandling Method");
		configurer.enable();
	}
}
