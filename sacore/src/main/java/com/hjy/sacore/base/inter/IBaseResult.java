package com.hjy.sacore.base.inter;

/**
 * 返回结构参数
 * 
 * @author srnpr
 * 
 */
public interface IBaseResult {

	/**
	 * 获取结果编号
	 * 
	 * @return
	 */
	public int getResultCode();

	/**
	 * 获取结果信息
	 * 
	 * @return
	 */
	public String getResultMessage();
}
