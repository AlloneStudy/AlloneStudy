package spring.ioc.bean;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Grade {
	@Autowired
	@Qualifier("classPresident")
	private ClassPresident classPresident;
	@Autowired
	private Teacher[] teachers;
	@Autowired
	private List<Leader> leaderList;
	@Autowired
	private Map<String, Student> studentMap;

	public ClassPresident getClassPresident() {
		return classPresident;
	}

	public Teacher[] getTeachers() {
		return teachers;
	}

	public List<Leader> getLeaderList() {
		return leaderList;
	}

	public Map<String, Student> getStudentMap() {
		return studentMap;
	}

}
