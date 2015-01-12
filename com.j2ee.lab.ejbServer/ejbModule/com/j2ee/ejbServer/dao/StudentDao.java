package com.j2ee.ejbServer.dao;

import javax.ejb.Remote;

import com.j2ee.ejbServer.po.Student;

@Remote
public interface StudentDao {
	public Student getStudent(int sid);
}
