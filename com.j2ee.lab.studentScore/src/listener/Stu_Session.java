package listener;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Stu_Session implements HttpSessionBindingListener{
	private static int number=0;
	private int sid=0;
	public Stu_Session(int sid){
		this.sid=sid;
	}
	public int getSid(){
		return sid;
	}
	public static int getNum(){
		return number;
	}
	
	@Override
	public void valueBound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
		number++;
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent arg0) {
		// TODO Auto-generated method stub
//		number--;
	}

}
