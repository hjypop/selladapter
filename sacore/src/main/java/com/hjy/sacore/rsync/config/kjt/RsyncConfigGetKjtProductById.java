package com.hjy.sacore.rsync.config.kjt;

import com.hjy.sacore.rsync.IRsyncDateCheck;
import com.hjy.sacore.rsync.config.RsyncConfigRsyncBase;

/**
 * 同步的配置选项
 * 
 * @author xiegj
 * 
 */
public class RsyncConfigGetKjtProductById extends RsyncConfigRsyncBase implements
		IRsyncDateCheck {

	public String getRsyncTarget() {

		return "Product.ProudctInfoBatchGet";
	}

	
	public String getBaseStartTime() {
		return "2015-05-01 00:00:00";
	}

	public int getMaxStepSecond() {
		return 3600 * 36;
	}

	public int getBackSecond() {
		return 0;
	}

}
