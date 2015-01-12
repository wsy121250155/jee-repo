package com.j2ee.ejbServer.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "courserecords")
public class CourseRecordEo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private int score;
	private int cr_cid;
	private int cr_sid;

	public CourseRecordEo() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCr_cid() {
		return cr_cid;
	}

	public void setCr_cid(int cr_cid) {
		this.cr_cid = cr_cid;
	}

	public int getCr_sid() {
		return cr_sid;
	}

	public void setCr_sid(int cr_sid) {
		this.cr_sid = cr_sid;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}
}
