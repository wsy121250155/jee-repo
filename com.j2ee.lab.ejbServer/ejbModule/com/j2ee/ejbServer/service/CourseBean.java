package com.j2ee.ejbServer.service;

import java.util.List;

import com.j2ee.ejbServer.dao.CourseDao;
import com.j2ee.ejbServer.dao.CourseImpl;
import com.j2ee.ejbServer.model.Course;

public class CourseBean implements CourseService {

	@Override
	public List<Course> getCourseList() {
		// TODO Auto-generated method stub
		CourseDao courDao = new CourseImpl();
		List<Course> reList = courDao.getCourseList();
		if (null == reList)
			try {
				throw new Exception();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return reList;
	}

}
