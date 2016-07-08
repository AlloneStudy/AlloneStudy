package redis.redisJson.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import redis.redisJson.domain.user.User;
import redis.redisJson.util.JsonRedisSeriaziler;

@Service("redisClient")
public class RedisClient {

	
	@Autowired
	private RedisTemplate redisTemplate;

	
	public void insertUser(User user){
		 redisTemplate.opsForValue().set( user.getUid(), JsonRedisSeriaziler.seriazileAsString(user));
//		 redisTemplate.opsForValue().set(user.getUid(), user);
	}
	
	public User getUser(String id){
		return JsonRedisSeriaziler.deserializeAsObject((String)redisTemplate.opsForValue().get(id), User.class);
	}
}