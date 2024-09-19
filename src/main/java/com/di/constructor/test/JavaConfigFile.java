package com.di.constructor.test;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfigFile {
	@Bean
	public Student createStudentObj() {
		Student std = new Student("Sudeep");
		return std;
	}
	@Bean
	public Student createStudentObj1() {
		Student std = new Student("Pooja");
		return std;
	}
	@Bean
	public Student createStudentObj2() {
		Student std = new Student("Aarti");
		return std;
	}
	@Bean
	public Student createStudentObj3() {
		Student std = new Student("Vikas");
		return std;
	}
	@Bean
	public Student createStudentObj4() {
		Student std = new Student("Hemant");
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
		House h = new House(101, "Gandhi", "White", list());
		return h;
	}
}
