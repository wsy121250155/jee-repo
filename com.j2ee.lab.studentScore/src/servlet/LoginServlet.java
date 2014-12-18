package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import listener.Stu_Session;
import dataService.Logic;
import fileConnector.RootPath;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.setContentType("text/html");
		// PrintWriter out = response.getWriter();
		// out.println("<html><body>should not reach here!<body></html>");
		// cope with login or show the information directly
		HttpSession session = request.getSession();
		if (session.isNew()) {
			session.setAttribute("hasLogin", false);
			loginJsp(request, response);
		} else {
			if (null == session.getAttribute("hasLogin")) {
				session.setAttribute("hasLogin", false);
			}
			boolean hasLogin = (boolean) session.getAttribute("hasLogin");
			if (!hasLogin) {
				loginJsp(request, response);
			} else {
				int sid = (int) session.getAttribute("sid");
				request.setAttribute("sid", sid);
				RequestDispatcher view = request
						.getRequestDispatcher("stuInfoServlet");
				view.forward(request, response);
			}
		}
	}

	private void loginJsp(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher view = request.getRequestDispatcher("login.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.setContentType("text/html");
		String idStr = request.getParameter("sid");
		int sid = Integer.valueOf(idStr);
		String pw = request.getParameter("spw");

		// for file implementation of data
		String path = this.getServletContext().getRealPath("/");
		RootPath.set(path);

		boolean canlog = Logic.canLog(sid, pw);// filepath
		if (!canlog) {
			RequestDispatcher view = request.getRequestDispatcher("wrong.jsp");
			view.forward(request, response);
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("sid", sid);
			session.setAttribute("hasLogin", true);
//			for HttpSessionBindingListener test:
			session.setAttribute("student", new Stu_Session(sid));
//			for more than one cookie test:
			Cookie cookie_id=new Cookie("sid",idStr);
			cookie_id.setMaxAge(60);
			response.addCookie(cookie_id);
			RequestDispatcher view = request
					.getRequestDispatcher("stuInfoServlet");
			view.forward(request, response);
		}
	}
}
