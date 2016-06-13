package com.hjy.sacore.rsync;

/**
 * 同步处理的接口
 * 
 * @author srnpr
 *
 */
public interface IRsyncProcess {

	/**
	 * 同步接口
	 * @return 
	 */
	public boolean doRsync();

}
