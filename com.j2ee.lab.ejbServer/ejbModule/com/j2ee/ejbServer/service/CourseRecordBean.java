package com.j2ee.ejbServer.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.j2ee.ejbServer.dao.CourseRecordDao;
import com.j2ee.ejbServer.po.CourseRecord;
import com.j2ee.ejbServer.service.CourseRecordService;

@Stateless
public class CourseRecordBean implements CourseRecordService {
	@EJB
	CourseRecordDao crDao;

	public List<CourseRecord> getCourseRecords(int sid) {
		// TODO Auto-generated method stub
		List<CourseRecord> reList = null;
		reList = crDao.getCourseRecords(sid);
		return reList;
	}
}
