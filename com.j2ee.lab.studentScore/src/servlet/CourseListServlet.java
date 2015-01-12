package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.j2ee.ejbServer.po.Course;
import com.j2ee.ejbServer.service.CourseService;

import data.CourseList;

/**
 * Servlet implementation class CourseListServlet
 */
public class CourseListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB CourseService courseBean;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CourseListServlet() {
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
		show(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		show(request, response);
	}

	private void show(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		List<Course> cList=courseBean.getCourseList();
		if(null==cList){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				PrintWriter out=response.getWriter();
				out.println("There is no course yet !");
				out.flush();
			}
		}else{
			CourseList crList=new CourseList();
			crList.setCourseList(cList);
			session.setAttribute("crList", crList);
			RequestDispatcher dispatcher=request.getRequestDispatcher("courses.jsp");
			dispatcher.forward(request, response);
		}
	}
}
