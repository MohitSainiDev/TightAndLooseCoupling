package com.tight.coupling;

public class UserManager {
	private UserDatabase userDatabase = new UserDatabase();
	private WebServiceProvider userWebService = new WebServiceProvider();

	public String getUserInfo() {

		// return userDatabase.getUserDetails();
		return userWebService.getUserDetails();
	}
}
