package tagHandler;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import com.j2ee.ejbServer.po.Course;

import data.CourseList;

public class CoursesHandler extends SimpleTagSupport{
	private CourseList crList;
	
	public CourseList getCrList() {
		return crList;
	}

	public void setCrList(CourseList crList) {
		this.crList = crList;
	}

	public void doTag() throws JspException, IOException{
		JspWriter out = getJspContext().getOut();
		int index=0;
		for(Course cr: crList.getCourseList()){
			out.println("<tr>");
			out.println("<td>"+(++index)+"</td>");
			out.println("<td>"+cr.getCid()+"</td>");
			out.println("<td>"+cr.getCname()+"</td>");
			out.println("</tr>");
		}
	}
}
