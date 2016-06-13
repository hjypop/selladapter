package com.hjy.sacore.base.inter;

import org.quartz.Job;
import org.quartz.JobExecutionContext;

public interface IBaseJob extends Job {

	/**
	 * 
	 * 调用执行定时任务
	 * 
	 * @param context
	 */
	public void doExecute(JobExecutionContext context);

}
