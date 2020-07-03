package com.chinaedu.taoku.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.chinaedu.taoku.dao.CatDao;
import com.chinaedu.taoku.pojo.Cat;

public class CatShopServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public CatShopServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");
		CatDao dao = new CatDao();
		Cat cat = dao.findProductByPk(Integer.parseInt(id));
		HttpSession session = request.getSession();
		List<Cat> cart = (List) session.getAttribute("cart");
		if(cart == null) {
			cart = new ArrayList<Cat>();
			//�����ﳵ����session��
			session.setAttribute("cart", cart);
		}
		//����Ʒ���빺�ﳵ��
		cart.add(cat);
		
		//ת���ɹ�ҳ��
		request.setAttribute("msg", "���Ѿ��ɹ�������Ʒ���빺�ﳵ��");
		request.setAttribute("p", cat);
		request.getRequestDispatcher("info.jsp").forward(request, response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
