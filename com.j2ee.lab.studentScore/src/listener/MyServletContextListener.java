package listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import fileConnector.RootPath;

public class MyServletContextListener implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
//		Dbconnect.init();
		ServletContext sc=arg0.getServletContext();
//		String url=sc.getInitParameter("db-source");
//		sc.setAttribute("url", "http://"+url);
		String path=sc.getRealPath("/");
		RootPath.set(path);
	}
}
