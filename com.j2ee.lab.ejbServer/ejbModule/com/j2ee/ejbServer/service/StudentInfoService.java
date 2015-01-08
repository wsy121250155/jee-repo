package com.j2ee.ejbServer.service;

import javax.ejb.Remote;

import com.j2ee.ejbServer.model.Student;

@Remote
public interface StudentInfoService {
	public Student getStudent(int sid);
}
