package com.j2ee.ejbServer.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.j2ee.ejbServer.dao.StudentDao;
import com.j2ee.ejbServer.po.Student;
import com.j2ee.ejbServer.service.StudentInfoService;

@Stateless
public class StudentInfoBean implements StudentInfoService {
	@EJB
	StudentDao stuDao;

	@Override
	public Student getStudent(int sid) {
		// TODO Auto-generated method stub
		Student stu = null;
		stu = stuDao.getStudent(sid);
		return stu;
	}
}
