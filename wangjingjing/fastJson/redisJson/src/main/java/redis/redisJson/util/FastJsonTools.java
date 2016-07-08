package redis.redisJson.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

public class FastJsonTools {
	public FastJsonTools() {
		
	}
	
	/**
	 * 对单个javabean的解析
	 * @param jsonString
	 * @param cls
	 * @return
	 */
	public static <T> T parseObject(String jsonString, Class<T> cls) {
		T t = null;
		try {
			t = JSON.parseObject(jsonString, cls);	
		} catch (Exception e) {
		}
		return t;
	}
	
	public static <T>  List<T> parseArray(String jsonString, Class<T> cls) {
		List<T> list = new ArrayList<T>();
		try {
			list = JSON.parseArray(jsonString, cls);
		} catch (Exception e) {
		}
		return list;
	}
	
	public static List<Map<String, Object>> parseToListMaps(String jsonString) {
		List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
		try {
			list = JSON.parseObject(jsonString, new TypeReference<List<Map<String, Object>>>(){});
		} catch (Exception e) {
		}
		return list;
	}
}