package com.hjy.sacom.controller.syssetting;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONObject;
import com.hjy.sacom.base.BaseController;
import com.hjy.sacore.entity.syssetting.SysFunction;
import com.hjy.sacore.service.syssetting.ISysFunctionService;

/**
 * @descriptions 系统功能主干控制。
 * 
 * @date 2016年6月1日下午5:28:25
 * @author Yangcl
 * @version 1.0.1
 */
@Controller
@RequestMapping("sysfunction")
public class SysFunctionController extends BaseController {
	private static Logger logger = Logger.getLogger(SysFunctionController.class);

	@Autowired
	private ISysFunctionService service;

	/**
	 * @descriptions 前往树形维护页面
	 * 
	 * @return
	 * @refactor no
	 * @date 2016年6月1日下午5:29:41
	 * @author Yangcl
	 * @version 1.0.0.1
	 */
	@RequestMapping("showview")
	public String shwoView(ModelMap model) {
		logger.info(" to sysFunction.jsp  ... ");

		SysFunction entity = new SysFunction();
		entity.setFlag(1);
		JSONObject result = service.jsonList(entity);
		model.put("jsonTree", result);

		return "jsp/syssetting/sysFunction";
	}

}
