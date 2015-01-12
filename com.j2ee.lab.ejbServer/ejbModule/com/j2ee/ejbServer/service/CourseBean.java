package com.j2ee.ejbServer.service;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.j2ee.ejbServer.dao.CourseDao;
import com.j2ee.ejbServer.po.Course;

@Stateless
public class CourseBean implements CourseService {
	@EJB
	CourseDao courDao;

	@Override
	public List<Course> getCourseList() {
		// TODO Auto-generated method stub
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
