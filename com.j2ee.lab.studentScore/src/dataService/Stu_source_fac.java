package dataService;

import dbConnnector.Student_db;

public class Stu_source_fac {
	public static Stu_source_service stu_source(){
		return new Student_db();
	}
}
