package org.ssglobal.training.codes.login;

public class LogInFactory {
	
	public boolean isValidUser() {
		LogInAuth auth = new LogInAuth();
		LogPermission permission = new LogPermission();
		Logout logout = new Logout();
		return true;
	}

}
