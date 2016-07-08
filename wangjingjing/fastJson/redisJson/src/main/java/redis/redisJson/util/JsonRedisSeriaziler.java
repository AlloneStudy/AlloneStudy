package redis.redisJson.util;

import java.nio.charset.Charset;

import org.springframework.data.redis.serializer.SerializationException;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
* 不使用sdr自带的json序列化工具，一切操作基于string
**/
public class JsonRedisSeriaziler{
	public static final String EMPTY_JSON = "{}";
	
	public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
	
	protected static ObjectMapper objectMapper = new ObjectMapper();
	public JsonRedisSeriaziler(){}
	
	/**
	 * java-object as json-string
	 * @param object
	 * @return
	 */
	public static String seriazileAsString(Object object){
		if (object== null) {
			return EMPTY_JSON;
		}
		try {
			return objectMapper.writeValueAsString(object);
		} catch (Exception ex) {
			throw new SerializationException("Could not write JSON: " + ex.getMessage(), ex);
		}
	}
	
	/**
	 * json-string to java-object
	 * @param str
	 * @return
	 */
	public static <T> T deserializeAsObject(String str,Class<T> clazz){
		if(str == null || clazz == null){
			return null;
		}
		try{
			return objectMapper.readValue(str, clazz);
		}catch (Exception ex) {
			throw new SerializationException("Could not write JSON: " + ex.getMessage(), ex);
		}
	}

}
