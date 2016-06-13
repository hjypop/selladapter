package com.hjy.sacore.serviceImpl.syssetting;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hjy.sacore.base.inter.BaseServiceImpl;
import com.hjy.sacore.dao.project.IUserInfoDao;
import com.hjy.sacore.entity.project.UserInfo;
import com.hjy.sacore.service.syssetting.IUserInfoService;

@Service("userInfoService")
public class UserInfoServiceImpl extends BaseServiceImpl<UserInfo, Integer> implements IUserInfoService {

	@Resource
	private IUserInfoDao userInfoDao;

	@Override
	public UserInfo login(UserInfo entity) {

		return userInfoDao.login(entity);
	}

}
