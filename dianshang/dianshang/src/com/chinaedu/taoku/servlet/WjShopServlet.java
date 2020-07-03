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

import com.chinaedu.taoku.dao.WjDao;
import com.chinaedu.taoku.pojo.Wj;

public class WjShopServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public WjShopServlet() {
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
		WjDao dao = new WjDao();
		Wj product = dao.findProductByPk(Integer.parseInt(id));
		HttpSession session = request.getSession();
		List<Wj> cart = (List) session.getAttribute("cart");
		if(cart == null) {
			cart = new ArrayList<Wj>();
			//将购物车放入session中
			session.setAttribute("cart", cart);
		}
		//将商品放入购物车中
		cart.add(product);
		
		//转到成功页面
		request.setAttribute("msg", "您已经成功将该商品加入购物车！");
		request.setAttribute("p", product);
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
