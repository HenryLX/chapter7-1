package com.ylx.BeanUtils;

public class User {
	private String userName;
    private String userPassword;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPassword=" + userPassword
				+ "]";
	}
}
