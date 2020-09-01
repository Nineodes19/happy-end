package com.service;

import com.dao.UserDao;
import com.model.User;

public class UserService {
    private UserDao dao=new UserDao();
    
    public User loginCheck(String name,String pwd)
	{
    	return dao.loginCheck(name, pwd);
	}
}
