package dataService;

import java.util.List;

import data.CourseRecord;
import data.Student;

public class Logic {
	private static List<CourseRecord> crList;
	public static boolean canLog(int sid, String pw) {
		Stu_source_service ss=Stu_source_fac.stu_source();
		Student stu = ss.getStudent(sid);
		if (null == stu)
			return false;
		return stu.isMe(sid, pw);
	}
	public static boolean isAllPass(int sid){
		Cr_source_service c_db=Cr_source_fac.cr_source();
		crList=c_db.getCourseRecords(sid);
		for(CourseRecord cr: crList){
			if (!cr.isPass())
				return false;
		}
		return true;
	}
	public static List<CourseRecord> getCrList(){
		if(null==crList){
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return crList;
	}
}
