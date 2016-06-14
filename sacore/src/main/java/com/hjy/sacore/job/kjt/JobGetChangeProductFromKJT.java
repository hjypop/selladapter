package com.hjy.sacore.job.kjt;

import org.quartz.JobExecutionContext;

import com.hjy.sacore.rootweb.RootJob;
import com.hjy.sacore.rsync.kjt.RsyncGetKjtProductIdByDate;
import com.hjy.sacore.web.helper.WebHelper;

/**
 * @ClassName: JobGetChangeProductFromKJT
 * @Description: 从跨境通查询信息变化的商品并入库
 * @author 张海生
 * @date 2015-7-22 上午10:28:47
 * 
 */
public class JobGetChangeProductFromKJT extends RootJob {

	public void doExecute(JobExecutionContext context) {
		String Lockcode = WebHelper.addLock(10000, "cpkjt15269");
		// System.out.println("执行开始");
		// 从跨境通查询信息变化的商品入库
		new RsyncGetKjtProductIdByDate().doRsync();
		// System.out.println("执行结束");
		WebHelper.unLock(Lockcode);
	}
}
