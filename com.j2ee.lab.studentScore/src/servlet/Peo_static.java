package servlet;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class Peo_static implements SessionBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int online_no = 0;
	private int log_no = 0;
	private int visite_no=0;
	
	public void visite_add(){
		visite_no++;
	}

	public int getVisite_no() {
		return visite_no;
	}

	public void setVisite_no(int visite_no) {
		this.visite_no = visite_no;
	}

	public Peo_static() {
	}

	public void online_add() {
		online_no++;
	}

	public void online_decree() {
		online_no--;
	}

	public void log_add() {
		log_no++;
	}

	public void log_decree() {
		log_no--;
	}

	public int getOnline_no() {
		return online_no;
	}

	public void setOnline_no(int online_no) {
		this.online_no = online_no;
	}

	public int getLog_no() {
		return log_no;
	}

	public void setLog_no(int log_no) {
		this.log_no = log_no;
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
