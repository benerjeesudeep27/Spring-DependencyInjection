package com.di.constructor.test;

import java.util.List;

public class House {
	private int hid;
	private String name;
	private String dress;
	private List<Student> student;
	public House(int hid, String name, String dress, List<Student> student) {
		this.hid = hid;
		this.name = name;
		this.dress = dress;
		this.student = student;
	}
	@Override
	public String toString() {
		return "House [hid=" + hid + ", name=" + name + ", dress=" + dress + ", student=" + student + "]";
	}
}
