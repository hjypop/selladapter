package com.hjy.sacore.service.syssetting;

import com.alibaba.fastjson.JSONObject;
import com.hjy.sacore.base.inter.BaseService;
import com.hjy.sacore.entity.project.UserInfo;

public interface IUserInfoService extends BaseService<UserInfo, Integer> {

	public UserInfo login(UserInfo entity);
	
	public JSONObject deleteOne(UserInfo entity);
	
	public JSONObject editInfo(UserInfo entity);
}
