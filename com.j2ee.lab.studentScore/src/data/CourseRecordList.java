package data;

import java.rmi.RemoteException;
import java.util.List;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

public class CourseRecordList implements SessionBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<CourseRecord> crList;

	public CourseRecordList() {
	}
	public void show(){
		for(CourseRecord cr: crList){
			System.out.println(cr);
		}
	}
	public CourseRecord getCrList(int index){
		if(null==crList){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return crList.get(index);
	}

	public boolean isAllPass() {
		if(null==crList){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (CourseRecord cr : crList) {
			if (!cr.isPass())
				return false;
		}
		return true;
	}

	public List<CourseRecord> getCrList() {
		return crList;
	}

	public void setCrList(List<CourseRecord> crList) {
		this.crList = crList;
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
