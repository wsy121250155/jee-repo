package com.j2ee.ejbServer.service;

import java.util.List;
import javax.ejb.Stateless;
import com.j2ee.ejbServer.dao.CourseRecordDao;
import com.j2ee.ejbServer.dao.CourseRecordImpl;
import com.j2ee.ejbServer.model.CourseRecord;
import com.j2ee.ejbServer.service.CourseRecordService;

@Stateless
public class CourseRecordBean implements CourseRecordService {
	public List<CourseRecord> getCourseRecords(int sid) {
		// TODO Auto-generated method stub
		List<CourseRecord> reList = null;
		CourseRecordDao crDao = new CourseRecordImpl();
		reList = crDao.getCourseRecords(sid);
		return reList;
	}
}
