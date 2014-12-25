package dataService;

import javax.servlet.ServletContext;

import dbConnnector.Dbconnect;
import fileConnector.Course_re_file;
import fileConnector.RootPath;
import fileConnector.Student_file;

public class DAOFactory {
	private static int i=0;
	private static CourseRecordDAO crd;
	private static StudentInfoDAO stud;
	public static CourseRecordDAO getCRDAO(){
		return crd;
	}
	public static StudentInfoDAO getStuDAO(){
		return stud;
	}
	public static void init(ServletContext context){
		if(0==i){
			String path=context.getRealPath("/");
			RootPath.set(path);
			crd=new Course_re_file();
			stud=new Student_file();
		}else{
			Dbconnect.init();
		}
	}
}
