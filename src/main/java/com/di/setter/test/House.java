package com.di.setter.test;

import java.util.List;

public class House {
	private int hid;
	private String name;
	private String dress;
	private List<Student> student;
	
	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDress() {
		return dress;
	}

	public void setDress(String dress) {
		this.dress = dress;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "House [hid=" + hid + ", name=" + name + ", dress=" + dress + ", student=" + student + "]";
	}
}
