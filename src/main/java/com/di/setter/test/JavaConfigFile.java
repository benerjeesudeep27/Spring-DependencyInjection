package com.di.setter.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigFile {
	@Bean
	public Student createStudentObj() {
		Student std = new Student();
		std.setName("Pradeep");
		return std;
	}
	@Bean
	public Student createStudentObj1() {
		Student std = new Student();
		std.setName("Nonta");
		return std;
	}
	@Bean
	public Student createStudentObj2() {
		Student std = new Student();
		std.setName("Guddu");
		return std;
	}
	@Bean
	public Student createStudentObj3() {
		Student std = new Student();
		std.setName("Rohit");
		return std;
	}
	@Bean
	public Student createStudentObj4() {
		Student std = new Student();
		std.setName("Kapil");
		return std;
	}
	@Bean
	public List<Student> list(){
		List<Student> l = new ArrayList<Student>();
		l.add(createStudentObj());
		l.add(createStudentObj1());
		l.add(createStudentObj2());
		l.add(createStudentObj3());
		l.add(createStudentObj4());
		return l;
	}
	@Bean(name = "house")
	public House createHouseObj() {
		House h = new House();
		h.setHid(202);
		h.setName("Nehru");
		h.setDress("Maroon");
		h.setStudent(list());
		return h;
	}
}
