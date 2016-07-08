package redis.redisJson.domain.user;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 9020711261136371493L;
	
	private String uid;
	private String address;
	
	//必须有
	public User() {
		
	}
	
	public User(String uid, String addr) {
		this.uid = uid;
		this.address = addr;
	}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
