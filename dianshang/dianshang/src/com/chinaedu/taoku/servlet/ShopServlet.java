package com.chinaedu.taoku.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chinaedu.taoku.dao.ProductDao;
import com.chinaedu.taoku.pojo.Product;

/**
 * Servlet implementation class ShopServlet
 */
public class ShopServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		ProductDao dao = new ProductDao();
		Product product = dao.findProductByPk(Integer.parseInt(id));
		HttpSession session = request.getSession();
		List<Product> cart = (List) session.getAttribute("cart");
		if(cart == null) {
			cart = new ArrayList<Product>();
			//�����ﳵ����session��
			session.setAttribute("cart", cart);
		}
		//����Ʒ���빺�ﳵ��
		cart.add(product);
		
		//ת���ɹ�ҳ��
		request.setAttribute("msg", "���Ѿ��ɹ�������Ʒ���빺�ﳵ��");
		request.setAttribute("p", product);
		request.getRequestDispatcher("info.jsp").forward(request, response);
	}

}
