package com.chinaedu.taoku.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinaedu.taoku.dao.ProductDao;
import com.chinaedu.taoku.pojo.Product;

public class ProductDetail extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ProductDetail() {
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

				//��ȡ��ƷID
				String id = request.getParameter("id");
				//ȥ��ѯ���ݿ�
				ProductDao dao = new ProductDao();
				
				Product p = dao.findProductByPk(Integer.parseInt(id));
				
				//�����ݷ����������У�Ŀ���ǽ����ݴ��뵽ҳ����ȥ
				request.setAttribute("p", p);
				
				//��תҳ��
				request.getRequestDispatcher("product_info.jsp").forward(request, response);
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

		doGet(request, response);
	}

	/**
	 * Initialization of the servlet. <br>product_info.jsp
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
