package com.chinaedu.taoku.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.chinaedu.taoku.pojo.Wj;
import com.chinaedu.taoku.utils.DbUtil;

public class WjDao {
public Wj findProductByPk(int id) {
		
		//sql语句
		String sql = "select * from wj where pid=?";

		List<Wj> products = new ArrayList<Wj>();
		
		try {
			//建立连接
			Connection conn = DbUtil.open();
			//创建命令对象
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			//执行命令
			ResultSet set = pst.executeQuery();
			Wj p=null;
			
			if(set.next()) {
				//获取结果集的每一列的值
				int pid = set.getInt("pid");
				String pname = set.getString("pname");
				int pprice = set.getInt("pprice");
				int ppricezk = set.getInt("ppricezk");
				String pimg = set.getString("pimg");
				String pdes = set.getString("pdes");
				int pcata = set.getInt("pcata");
				//根据获取的值创建一个对象
				p= new Wj();
				p.setPcata(pcata);
				p.setPdes(pdes);
				p.setPid(pid);
				p.setPimg(pimg);
				p.setPname(pname);
				p.setPprice(pprice);
				p.setPpricezk(ppricezk);
				
				
					
			}			
			//关闭连接
			DbUtil.close(null, pst, conn);
			return p;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	public List<Wj> findProduct() {
		
		//sql语句
		String sql = "select * from wj limit 0, 12";

		List<Wj> products = new ArrayList<Wj>();
		
		try {
			//建立连接
			Connection conn = DbUtil.open();
			//创建命令对象
			PreparedStatement pst = conn.prepareStatement(sql);
			
			//执行命令
			ResultSet set = pst.executeQuery();
			
			
			while(set.next()) {
				//获取结果集的每一列的值
				int pid = set.getInt("pid");
				String pname = set.getString("pname");
				int pprice = set.getInt("pprice");
				int ppricezk = set.getInt("ppricezk");
				String pimg = set.getString("pimg");
				String pdes = set.getString("pdes");
				int pcata = set.getInt("pcata");
				//根据获取的值创建一个对象
				Wj p= new Wj();
				p.setPcata(pcata);
				p.setPdes(pdes);
				p.setPid(pid);
				p.setPimg(pimg);
				p.setPname(pname);
				p.setPprice(pprice);
				p.setPpricezk(ppricezk);
				//将产品放入集合中
				products.add(p);
					
			}			
			//关闭连接
			DbUtil.close(null, pst, conn);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return products;
	}
}
