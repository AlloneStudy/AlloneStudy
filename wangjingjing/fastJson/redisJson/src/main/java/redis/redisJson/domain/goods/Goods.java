package redis.redisJson.domain.goods;

import java.util.List;
import java.util.Map;

public class Goods{
	public List<Map<String, String>> data;//不常用的数据这里我选择了用list<Map<>>的形式
	public String total_count;
	public String page_count;
	/**
	 * @return the data
	 */
	public List<Map<String, String>> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(List<Map<String, String>> data) {
		this.data = data;
	}
	/**
	 * @return the total_count
	 */
	public String getTotal_count() {
		return total_count;
	}
	/**
	 * @param total_count the total_count to set
	 */
	public void setTotal_count(String total_count) {
		this.total_count = total_count;
	}
	/**
	 * @return the page_count
	 */
	public String getPage_count() {
		return page_count;
	}
	/**
	 * @param page_count the page_count to set
	 */
	public void setPage_count(String page_count) {
		this.page_count = page_count;
	}
}
