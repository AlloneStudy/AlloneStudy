package spring.ioc.bean;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Grade {
	@Autowired 
	Teacher teacher;
	
	//@Autowired
	
	private Map<String,Student> studentMap;

//	public Student getStudent() {
//		return stu;
//	}
//
//	public void setStudent(Student student) {
//		this.stu = student;
//	}

}
