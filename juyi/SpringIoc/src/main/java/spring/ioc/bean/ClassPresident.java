package spring.ioc.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
