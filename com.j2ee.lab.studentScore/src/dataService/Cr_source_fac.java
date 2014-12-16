package dataService;

import dbConnnector.CourseRecord_db;
import fileConnector.Course_re_file;

public class Cr_source_fac {
	public static Cr_source_service cr_source(){
//		return new CourseRecord_db();
		return new Course_re_file();
	}
}
