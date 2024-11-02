package com.loose.coupling;

public class UserManager {
	
	private UserDataProvider userDataProvider;

	
	public UserManager(UserDataProvider userDataProvider) {
		super();
		this.userDataProvider = userDataProvider;
	}

	
	public String getUserInfo() {
		return userDataProvider.getUserDetails();
	}
}
