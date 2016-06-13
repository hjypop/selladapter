package com.hjy.sacore.dao.project;

import com.hjy.sacore.base.BaseDao;
import com.hjy.sacore.entity.project.UserInfo;

public interface IUserInfoDao extends BaseDao<UserInfo, Integer> {
	
	public UserInfo login(UserInfo entity);
	
}
