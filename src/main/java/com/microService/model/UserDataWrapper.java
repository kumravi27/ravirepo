package com.microService.model;

public class UserDataWrapper {
	UserData userData;
	
	public UserData getUserData() {
		return userData;
	}

	public void setUserData(UserData userData) {
		this.userData = userData;
	}

	public UserDataWrapper() {
		super();
	}
	
	public UserDataWrapper(UserData _userData) {
		this.userData=_userData;
	}
}
