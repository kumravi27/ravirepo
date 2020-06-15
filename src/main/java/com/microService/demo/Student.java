package com.microService.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microService.filter.SimpleUrlFilter;
import com.microService.model.User;
import com.microService.model.UserData;
import com.microService.model.UserDataWrapper;

@CrossOrigin(origins = "*") //http://localhost:4200
@RestController
public class Student {
	
	protected int variable = 10 ;
	
	public Student() {
		System.out.println(this.getClass().toString() + "  Class inititated ");
	}
	
	@RequestMapping("/student/{id}")
	public String getStudent(@PathVariable String id)
	{   //String id="1";
		String name = null;
		if(id.isEmpty() )
			name=  "Empty";
		if (id.equals("1"))
			name= "Ravi";
		else
			name ="Everyone";
		return name;		
	}
	
	
	@GetMapping(path ="/users" )
	public UserData getUserList() {
		//System.out.println("Request Header Names ="  + request.getHeaderNames());
		List<User> u = new ArrayList<User>();
		u.add(new User("Ravi", "Project Lead", "Middletown", Arrays.asList("777-777-7777", "000-000-0000", "666-666-6666") , "10/7/1982"));
		u.add(new User("Ravi", "Test Lead", "Middletown", Arrays.asList("444-777-7777", "000-000-0000", "666-666-6666") , "10/7/1982"));
		u.add(new User("Pawan", "Manager", "New Delhi", Arrays.asList("999-999-9999") , "10/7/1982"));
		u.add(new User("Diwan", "Group Head", "Malborne", Arrays.asList("888-888-8888", "111-111-1111") , "10/7/1982"));
		int count = u.size();
		return new UserData(u,count);	
	}
	
	@RequestMapping(method=RequestMethod.GET , path = "/users/{name}")
	public UserData getUser(@PathVariable String name) {
		List<User> u = new ArrayList<User>();
		List<User> empthy = new ArrayList<User>();
		u.add(new User("Ravi", "Project Lead", "Middletown", Arrays.asList("777-777-7777", "000-000-0000", "666-666-6666") , "10/7/1982"));
		u.add(new User("Ravi", "Test Lead", "Middletown", Arrays.asList("444-777-7777", "000-000-0000", "666-666-6666") , "10/7/1982"));
		u.add(new User("Pawan", "Manager", "New Delhi", Arrays.asList("999-999-9999") , "10/7/1982"));
		u.add(new User("Diwan", "Group Head", "Malborne", Arrays.asList("888-888-8888", "111-111-1111") , "10/7/1982"));
		int count = u.size();
		
		u.forEach((i) -> { if(i.getName().equals(name)) 
							empthy.add(i);
							});
		

		return new UserData(empthy,empthy.size());	
	}
 
	@RequestMapping(method=RequestMethod.GET, path="one")
	public String getOne(HttpServletRequest request, HttpServletResponse response)
	{
		System.out.println("Print Request method ="  + request.getMethod());
		return getTwo(response);
	}
	
	@RequestMapping(method=RequestMethod.GET, path="two")
	public String getTwo(HttpServletResponse response)
	{
			return "returning by function entryTwo";
	}
	
}
