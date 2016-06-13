package com.hjy.sacore.top.topdo;

import org.apache.commons.lang3.StringUtils;

import com.hjy.sacore.base.model.MStringMap;
import com.hjy.sacore.rootclass.RootCache;

public class ConfigMap extends RootCache<String, MStringMap> {

	public synchronized void refresh() {

		TopConfig tConfig = TopConfig.Instance;

		if (tConfig.upKeys().size() == 0) {
			tConfig.refresh();
		}

		for (String s : tConfig.upKeys()) {
			if (StringUtils.indexOf(s, "[") > -1) {
				String sTopKey = StringUtils.substringBefore(s, "[");

				if (!this.containsKey(sTopKey)) {
					this.inElement(sTopKey, new MStringMap());
				}

				String sSubKeyString = StringUtils.substringBetween(s, "[", "]");

				this.upValue(sTopKey).put(sSubKeyString, tConfig.upValue(s));

			}
		}

	}

	@Override
	public MStringMap upOne(String k) {

		return null;
	}

}
