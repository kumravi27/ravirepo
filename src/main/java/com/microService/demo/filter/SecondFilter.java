package com.microService.demo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(2) //Order in 2nd for filter execution
@Component
public class SecondFilter implements Filter{
	
	public SecondFilter() {
		System.out.println(this.getClass() + "  Class inititated ");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
	      HttpServletRequest httprequest = (HttpServletRequest)request;
	      HttpServletResponse httpresponse = (HttpServletResponse) response;
	      
	      
	      if(httprequest.getRequestURL().toString().endsWith("Ravi"))
	      {
	    	  httpresponse.getOutputStream().flush();
	    	  httpresponse.getOutputStream().println("Called by 2nd Filter = You are not allowed to see details");
	    	  return;
	      }
	      chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig filterconfig) throws ServletException {}
	
	@Override
	public void destroy() {}
}
