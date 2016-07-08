package redis.redisJson.efficiency;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import com.alibaba.fastjson.JSON;

import redis.redisJson.domain.ComplexObj;
import redis.redisJson.domain.SampleBean;
import redis.redisJson.domain.user.User;
import redis.redisJson.util.JsonRedisSeriaziler;
import test.json.fastJson.service.Monitor;
import test.json.fastJson.util.ObjectFill;


public class RedisClientTest1 {

	private ApplicationContext app;
	private RedisTemplate redisTemplate;
	private StringRedisTemplate stringRedisTemplate;
	
	@Before
	public void before() {
		app = new ClassPathXmlApplicationContext("applicationContext.xml");
		redisTemplate = (RedisTemplate) app.getBean("redisTemplate");
		stringRedisTemplate = (StringRedisTemplate) app.getBean("stringRedisTemplate");
	}
	
	@Test
	public void singleTest() {
		User user = new User("u1", "addr1");
		Monitor.begin();
		stringRedisTemplate.opsForValue().set(user.getUid(), JsonRedisSeriaziler.seriazileAsString(user));
		Monitor.end("简单对象【单个】：JsonRedisSeriaziler【存】");
		
		Monitor.begin();
		User uu = JsonRedisSeriaziler.deserializeAsObject((String)redisTemplate.opsForValue().get("u1"), User.class);
		Monitor.end("简单对象【单个】： JsonRedisSeriaziler【取】");
		
		Monitor.begin();
		stringRedisTemplate.opsForValue().set(user.getUid(), JSON.toJSONString(user));
		Monitor.end("简单对象【单个】： JSON【存】");
		
		Monitor.begin();
		uu = JSON.parseObject(stringRedisTemplate.opsForValue().get("u1"), User.class);
		Monitor.end("简单对象【单个】： JSON【取】");
		
		//-------------------------------------------------------
		ComplexObj Object = getComplex(1);
		Monitor.begin();
		stringRedisTemplate.opsForValue().set(String.valueOf(Object.getId()), JsonRedisSeriaziler.seriazileAsString(Object));
		Monitor.end("复杂对象【单个】：JsonRedisSeriaziler【存】");
		
		Monitor.begin();
		ComplexObj o = JsonRedisSeriaziler.deserializeAsObject((String)redisTemplate.opsForValue().get(String.valueOf(Object.getId())), ComplexObj.class);
		Monitor.end("复杂对象【单个】： JsonRedisSeriaziler【取】");
		
		Monitor.begin();
		stringRedisTemplate.opsForValue().set(String.valueOf(Object.getId()), JSON.toJSONString(Object));
		Monitor.end("复杂对象【单个】： JSON【存】");
		
		Monitor.begin();
		o = JSON.parseObject(stringRedisTemplate.opsForValue().get(String.valueOf(Object.getId())), ComplexObj.class);
		Monitor.end("复杂对象【单个】： JSON【取】");
		
	}
	
	@Test
	public void listTest() {
		
	}
	
	
	
	private ComplexObj getComplex(int id) {
		ComplexObj t = new ComplexObj();
		t.setId(id);
		t.setName("name" + id);
		
		for(int i=1; i<5; i++) {
			t.add("list" + i);
			SampleBean s = ObjectFill.fullObject(SampleBean.class);
			t.set(s.getId(), s);
		}
		return t;
	}
}
