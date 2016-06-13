package com.hjy.sacore.rootclass;

import java.util.List;

import com.hjy.sacore.top.topdo.TopBase;

import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;
import net.sf.ehcache.config.CacheConfiguration;

public class RootCustomCache<K, V> extends TopBase {

	private Cache cache;

	/**
	 * 构造函数
	 */
	public RootCustomCache() {
		CacheDefine cDefine = new CacheDefine();
		String sCacheName = this.getClass().getName();
		CacheConfiguration cacheConfiguration = new CacheConfiguration();

		cacheConfiguration.setName(sCacheName);

		// 设置最大数量
		cacheConfiguration.setMaxEntriesLocalHeap(9999999);
		// 设置最长存活时间
		cacheConfiguration.setTimeToIdleSeconds(6000);

		cacheConfiguration.setMemoryStoreEvictionPolicy("FIFO");

		cache = cDefine.inCustomCache(sCacheName, cacheConfiguration);
	}

	public void inElement(K k, V v) {

		cache.put(new Element(k, v));
	}

	public void inElement(Element element) {
		cache.put(element);
	}

	@SuppressWarnings("unchecked")
	public List<K> upKeys() {
		return cache.getKeys();
	}

	public V upValueAndRemove(K k) {

		Object oReturnObject = null;
		if (cache.isKeyInCache(k)) {
			Element eCachElement = cache.get(k);
			if (eCachElement != null) {
				oReturnObject = eCachElement.getObjectValue();
			}

		}

		cache.remove(k);
		return (V) oReturnObject;

	}

	/**
	 * 获取指定key对应的值
	 * 
	 * @param k
	 * @return
	 */
	public V upValue(K k) {
		Object oReturnObject = null;
		if (cache.isKeyInCache(k)) {
			Element eCachElement = cache.get(k);
			if (eCachElement != null) {
				oReturnObject = eCachElement.getObjectValue();
			}

		}

		return (V) oReturnObject;
	}

}
