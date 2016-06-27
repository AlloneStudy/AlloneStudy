package spring.ioc.bean;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Component
public class StudentFactory {

	public Student createStudent(String name){
		Student student = new Student();
		student.setName(name);
		return student;
	}
	
	public static Student StaticCreateStudent(String name){
		Student student = new Student();
		student.setName(name);
		return student;
	}
}
