package com.microService.model;

import java.util.List;


public class UserData {
	private List<User> usrlist;
	private int usrcount;
	
	public UserData(){
		super();
	}
	
	public UserData(List<User> ulist, int count){
		this.usrcount = count;
		this.usrlist = ulist;
	}

	public List<User> getUsrlist() {
		return usrlist;
	}
	public void setUsrlist(List<User> usrlist) {
		this.usrlist = usrlist;
	}

	public int getUsrcount() {
		return usrcount;
	}
	public void setUsrcount(int usrcount) {
		this.usrcount = usrcount;
	} 	
	
}
