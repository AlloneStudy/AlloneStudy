package spring.ioc.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Customer {
	private List<Object> lists;
    private Set<Object> sets;
    private Map<Object, Object> maps;
    private Properties pros;
	public List<Object> getLists() {
		return lists;
	}
	public Set<Object> getSets() {
		return sets;
	}
	public Map<Object, Object> getMaps() {
		return maps;
	}
	public Properties getPros() {
		return pros;
	}
    
}
