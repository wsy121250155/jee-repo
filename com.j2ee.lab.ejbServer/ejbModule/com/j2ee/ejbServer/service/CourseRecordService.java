package com.j2ee.ejbServer.service;

import java.util.List;

import javax.ejb.Remote;

import com.j2ee.ejbServer.po.CourseRecord;

@Remote
public interface CourseRecordService {
	public List<CourseRecord> getCourseRecords(int sid);
}
