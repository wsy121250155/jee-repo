package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import data.CourseRecordList;
import data.Peo_static;
import dataService.DAOFactory;

/**
 * Servlet implementation class StuInfoServlet
 */
public class StuInfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public StuInfoServlet() {
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
		showInfo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		showInfo(request, response);
	}

	void showInfo(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF8");
		HttpSession session = request.getSession();
		int sid = (int) session.getAttribute("sid");

		CourseRecordList crList = new CourseRecordList();
		crList.setCrList(DAOFactory.getCRDAO().getCourseRecords(sid));
		session.setAttribute("courseList", crList);
		Peo_static ps=(Peo_static)session.getServletContext().getAttribute("people_static");
		session.setAttribute("Peo_static", ps);
		if (crList.isAllPass())
			session.setAttribute("allPass", true);
		RequestDispatcher view = request.getRequestDispatcher("common.jsp");
		view.forward(request, response);
	}
}
