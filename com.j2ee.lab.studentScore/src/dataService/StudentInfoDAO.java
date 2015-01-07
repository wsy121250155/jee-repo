package dataService;

import com.j2ee.ejbServer.po.Student;


public interface StudentInfoDAO {
	public Student getStudent(int sid);
}
