package com.hjy.sacom.base;

import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class BaseController {
	protected Logger logger = Logger.getLogger(BaseController.class);
	
	
	/**
	 * @descriptions json反序列化成对象
	 * 
	 * @param json 
	 * @param t
	 * @return T
	 * @date 2016年6月14日上午11:19:40
	 * @author Yangcl  
	 * @param <T>
	 */
	@SuppressWarnings("unchecked")
	public <T> T fromJson(String json, Class cls  ) {
		return (T) JSONObject.parseObject(json, cls); 					//		T t = (T) JSON.parseObject(json, clzss); 也可以用
	}
	
	
	/**
	 * @descriptions 对象序列化成json
	 * 
	 * @param t
	 * @return String
	 * @date 2016年6月14日上午11:24:31
	 * @author Yangcl  
	 */
	public <T> String toJson(T t){
		return JSON.toJSONString(t);
	}

	
}






















