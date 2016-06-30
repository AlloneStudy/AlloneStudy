package spring.ioc.bean;

import org.springframework.stereotype.Component;
<<<<<<< HEAD
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
=======
>>>>>>> 2af5a02769f38bb45baa54b8c5d07a6e71d6de43

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
