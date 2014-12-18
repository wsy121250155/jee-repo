package dataService;

import java.util.List;

import data.CourseRecord;

public interface Cr_source_service {
	public List<CourseRecord> getCourseRecords(int sid);
}
