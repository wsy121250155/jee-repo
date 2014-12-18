package dataService;

import dbConnnector.Student_db;
import fileConnector.Student_file;

public class Stu_source_fac {
	public static Stu_source_service stu_source(){
//		return new Student_db();
		return new Student_file();
	}
}
