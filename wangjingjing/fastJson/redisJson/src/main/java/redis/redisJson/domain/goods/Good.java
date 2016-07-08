package redis.redisJson.domain.goods;

import java.util.List;

public class Good {
	public List<GoodInfo> data;
	public String total_count;
	public String page_count;
	/**
	 * @return the data
	 */
	public List<GoodInfo> getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(List<GoodInfo> data) {
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
