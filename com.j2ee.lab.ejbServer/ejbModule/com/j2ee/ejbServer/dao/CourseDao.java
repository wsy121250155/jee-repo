package com.j2ee.ejbServer.dao;

import java.util.List;

import com.j2ee.ejbServer.model.Course;

public interface CourseDao {
	public List<Course> getCourseList();

	public Course getCourse(int cid);
}
