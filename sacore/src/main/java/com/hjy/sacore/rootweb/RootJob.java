package com.hjy.sacore.rootweb;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.hjy.sacore.base.helper.DateHelper;
import com.hjy.sacore.base.helper.LogHelper;
import com.hjy.sacore.base.inter.IBaseJob;
import com.hjy.sacore.base.model.MJobInfo;
import com.hjy.sacore.base.model.MLogJob;
import com.hjy.sacore.top.topdo.TopConst;

/**
 * 根任务 所有任务接口需要调用该基类
 * 
 * @author srnpr
 * 
 */
public abstract class RootJob extends RootJobForLock implements IBaseJob {

	// 这个是备份执行 为了防止新逻辑出错时 直接修改代码 更新继承和这块逻辑就行
	public void back_execute(JobExecutionContext context) throws JobExecutionException {
		try {
			if (context != null && context.getMergedJobDataMap() != null
					&& context.getMergedJobDataMap().containsKey(TopConst.CONST_JOB_START + "status")) {

				/*
				 * 
				 * MDataMap mStatusMap = (MDataMap)
				 * context.getMergedJobDataMap() .get(TopConst.CONST_JOB_START +
				 * "status");
				 * 
				 * // 下一次运行时间 mStatusMap.put("job_next_time",
				 * DateHelper.upDate(context.getNextFireTime()));
				 * 
				 * // 添加执行日志 LogHelper.addLog("run_job", mStatusMap);
				 */
				MJobInfo mJobInfo = (MJobInfo) context.getMergedJobDataMap().get(TopConst.CONST_JOB_START + "status");

				// 判断如果记日志
				if (mJobInfo.getExtendTypeLog() == 1) {
					MLogJob mLogJob = new MLogJob();

					mLogJob.setNextExecTime(DateHelper.upDate(context.getNextFireTime()));
					mLogJob.setJobInfo(mJobInfo);

					LogHelper.addLog("run_job", mLogJob);
				}
			}
			doExecute(context);
		} catch (Exception e) {
			bLogError(967905003, this.getClass().getName());
			e.printStackTrace();
		}

	}
}
