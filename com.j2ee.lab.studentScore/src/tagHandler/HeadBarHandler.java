package tagHandler;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class HeadBarHandler extends SimpleTagSupport {
	private boolean log = false;

	public void doTag() throws JspException, IOException {
		String scoreUrl = "#";
		String infoUrl = "#";
		if (log) {
			scoreUrl = "stuInfoServlet";
			infoUrl = "yes";
		}

		JspWriter out = getJspContext().getOut();
		out.println("<div>");
		out.println("<ul class=\"nav nav-pills\">");
		out.println("<li class=\"active\"><a href=\"index.jsp\">HomePage</a></li>");
		out.println("<li><a href=\"courseServlet\">Courses</a></li>");
		out.println("<li><a href=\"" + scoreUrl + "\">Scores</a></li>");
		out.println("<li><a href=\"" + infoUrl
				+ "\">Personal Information</a></li>");
		out.println("<li><a href=\"logOut\">log out</a></li>");
		out.println("</ul>");
		out.println("</div>");
	}

	public boolean isLog() {
		return log;
	}

	public void setLog(boolean log) {
		this.log = log;
	}
}
