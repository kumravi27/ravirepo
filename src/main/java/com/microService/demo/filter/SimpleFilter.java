package com.microService.demo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.microService.demo.Student;

@Order(1) // 1st Filter order execute of request
@Component
public class SimpleFilter implements Filter {

	public SimpleFilter() {
		System.out.println(this.getClass() + "  Class inititated ");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
	      System.out.println("Servlet Host:"+request.getLocalName());
	      System.out.println("Servlet Address:"+request.getLocalPort());
	      
	      HttpServletRequest httprequest = (HttpServletRequest)request;
	      HttpServletResponse httpresponse = (HttpServletResponse) response;
	      System.out.println("urL captured:"+httprequest.getRequestURL());
	      System.out.println("urI captured:"+httprequest.getRequestURI());
	      
      
	      if(httprequest.getRequestURL().toString().endsWith("Diwan123"))
	      {
	    	  chain.doFilter(new HttpServletRequestWrapper((HttpServletRequest) request) {
	    		  @Override
	    		    public String getRequestURI() {
	    			  String modified_uri ="/users/Pawan";
	    		      System.out.println("urI modified :"+modified_uri);
	    			  return modified_uri; 
	    			  }
	    		  
	    		  @Override
	              public StringBuffer getRequestURL() {
	    			  StringBuffer redirectURL = new StringBuffer(((HttpServletRequest) request).getRequestURL().toString().replaceFirst("Diwan", ""));
	                  return redirectURL;
	              }
	    	  },httpresponse);
	    	  return; // Import so that it should not append below chain.do filter
	      }
	      
	      chain.doFilter(request, response);
	}
	
	@Override
	public void init(FilterConfig filterconfig) throws ServletException {}
	
	@Override
	public void destroy() {}
}
