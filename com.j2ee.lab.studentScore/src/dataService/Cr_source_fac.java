package dataService;

import dbConnnector.CourseRecord_db;

public class Cr_source_fac {
	public static Cr_source_service cr_source(){
		return new CourseRecord_db();
	}
}
