package com.j2ee.ejbServer.service;

import javax.ejb.Remote;

import com.j2ee.ejbServer.po.Student;

@Remote
public interface StudentInfoService {
	public Student getStudent(int sid);
}
