package listener;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

import servlet.Peo_static;

public class ExistingSessionCounter implements HttpSessionListener {
	// private static int sessionCount = 0;

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		HttpSession session = arg0.getSession();
		// session.setAttribute("hasLogin", false);
		session.setAttribute("user", new UserBean());

		// peo statistic
		Peo_static ps = (Peo_static) session.getServletContext().getAttribute(
				"people_static");
		ps.online_add();
		ps.visite_add();
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		HttpSession session = arg0.getSession();
		Peo_static ps = (Peo_static) session.getServletContext().getAttribute(
				"people_static");
		ps.online_decree();

		UserBean user=(UserBean) session.getAttribute("user");
		if(user.isHaslog()){
			ps.log_decree();
		}
	}
}
