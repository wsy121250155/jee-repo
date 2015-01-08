package com.j2ee.ejbServer.service;

import java.util.List;

import javax.ejb.Remote;

import com.j2ee.ejbServer.model.Course;

@Remote
public interface CourseService {
	public List<Course> getCourseList();
}
