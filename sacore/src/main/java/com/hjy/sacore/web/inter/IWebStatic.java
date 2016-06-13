package com.hjy.sacore.web.inter;

public interface IWebStatic {

	/**
	 * 标量编号 该编号请人工确认唯一 否则设置错了后果自负 推荐使用4497系列的编号模型
	 * 
	 * @return
	 */
	public String upCode();

	/**
	 * 标量默认值 用于在最开始时的默认值 默认可以返回空
	 * 
	 * @return
	 */
	public String upDefault();

}
