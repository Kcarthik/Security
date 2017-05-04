package com.niit.sec.dao;

import com.niit.sec.model.User;

public interface UserDao {
	User findByUserName(String username);
}
