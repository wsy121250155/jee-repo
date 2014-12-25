package dataService;

import java.util.List;

import data.CourseRecord;

public interface CourseRecordDAO {
	public List<CourseRecord> getCourseRecords(int sid);
}
