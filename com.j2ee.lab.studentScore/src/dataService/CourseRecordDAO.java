package dataService;

import java.util.List;

import com.j2ee.ejbServer.po.CourseRecord;


public interface CourseRecordDAO {
	public List<CourseRecord> getCourseRecords(int sid);
}
