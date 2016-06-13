package com.hjy.sacore.service.syssetting;

import com.hjy.sacore.base.inter.BaseService;
import com.hjy.sacore.entity.project.UserInfo;

public interface IUserInfoService extends BaseService<UserInfo, Integer> {

	public UserInfo login(UserInfo entity);
}
