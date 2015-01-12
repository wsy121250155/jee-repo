package com.j2ee.ejbServer.po;

import java.io.Serializable;

import com.j2ee.ejbServer.model.CourseEo;

public class Course implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cid;
	private String cname;

	public Course() {
	}
	public Course(CourseEo ce){
		cid=ce.getCid();
		cname=ce.getCname();
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
}
