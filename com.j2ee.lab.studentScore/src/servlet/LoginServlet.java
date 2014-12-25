package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import data.Student;
import dataService.DAOFactory;
import dataService.StudentInfoDAO;

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
		HttpSession session = request.getSession();
		boolean hasLogin = (boolean) session.getAttribute("hasLogin");
		if (!hasLogin) {
			RequestDispatcher view = request.getRequestDispatcher("login.jsp");
			view.forward(request, response);
		} else {
			int sid = (int) session.getAttribute("sid");
			request.setAttribute("sid", sid);
			RequestDispatcher view = request
					.getRequestDispatcher("stuInfoServlet");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idStr = request.getParameter("sid");
		int sid = Integer.valueOf(idStr);
		String pw = request.getParameter("spw");
		if (!canlog(sid, pw)) {
			RequestDispatcher view = request.getRequestDispatcher("wrong.jsp");
			view.forward(request, response);
		} else {
			HttpSession session = request.getSession();
			session.setAttribute("sid", sid);
			session.setAttribute("hasLogin", true);
			RequestDispatcher view = request
					.getRequestDispatcher("stuInfoServlet");
			view.forward(request, response);
		}
	}
	private boolean canlog(int sid, String pw){
		StudentInfoDAO ss=DAOFactory.getStuDAO();
		Student stu = ss.getStudent(sid);
		if (null == stu)
			return false;
		return stu.isMe(sid, pw);
	}
}
