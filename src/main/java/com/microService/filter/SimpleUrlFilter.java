package com.microService.filter;
import com.microService.demo.Student;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class SimpleUrlFilter extends Student//implements Filter
{
	Student s = new Student();
	public SimpleUrlFilter() {
		//System.out.println(s.variable);
		System.out.println(this.getClass().toString() + "  Class inititated ");
	}
	
//	@Override
//	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
//			throws IOException, ServletException {
//		// TODO Auto-generated method stub
//		System.out.println("Request : "+request.getRemoteHost());
//		System.out.println("Request : "+request.getRemoteAddr());
//	}
//
//	@Override
//	public void init(FilterConfig filterconfig) throws ServletException {}
//	
//	@Override
//	public void destroy() {}
}
