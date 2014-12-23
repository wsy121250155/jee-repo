package listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

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

	/**
     * @see HttpSessionAttributeListener#attributeRemoved(HttpSessionBindingEvent)
     */
    private String name;
    private Object value;
    public void attributeRemoved(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	freshAttr(arg0);
//    	System.out.println("session attribute removed!");
    	printAttr();
    }
    private void freshAttr(HttpSessionBindingEvent arg0){
    	name=arg0.getName();
    	value=arg0.getValue();
    }
    private void printAttr(){
//    	System.out.println("name:\t"+name+"\tvalue:\t"+value);
    }

	/**
     * @see HttpSessionAttributeListener#attributeAdded(HttpSessionBindingEvent)
     */
    public void attributeAdded(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
    	freshAttr(arg0);
//    	System.out.println("session attribute added!");
    	printAttr();
    }

	/**
     * @see HttpSessionAttributeListener#attributeReplaced(HttpSessionBindingEvent)
     */
    public void attributeReplaced(HttpSessionBindingEvent arg0)  { 
         // TODO Auto-generated method stub
//    	注意：这里显示的得到的是被替换掉的，不是新的。
    	freshAttr(arg0);
//    	System.out.println("session attribute replaced!");
    	printAttr();
    }
	
}
