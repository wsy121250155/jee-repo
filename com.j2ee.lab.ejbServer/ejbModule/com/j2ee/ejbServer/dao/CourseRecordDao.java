package com.j2ee.ejbServer.dao;

import java.util.List;

import com.j2ee.ejbServer.model.CourseRecord;

public interface CourseRecordDao {
	public List<CourseRecord> getCourseRecords(int sid);
}
