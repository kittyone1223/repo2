package com.ujiuye.entity;

import com.sun.xml.internal.ws.message.StringHeader;

public class Student {
	private int sid;
	private String sname;
	private String sgender;
	private String shobby;
	private String sdegree;
	private String smark;
//	public int getSid() {
//		return sid;
//	}
//	public void setSid(int sid) {
//		this.sid = sid;
//	}
	
	public String getSname() {
		return sname;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String sname, String sgender, String shobby, String sdegree, String smark) {
		super();

		this.sname = sname;
		this.sgender = sgender;
		this.shobby = shobby;
		this.sdegree = sdegree;
		this.smark = smark;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getSgender() {
		return sgender;
	}
	public void setSgender(String sgender) {
		this.sgender = sgender;
	}
	public String getShobby() {
		return shobby;
	}
	public void setShobby(String shobby) {
		this.shobby = shobby;
	}
	public String getSdegree() {
		return sdegree;
	}
	public void setSdegree(String sdegree) {
		this.sdegree = sdegree;
	}
	public String getSmark() {
		return smark;
	}
	public void setSmark(String smark) {
		this.smark = smark;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sgender=" + sgender + ", shobby=" + shobby + ", sdegree="
				+ sdegree + ", smark=" + smark + "]";
	}
	
	
	
}
