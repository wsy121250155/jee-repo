package com.j2ee.ejbServer.dao;

import java.util.List;

import javax.ejb.Remote;

import com.j2ee.ejbServer.po.CourseRecord;

@Remote
public interface CourseRecordDao {
	public List<CourseRecord> getCourseRecords(int sid);
}
