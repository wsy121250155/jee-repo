package com.j2ee.ejbServer.model;

import java.io.Serializable;

public class Course implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cid;
	private String cname;

	public Course(int cid, String cname) {
		this.cid = cid;
		this.cname = cname;
	}

	public Course() {
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
