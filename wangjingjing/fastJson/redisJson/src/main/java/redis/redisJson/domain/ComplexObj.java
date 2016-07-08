package redis.redisJson.domain;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ComplexObj implements Serializable{
	private static final long serialVersionUID = 4475861279089443508L;
	
	int id;
	String name;
	List<String> lists = new LinkedList<String>();
	Map<String, SampleBean> map = new HashMap<String, SampleBean> ();
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void add(String data) {
		this.lists.add(data);
	}
	public void set(String id, SampleBean bean) {
		this.map.put(id, bean);
	}
	public SampleBean get(String id) {
		return this.map.get(id);
	}
	
	public Map<String, SampleBean> getMap() {
		return map;
	}
	public void setMap(Map<String, SampleBean> map) {
		this.map = map;
	}
	
	public List<String> getLists() {
		return lists;
	}
	public void setLists(List<String> lists) {
		this.lists = lists;
	}
	public String toString() {
		return "ComplexObj: [id=" + this.id + ", name=" + this.name + ", list=" + this.lists.toString() + ", map=" + map.toString() + "]";
	}
}
