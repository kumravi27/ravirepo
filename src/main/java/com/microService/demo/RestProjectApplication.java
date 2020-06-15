package com.microService.demo;

import javax.servlet.http.HttpServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@ComponentScan()
//@ComponentScan({"com.microService.filter.SimpleUrlFilter"})
//@Configuration
@SpringBootApplication
public class RestProjectApplication extends HttpServlet {
	public static Logger logger = LoggerFactory.getLogger(RestProjectApplication.class);
	
	public static ApplicationContext appContext;
	
	
	public void intt() {
		logger.info("application started");
	}
	
	public static void main(String[] args) {
		logger.info("application executed");
		logger.info("application executed - n times");
		//appContext= SpringApplication.run(RestProjectApplication.class, args);
		//String beans[] = {"simpleUrlFilter" , "simpleFilter" , "student"};		       
		for( String bb : beans)
		checkBeanInContext(bb);	  
	}

	
	public static void checkBeanInContext(String s){
		System.out.println("Bean  " + s + " exists = " +	appContext.containsBean(s));
		
	}
}
