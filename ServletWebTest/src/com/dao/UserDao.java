package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.model.Studednt;
import com.model.User;

public class UserDao extends DataBase {
	
	public User loginCheck(String name,String pwd)
	{
		User user =null;
		try {
			Connection conn = getConnection();
			Statement smt = conn.createStatement();
			String sql="select * from Users where u_LoginName='"+name+"' and u_pwd='"+pwd+"'";
			
			ResultSet rs =smt.executeQuery(sql);
			
			if(rs.next())
			{
				user =new User();
				user.setU_id(rs.getInt("U_id"));
				user.setU_LoginName(rs.getString("U_LoginName"));
				user.setU_pwd(rs.getString("U_pwd"));
				user.setU_realName(rs.getString("U_realName"));
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
	}
}
