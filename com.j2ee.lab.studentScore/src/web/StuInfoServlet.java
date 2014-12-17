package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import data.CourseRecord;
import dataService.Logic;
import fileConnector.RootPath;

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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<html><body>show info<body></html>");
		showInfo(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.setContentType("text/html");
//		PrintWriter out = response.getWriter();
//		out.println("<html><body>show info-post<body></html>");
		showInfo(request, response);
	}
	void showInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF8");
		HttpSession session=request.getSession();
		int sid=(int)session.getAttribute("sid");
		
		//for file implementation of data
		String path = this.getServletContext().getRealPath("/");
		RootPath.set(path);
		
		if(Logic.isAllPass(sid)){//filepath
//			session.setAttribute("courseList", Logic.getCrList());
//			RequestDispatcher view=request.getRequestDispatcher("common.jsp");
//			view.forward(request, response);
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("your course information:");
			int i=0;
			out.println("<table>");
			out.println("<tr><td>序号</td><td>课程号</td><td>课程名称</td><td>成绩</td></tr>");
			for(CourseRecord cr:Logic.getCrList()){
				out.println("<tr><td>"+(++i)+"</td><td>"+cr.getCid()+"</td>"+"<td>"+cr.getCname()+"</td>"+"</td>"+"<td>"+cr.getScore()+"</td>"+"</tr>");
			}
			out.println("</table>");
			out.println("</body></html>");
		}else{
//			RequestDispatcher view=request.getRequestDispatcher("attention.jsp");
//			view.forward(request, response);
			PrintWriter out = response.getWriter();
			out.println("请注意：您有挂科！！！");
		}
	}
}
