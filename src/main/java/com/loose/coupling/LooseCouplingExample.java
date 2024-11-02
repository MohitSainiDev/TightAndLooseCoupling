package com.loose.coupling;

public class LooseCouplingExample {

	public static void main(String[] args) {
		// UserDataProvider userDataProvider = new UserDatabaseProvider();

		UserDataProvider userDataProvider = new UserDatabaseProvider();
		UserDataProvider userWebServiceProvider = new WebServiceProvider();
		UserManager userManager = new UserManager(userWebServiceProvider);
		System.out.println(userManager.getUserInfo());

	}

}
