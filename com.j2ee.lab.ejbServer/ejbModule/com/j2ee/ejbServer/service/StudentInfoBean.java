package com.j2ee.ejbServer.service;

import javax.ejb.Stateless;
import com.j2ee.ejbServer.dao.StudentDao;
import com.j2ee.ejbServer.dao.StudentImpl;
import com.j2ee.ejbServer.model.Student;
import com.j2ee.ejbServer.service.StudentInfoService;

@Stateless
public class StudentInfoBean implements StudentInfoService {
	public Student getStudent(int sid) {
		// TODO Auto-generated method stub
		Student stu = null;
		StudentDao stuDao = new StudentImpl();
		stu = stuDao.getStudent(sid);
		return stu;
	}
}
