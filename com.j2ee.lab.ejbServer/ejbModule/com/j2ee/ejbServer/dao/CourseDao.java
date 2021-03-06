package com.j2ee.ejbServer.dao;

import java.util.List;

import javax.ejb.Remote;

import com.j2ee.ejbServer.po.Course;

@Remote
public interface CourseDao {
	public List<Course> getCourseList();

	public Course getCourse(int cid);
}
