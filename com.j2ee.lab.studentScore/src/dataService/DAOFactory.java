package dataService;

import fileConnector.Course_re_file;
import fileConnector.Student_file;

public class DAOFactory {
	public static CourseRecordDAO getCRDAO(){
		return new Course_re_file();
	}
	public static StudentInfoDAO getStuDAO(){
		return new Student_file();
	}
}
