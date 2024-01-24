package com.example.demo.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	// Authintication
	// name - uday
	// pwd - test

	public boolean authenticate(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("uday");
		boolean isValidPwd = password.equalsIgnoreCase("test");
		
		return isValidUserName && isValidPwd;
	}

}
