package redis.redisJson.complex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Ignore;
import org.junit.Test;

import redis.redisJson.domain.ComplexObj;
import redis.redisJson.domain.SampleBean;
import redis.redisJson.domain.goods.GoodInfo;
import redis.redisJson.domain.goods.Goods;
import redis.redisJson.util.FastJsonTools;
import test.json.fastJson.util.ObjectFill;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

public class GoodTest {

	@Test
	public void goodTest() {
//		List<GoodInfo> dataList = new ArrayList<GoodInfo>();
//		for(int i=1; i<10; i++) {
//			GoodInfo info = ObjectFill.fullObject(GoodInfo.class);
//			dataList.add(info);
//		}
//		
//		String json = JSON.toJSONString(dataList);
//		System.out.println("json: " + json);
//		
//		List<GoodInfo> list = JSON.parseArray(json, GoodInfo.class);

		ArrayList<Map<String, GoodInfo>> data = new ArrayList<Map<String, GoodInfo>>();
		
		for(int i=1; i<10; i++) {
			Map<String, GoodInfo> map = new HashMap<String, GoodInfo>();
			map.put("key" + i, ObjectFill.fullObject(GoodInfo.class));
			data.add(map);
		}
	
		String json = JSON.toJSONString(data);
		System.out.println("json: " + json);
		
		List<Map<String, Object>> rData = JSON.parseObject(json, new TypeReference<List<Map<String, Object>>>(){});
		System.out.println();
		
	}
	
	@Ignore
	@Test
	public void goodsTest() {
		Goods goods = new Goods();
		goods.setPage_count("1");
		goods.setTotal_count("1");
		ArrayList<Map<String, String>> data = new ArrayList<Map<String, String>>();
		goods.setData(data);
		
		
		for(int i=1; i<10; i++) {//List<Map<String, String>> data
			Map<String, String> map = new HashMap<String, String> ();
			map.put("key" + i, "value" + i);
			data.add(map);
		}
		
		String json = JSON.toJSONString(goods);
		System.out.println("json: " + json);
		
		Goods goods1 = FastJsonTools.parseObject(json, Goods.class);
		System.out.println("totalCount: " + goods1.getTotal_count());
		System.out.println("pageCount: " + goods1.getPage_count());

		int i = 1;
		for(Map map: goods.getData()) {
			String key = "key" + i;
			System.out.println("k: " + key + ", v: " + map.get(key));
			i++;
		}
	}
}
