package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.j2ee.ejbServer.po.Student;

import data.Peo_static;
import data.UserBean;
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
//	用于处理index。jsp页面中的链接请求
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher view = request.getRequestDispatcher("login.jsp");
		view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
//	用于处理login。jsp页面中的表单请求
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idStr = request.getParameter("sid");
		int sid = Integer.valueOf(idStr);
		String pw = request.getParameter("spw");
		boolean canlog = false;
		StudentInfoDAO ss = DAOFactory.getStuDAO();
		Student stu = ss.getStudent(sid);
		if (null != stu)
			canlog = stu.isMe(sid, pw);
		String url = "wrong.jsp";
		if (canlog) {
			UserBean user = (UserBean) request.getSession()
					.getAttribute("user");
			user.setStu(stu);
			Peo_static ps = (Peo_static) this.getServletContext().getAttribute(
					"people_static");
			ps.log_add();
			url = "stuInfoServlet";
		}
		RequestDispatcher view = request.getRequestDispatcher(url);
		view.forward(request, response);
	}
}
