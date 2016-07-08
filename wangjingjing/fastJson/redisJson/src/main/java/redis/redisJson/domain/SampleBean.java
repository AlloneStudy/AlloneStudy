package redis.redisJson.domain;

import java.io.Serializable;

public class SampleBean implements Serializable{
	private static final long serialVersionUID = 4361556162587661493L;

	private static String OBJ_KEY = "SampleBean";
	
	private String id;
	private String name;
	private String address;
	
	public SampleBean(){}
	
	public SampleBean(String id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static String getOBJ_KEY() {
		return OBJ_KEY;
	}
	
	public String toString() {
		return "SampleBean [id=" + this.id + ", name=" + this.name + ", address=" + address + "]";
	}
}
