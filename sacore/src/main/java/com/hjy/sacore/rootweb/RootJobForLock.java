package com.hjy.sacore.rootweb;

import org.apache.commons.lang.StringUtils;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.hjy.sacore.base.helper.DateHelper;
import com.hjy.sacore.base.helper.FormatHelper;
import com.hjy.sacore.base.helper.LogHelper;
import com.hjy.sacore.base.inter.IBaseJob;
import com.hjy.sacore.base.model.MDataMap;
import com.hjy.sacore.base.model.MJobInfo;
import com.hjy.sacore.base.model.MLogJob;
import com.hjy.sacore.baseclass.BaseClass;
import com.hjy.sacore.top.topdo.TopConst;
import com.hjy.sacore.web.helper.WebHelper;

public abstract class RootJobForLock extends BaseClass implements IBaseJob {

	public void execute(JobExecutionContext context) throws JobExecutionException {

		String sLockKey = "";

		boolean bFlagExec = true;

		String sBeginTime = FormatHelper.upDateTime();
		String sNextTime = "";
		String sEndTime = "";

		MJobInfo mJobInfo = new MJobInfo();

		try {

			if (context != null && context.getMergedJobDataMap() != null
					&& context.getMergedJobDataMap().containsKey(TopConst.CONST_JOB_START + "status")) {

				if (context.getNextFireTime() != null) {
					sNextTime = DateHelper.upDate(context.getNextFireTime());
				}

				mJobInfo = (MJobInfo) context.getMergedJobDataMap().get(TopConst.CONST_JOB_START + "status");

				// 判断如果记日志
				if (mJobInfo.getExtendTypeLog() == 1) {
					MLogJob mLogJob = new MLogJob();

					mLogJob.setNextExecTime(sNextTime);
					mLogJob.setJobInfo(mJobInfo);

					LogHelper.addLog("run_job", mLogJob);
				}

				// 判断如果加锁 则开始加锁处理
				if (mJobInfo.getExtendLockTimer() > 0) {
					sLockKey = WebHelper.addLock(mJobInfo.getExtendLockTimer(), mJobInfo.getJobName());

					if (StringUtils.isBlank(sLockKey)) {
						bFlagExec = false;
					}
				}

			}

			if (bFlagExec) {
				doExecute(context);

				sEndTime = FormatHelper.upDateTime();

			}
		} catch (Exception e) {

			bLogError(967905003, this.getClass().getName());
			WebHelper.errorMessage(mJobInfo.getJobName(), "jobexecerror", 9, "rootjobforlock", mJobInfo.getJobClass(),
					e);
			e.printStackTrace();
		}

		// 如果key不为空 则直接解锁
		if (StringUtils.isNotBlank(sLockKey)) {
			WebHelper.unLock(sLockKey);
		}

		// 开始更新执行日志
		if (mJobInfo != null && StringUtils.isNotBlank(mJobInfo.getJobName())) {

			MDataMap mUpdateMap = new MDataMap();
			mUpdateMap.inAllValues("uid", mJobInfo.getJobName(), "begin_time", sBeginTime, "end_time", sEndTime,
					"next_time", sNextTime);

			// DbUp.upTable("za_job").dataUpdate(mUpdateMap,
			// "begin_time,end_time,next_time", "uid");

		}
	}

}
