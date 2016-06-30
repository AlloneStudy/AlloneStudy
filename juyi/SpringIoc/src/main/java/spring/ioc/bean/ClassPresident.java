package spring.ioc.bean;

import org.springframework.beans.factory.annotation.Value;
<<<<<<< HEAD
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
=======
import org.springframework.stereotype.Component;

@Component
>>>>>>> 2af5a02769f38bb45baa54b8c5d07a6e71d6de43
public class ClassPresident {
	@Value("#{Student_JunWen.name}")
	private String name;
	@Value("#{Student_JingJing.age}")
	private int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "ClassPresident:name=" + name + ",age=" + age;
	}
}
