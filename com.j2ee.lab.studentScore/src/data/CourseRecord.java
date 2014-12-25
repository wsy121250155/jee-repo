package data;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class CourseRecord implements SessionBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cname;
	private int cid;
	private int score;
	public CourseRecord(){}
	public CourseRecord(int cid, String cname, int score) {
		// TODO Auto-generated constructor stub
		this.cname=cname;
		this.cid=cid;
		this.score=score;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public boolean isPass(){
		return 60<=score;
	}
	public int getCid(){
		return cid;
	}
	public String getCname(){
		return cname;
	}
	public int getScore(){
		return score;
	}
	public String toString(){
		return ""+cid+"\t"+cname+"\t"+score;
	}
	
	//for the file implementaton of data
	private int sid;
	public CourseRecord(int cid, String cname, int score, int sid){
		this.cname=cname;
		this.cid=cid;
		this.score=score;
		this.sid=sid;
	}
	public int getSid(){
		return sid;
	}
	@Override
	public void ejbActivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ejbPassivate() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ejbRemove() throws EJBException, RemoteException {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void setSessionContext(SessionContext arg0) throws EJBException,
			RemoteException {
		// TODO Auto-generated method stub
		
	}
}
