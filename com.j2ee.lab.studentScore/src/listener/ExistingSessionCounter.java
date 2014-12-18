package listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class ExistingSessionCounter implements HttpSessionListener{
	private static int sessionCount=0;

	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		sessionCount++;
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		sessionCount--;
	}
	public static int getSessionNo(){
		return sessionCount;
	}

}
