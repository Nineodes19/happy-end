package com.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.model.Studednt;

public class StudedntDao extends DataBase {
	
	
	public List<Studednt> getAllStudents(String keyword)
	{
		List<Studednt> list = new ArrayList<Studednt>();
		
		try {
			Connection conn = getConnection();
			Statement smt = conn.createStatement();
			String sql="select * from StudentInfo";
			if(!keyword.equals(""))
			{
				sql+=" where stu_name like '%"+keyword+"%'";
			}   
			
			
			ResultSet rs =smt.executeQuery(sql);
			
			while(rs.next())
			{
				Studednt stu =new Studednt();
				stu.setStu_xh(rs.getString("stu_xh"));
				stu.setStu_name(rs.getString("stu_name"));
				stu.setStu_sex(rs.getString("stu_sex"));
				stu.setStu_age(rs.getInt("stu_age"));
				stu.setStu_mobile(rs.getString("stu_mobile"));
				stu.setStu_address(rs.getString("stu_address"));
				list.add(stu);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public boolean addStudent(Studednt stu)
	{
		boolean flag = false;
		
		try {
			Connection conn = getConnection();
			Statement smt = conn.createStatement();
			String sql="insert into StudentInfo(stu_xh,stu_name,stu_sex,stu_age,stu_mobile,stu_address) values(";
			sql+="'"+stu.getStu_xh()+"',";
			sql+="'"+stu.getStu_name()+"',";
			sql+="'"+stu.getStu_sex()+"',";
			sql+="'"+stu.getStu_age()+"',";
			sql+="'"+stu.getStu_mobile()+"',";
			sql+="'"+stu.getStu_address()+"')";
			
			int num = smt.executeUpdate(sql);
			if(num>0)
				flag = true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public boolean delStudent(String xh)
	{
		boolean flag = false;
		
		try {
			Connection conn = getConnection();
			Statement smt = conn.createStatement();
			String sql="delete from StudentInfo where stu_xh='"+xh+"'";
			
			int num = smt.executeUpdate(sql);
			if(num>0)
				flag = true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return flag;
	}
	
	public Studednt getOneStudentByXh(String xh)
	{
		Studednt stu =null;
		try {
			Connection conn = getConnection();
			Statement smt = conn.createStatement();
			String sql="select * from StudentInfo where stu_xh='"+xh+"'";
			
			
			ResultSet rs =smt.executeQuery(sql);
			
			if(rs.next())
			{
				stu =new Studednt();
				stu.setStu_xh(rs.getString("stu_xh"));
				stu.setStu_name(rs.getString("stu_name"));
				stu.setStu_sex(rs.getString("stu_sex"));
				stu.setStu_age(rs.getInt("stu_age"));
				stu.setStu_mobile(rs.getString("stu_mobile"));
				stu.setStu_address(rs.getString("stu_address"));
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stu;
	}
	
	public boolean updateStudent(Studednt stu)
	{
		boolean flag = false;
		
		try {
			Connection conn = getConnection();
			Statement smt = conn.createStatement();
			String sql="update StudentInfo set";
			
			sql+=" stu_name='"+stu.getStu_name()+"',";
			sql+=" stu_sex='"+stu.getStu_sex()+"',";
			sql+=" stu_age='"+stu.getStu_age()+"',";
			sql+=" stu_mobile='"+stu.getStu_mobile()+"',";
			sql+=" stu_address='"+stu.getStu_address()+"'";
			sql+="  where stu_xh='"+stu.getStu_xh()+"'";
			int num = smt.executeUpdate(sql);
			if(num>0)
				flag = true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return flag;
	}

}
