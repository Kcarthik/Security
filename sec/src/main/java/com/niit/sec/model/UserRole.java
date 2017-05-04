package com.niit.sec.model;

import javax.persistence.Entity;

@Entity
public class UserRole{

	 Integer userRoleId;
	 public Integer getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	User user;
	 String role;


}