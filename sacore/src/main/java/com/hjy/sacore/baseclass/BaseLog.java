package com.hjy.sacore.baseclass;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.LogFactory;

import com.hjy.sacore.top.topdo.TopUp;

/**
 * 基本日志类
 * 
 * @author srnpr
 * 
 */
public class BaseLog {

	/**
	 * 记录日志信息
	 * 
	 * @param sClassName
	 * @param iInfoCode
	 * @param sParms
	 */
	public static void LogInfo(String sClassName, int iInfoCode, Object... sParms) {
		LogFactory.getLog(sClassName).info(FormatLog(iInfoCode, sParms));
	}

	/**
	 * 格式化日志输出
	 * 
	 * @param iInfoCode
	 * @param sParms
	 * @return
	 */
	public static String FormatLog(int iInfoCode, Object... sParms) {

		return "[" + String.valueOf(iInfoCode) + "] " + TopUp.upLogInfo(iInfoCode, sParms);
	}

	/**
	 * 类日志记录
	 * 
	 * @param clazz
	 * @param objects
	 */
	/**
	 * @param clazz
	 * @param objects
	 */
	public static void ClassLogInfo(Class<?> clazz, Object... objects) {
		LogFactory.getLog(clazz).info(StringUtils.join(objects));
	}

	/**
	 * 类日志警告
	 * 
	 * @param clazz
	 * @param objects
	 */
	public static void ClassLogWarn(Class<?> clazz, Object... objects) {
		LogFactory.getLog(clazz).warn(StringUtils.join(objects));
	}

}
