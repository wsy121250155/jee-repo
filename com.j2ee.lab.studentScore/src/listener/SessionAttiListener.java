package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

import data.Peo_static;

/**
 * Application Lifecycle Listener implementation class SessionAttiListener
 *
 */
@WebListener
public class SessionAttiListener implements HttpSessionAttributeListener {

    /**
     * Default constructor. 
     */
    public SessionAttiListener() {
        // TODO Auto-generated constructor stub
    }
//    private static int logNo=0;
//    public static int getLogNo(){
//    	return logNo;
//    }
	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	String name=arg0.getName();
    	if("sid".equals(name)){
    		HttpSession session=arg0.getSession();
    		Peo_static ps = (Peo_static) session.getServletContext().getAttribute(
    				"people_static");
    		ps.log_decree();
    	}
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	String name=arg0.getName();
    	if("sid".equals(name)){
    		HttpSession session=arg0.getSession();
    		Peo_static ps = (Peo_static) session.getServletContext().getAttribute(
    				"people_static");
    		ps.log_add();
    		session.setAttribute("allPass", false);
    	}
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
//    	注意：这里显示的得到的是被替换掉的，不是新的。
    }
	
}
