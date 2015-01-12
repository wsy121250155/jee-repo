package com.j2ee.ejbServer.po;

import java.io.Serializable;

import com.j2ee.ejbServer.model.CourseRecordEo;

public class CourseRecord implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int cid;
	private int score;
	private int sid;

	public CourseRecord() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSid() {
		return sid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public boolean isPass() {
		return 60 <= score;
	}

	public int getCid() {
		return cid;
	}

	public int getScore() {
		return score;
	}

	// ********************************************
	public CourseRecord(CourseRecordEo ce, String cname) {
		this.id = ce.getId();
		this.cid = ce.getCr_cid();
		this.sid = ce.getCr_sid();
		this.score = ce.getScore();
		this.cname = cname;
	}

	private String cname;

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
}
