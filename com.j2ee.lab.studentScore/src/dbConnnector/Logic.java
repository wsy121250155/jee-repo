package dbConnnector;

import java.util.List;

import data.CourseRecord;
import data.Student;

public class Logic {
	private static List<CourseRecord> crList;
	public static boolean canLog(int sid, String pw) {
		Student_db ss=new Student_db();
		Student stu = ss.getStudent(sid);
		if (null == stu)
			return false;
		return stu.isMe(sid, pw);
	}
	public static boolean isAllPass(int sid){
		CourseRecord_db c_db=new CourseRecord_db();
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
