package com.j2ee.ejbServer.po;

import java.io.Serializable;

import com.j2ee.ejbServer.model.StudentEo;

public class Student implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int sid;
	private String sname;
	private String pw;

	public Student() {
	}

	public Student(StudentEo se) {
		sid = se.getSid();
		sname = se.getSname();
		pw = se.getPw();
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public boolean isMe(int sid, String pw) {
		return sid == this.sid && this.pw.equals(pw);
	}

	public String getName() {
		return sname;
	}
}
