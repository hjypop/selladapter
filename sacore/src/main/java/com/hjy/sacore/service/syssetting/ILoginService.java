package com.hjy.sacore.service.syssetting;

import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSONObject;
import com.hjy.sacore.base.inter.BaseService;
import com.hjy.sacore.entity.project.UserInfo;

public interface ILoginService extends BaseService<UserInfo, Integer> {

	public JSONObject login(UserInfo userInfo, HttpSession session);

	public void logout(UserInfo userInfo);
}
