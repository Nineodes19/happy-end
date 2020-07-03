package com.chinaedu.taoku.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chinaedu.taoku.dao.UserDao;
import com.chinaedu.taoku.pojo.Userinfo;

@SuppressWarnings("unused")
public class UserServlet extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public UserServlet() {
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


		/*request.setCharacterEncoding("utf-8");
		String usrsex = request.getParameter("sex");
		String usrname = request.getParameter("usrname");
		String usrpwd = request.getParameter("usrpwd");
		String usremail = request.getParameter("usremail");
		String usrphon = request.getParameter("usrphon");
	
		
		UserDao dao = new UserDao();
		Userinfo u = new Userinfo();
		u.setUsrname(usrname);
		u.setUsrsex(usrsex);
		u.setUsrphone(usrphon);
		u.setUsrpwd(usrpwd);
		u.setUsremail(usremail);
		dao.add(u);
		
		response.sendRedirect("info.html");*/
		request.setCharacterEncoding("utf-8");
		//cmd代表具体的操作，科室
		String cmd = request.getParameter("cmd");
		if("login".equals(cmd)) {
			this.doLogin(request, response); 
		}
		if("reg".equals(cmd)) {
			this.doReg(request, response);
		}
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
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
//		out.println("<HTML>");
//		out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
//		out.println("  <BODY>");
//		out.print("    This is ");
//		out.print(this.getClass());
//		out.println(", using the POST method");
//		out.println("  </BODY>");
//		out.println("</HTML>");
//		out.flush();
//		out.close();
	}

	
	/**
	 * 注册请求
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doReg(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//获取用户提交的信息
		request.setCharacterEncoding("utf-8");
		String usrsex = request.getParameter("sex");
		String usrname = request.getParameter("usrname");
		String usrpwd = request.getParameter("usrpwd");
		String usremail = request.getParameter("usremail");
		String usrphon = request.getParameter("usrphon");
	
		
		UserDao dao = new UserDao();
		Userinfo u = new Userinfo();
		u.setUsrname(usrname);
		u.setUsrsex(usrsex);
		u.setUsrphone(usrphon);
		u.setUsrpwd(usrpwd);
		u.setUsremail(usremail);
		dao.add(u);
		
		response.sendRedirect("login.htm");
				
	}
	
	/**
	 * 登录请求
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	protected void doLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				//处理用户登录
				request.setCharacterEncoding("utf-8");
				String name = request.getParameter("name");
				String pwd = request.getParameter("pwd");
				System.out.println(name + "\t" + pwd);
				Userinfo u = new Userinfo ();
				u.setUsrname(name);
				u.setUsrpwd(pwd);
				
				UserDao dao = new UserDao ();
				Userinfo user = dao.findUser(u);
				
				if(user == null)
				{
					//账号不存在
					request.getRequestDispatcher("login.htm").forward(request,response);
					
				}else{
					//账号正确
					response.sendRedirect("product_list.jsp");
				}
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
