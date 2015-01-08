package com.j2ee.ejbServer.model;

import java.io.Serializable;

public class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Student(){}
	private int sid;
	private String sname;
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
	private String pw;
	public Student(int sid, String sname, String pw) {
		// TODO Auto-generated constructor stub
		this.sid=sid;
		this.sname=sname;
		this.pw=pw;
	}
	public boolean isMe(int sid, String pw){
		return sid==this.sid && this.pw.equals(pw);
	}
	public String getName(){
		return sname;
	}
//	public String getPw(){
//		return pw;
//	}
	public String toString(){
		return ""+sid+"\t"+sname+"\t"+pw;
	}
}
