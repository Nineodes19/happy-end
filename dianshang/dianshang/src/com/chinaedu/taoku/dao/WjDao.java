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
		
		//sql���
		String sql = "select * from wj where pid=?";

		List<Wj> products = new ArrayList<Wj>();
		
		try {
			//��������
			Connection conn = DbUtil.open();
			//�����������
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			//ִ������
			ResultSet set = pst.executeQuery();
			Wj p=null;
			
			if(set.next()) {
				//��ȡ�������ÿһ�е�ֵ
				int pid = set.getInt("pid");
				String pname = set.getString("pname");
				int pprice = set.getInt("pprice");
				int ppricezk = set.getInt("ppricezk");
				String pimg = set.getString("pimg");
				String pdes = set.getString("pdes");
				int pcata = set.getInt("pcata");
				//���ݻ�ȡ��ֵ����һ������
				p= new Wj();
				p.setPcata(pcata);
				p.setPdes(pdes);
				p.setPid(pid);
				p.setPimg(pimg);
				p.setPname(pname);
				p.setPprice(pprice);
				p.setPpricezk(ppricezk);
				
				
					
			}			
			//�ر�����
			DbUtil.close(null, pst, conn);
			return p;
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	public List<Wj> findProduct() {
		
		//sql���
		String sql = "select * from wj limit 0, 12";

		List<Wj> products = new ArrayList<Wj>();
		
		try {
			//��������
			Connection conn = DbUtil.open();
			//�����������
			PreparedStatement pst = conn.prepareStatement(sql);
			
			//ִ������
			ResultSet set = pst.executeQuery();
			
			
			while(set.next()) {
				//��ȡ�������ÿһ�е�ֵ
				int pid = set.getInt("pid");
				String pname = set.getString("pname");
				int pprice = set.getInt("pprice");
				int ppricezk = set.getInt("ppricezk");
				String pimg = set.getString("pimg");
				String pdes = set.getString("pdes");
				int pcata = set.getInt("pcata");
				//���ݻ�ȡ��ֵ����һ������
				Wj p= new Wj();
				p.setPcata(pcata);
				p.setPdes(pdes);
				p.setPid(pid);
				p.setPimg(pimg);
				p.setPname(pname);
				p.setPprice(pprice);
				p.setPpricezk(ppricezk);
				//����Ʒ���뼯����
				products.add(p);
					
			}			
			//�ر�����
			DbUtil.close(null, pst, conn);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return products;
	}
}
