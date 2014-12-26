package listener;

import java.rmi.RemoteException;

import javax.ejb.EJBException;
import javax.ejb.SessionBean;
import javax.ejb.SessionContext;

import data.CourseRecordList;
import data.Student;
import dataService.DAOFactory;

public class UserBean implements SessionBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean haslog=false;
	private Student stu;
	private CourseRecordList crList;
	public void init(){
		haslog = false;
		stu=null;
		crList=null;
	}
	public CourseRecordList getCrList() {
		if(null==crList)
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return crList;
	}
	
	@SuppressWarnings("finally")
	public boolean allPass(){
		if(null==crList){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("crList is null!");
				e.printStackTrace();
			}finally{
				return false;
			}
		}
		return crList.isAllPass();
	}
	//实际上不应该在类的外部被调用到
	public void setCrList(CourseRecordList crList) {
		this.crList = crList;
	}

	public boolean isHaslog() {
		return haslog;
	}

	//should not be called outside this class
	public void setHaslog(boolean haslog) {
		//只有在设置了stu参数时，被顺带设置，或者是inti（）中进行修改。
		try {
			throw new Exception();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Student getStu() {
		if(null==stu)
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return stu;
	}

	public void setStu(Student stu) {
		this.stu = stu;
		//填充crList
		int sid=stu.getSid();
		crList=new CourseRecordList();
		crList.setCrList(DAOFactory.getCRDAO().getCourseRecords(sid));
		haslog = true;
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
