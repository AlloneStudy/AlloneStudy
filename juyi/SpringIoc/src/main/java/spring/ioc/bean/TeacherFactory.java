package spring.ioc.bean;

import org.springframework.stereotype.Component;

@Component
public class TeacherFactory {

	public Teacher createTeacher(String name){
		Teacher teacher = new Teacher();
		teacher.setName(name);
		return teacher;
	}
	
	public static Teacher StaticCreateTeacher(String name){
		Teacher teacher = new Teacher();
		teacher.setName(name);
		return teacher;
	}
}
