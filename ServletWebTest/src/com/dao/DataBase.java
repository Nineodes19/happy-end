package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {
	
	private  String url = "jdbc:sqlserver://localhost:1433;databaseName=StudentManager";
	private  String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private  String user = "sa";
	private  String password = "zhrmghg";
	
	public java.sql.Connection getConnection(){// 获取连接
		Connection cnn=null;
		try {
			
			Class.forName(driver);// 加载驱动程序
			cnn= DriverManager.getConnection(url, user, password);
						
		} catch (java.sql.SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		    return cnn;
	}

}
