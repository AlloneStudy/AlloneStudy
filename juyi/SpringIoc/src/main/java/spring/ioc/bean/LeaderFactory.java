package spring.ioc.bean;

import org.springframework.stereotype.Component;

@Component
public class LeaderFactory {

	public Leader createLeader(String name){
		Leader teacher = new Leader();
		teacher.setName(name);
		return teacher;
	}
	
	public static Leader StaticCreateLeader(String name){
		Leader teacher = new Leader();
		teacher.setName(name);
		return teacher;
	}
}
