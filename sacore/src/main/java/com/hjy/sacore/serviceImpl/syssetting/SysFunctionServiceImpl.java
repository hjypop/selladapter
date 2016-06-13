package com.hjy.sacore.serviceImpl.syssetting;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hjy.sacore.base.BaseServiceImpl;
import com.hjy.sacore.dao.syssetting.ISysFunctionDao;
import com.hjy.sacore.entity.syssetting.SysFunction;
import com.hjy.sacore.service.syssetting.ISysFunctionService;

@Service("sysFunctionService") 
public class SysFunctionServiceImpl extends BaseServiceImpl<SysFunction , Integer> implements ISysFunctionService {

	@Resource
	private ISysFunctionDao sysFunctionDao;

}
