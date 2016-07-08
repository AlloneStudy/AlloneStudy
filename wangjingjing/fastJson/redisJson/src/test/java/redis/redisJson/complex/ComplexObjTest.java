package redis.redisJson.complex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.redis.core.StringRedisTemplate;

import redis.redisJson.domain.ComplexObj;
import redis.redisJson.domain.SampleBean;
import test.json.fastJson.service.Monitor;
import test.json.fastJson.util.ObjectFill;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class ComplexObjTest {
	private ApplicationContext app;
	private StringRedisTemplate redisTemplate;

	@Before
	public void before() {
		app = new ClassPathXmlApplicationContext("applicationContext.xml");
		redisTemplate = (StringRedisTemplate) app.getBean("stringRedisTemplate");

	}

	public void testMap() {
		System.out.println("==== test Map start ====");
		HashMap<String, String> map = new HashMap<String, String>();
		for(int i=1; i<10; i++) {
			map.put("key" + i, "value" + i);
		}
		String jsonStr = JSON.toJSONString(map);
		System.out.println("map: jsonStr=" + jsonStr);
		
		
		TypeReference<List<SampleBean>> ref = new TypeReference<List<SampleBean>>() {};
		
		
		System.out.println("==== test Map end ====");
	}
	
	
	@Test
	public void testList(){
		System.out.println("==== test List start ====");
		ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add("a1");
		arrayList.add("a2");
		arrayList.add("a3");
		arrayList.add("a4");
		
		String jsonStr = JSON.toJSONString(arrayList);
		System.out.println("jsonStr: " + jsonStr);
		
		List jsonToList = JSON.parseArray(jsonStr, String.class);
		for(Object value: jsonToList.toArray(new String[0])) {
			System.out.println("listValue: " + value);
		}

		System.out.println("---- second part ----");
		ArrayList<SampleBean> arrayList2 = new ArrayList<SampleBean>();
		arrayList2.add(ObjectFill.fullObject(SampleBean.class));
		arrayList2.add(ObjectFill.fullObject(SampleBean.class));
		arrayList2.add(ObjectFill.fullObject(SampleBean.class));
		jsonStr = JSON.toJSONString(arrayList2);
		System.out.println("jsonStr: " + jsonStr);
		
		jsonToList = JSON.parseArray(jsonStr, SampleBean.class);
		for(Object value: jsonToList.toArray(new SampleBean[0])) {
			SampleBean v = (SampleBean)value;
			System.out.println("listValue: " + value);
			System.out.println("id: " + v.getId());
			System.out.println("name: " + v.getName());
			System.out.println("address: " + v.getAddress());
		}
		System.out.println("==== test List end ====" + '\n');
	}
	
	
	@Ignore
	@Test
	public void test() {
		ComplexObj t1 = new ComplexObj();
		t1.setId(1);
		t1.setName("name1");

		for(int i=1; i<5; i++) {
			t1.add("list" + i);
			SampleBean s = ObjectFill.fullObject(SampleBean.class);
			t1.set(s.getId(), s);
		}
		
		Monitor.begin();
		String json = JSON.toJSONString(t1, true);
		System.out.println("json: " + json);
		redisTemplate.opsForValue().set("1" , json);
		Monitor.end("save");

		ComplexObj t2 = new ComplexObj();
		t2.setId(2);
		t2.setName("name2");

		for(int i=1; i<5; i++) {
			t2.add("list" + i);
			SampleBean s = ObjectFill.fullObject(SampleBean.class);
			t2.set(s.getId(), s);
		}
		
		Map map = new HashMap<Integer, ComplexObj>();
		map.put(t1.getId() , t1);
		map.put(t2.getId(), t2);
		
		Monitor.begin();
		json = JSON.toJSONString(map, true);
		System.out.println("json: " + json);
		redisTemplate.opsForValue().set("map" , json);
		Monitor.end("save");
		
		Monitor.begin();
		String value = redisTemplate.opsForValue().get("map" + "");
		Monitor.end("get");
		
		Monitor.begin();
		Monitor.end("parseObject");
//		for(JSONObject obj: map.values()) {
//			System.out.println(obj);
//			ComplexObj c = JSON.parseObject(obj.toString(), ComplexObj.class);
//			List lists = c.getLists();
//			Map<String, SampleBean> cM = c.getMap();
//		}
		System.out.println(map.toString());
	}


}
