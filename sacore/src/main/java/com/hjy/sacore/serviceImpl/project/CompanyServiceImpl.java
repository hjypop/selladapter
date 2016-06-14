package com.hjy.sacore.serviceImpl.project;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hjy.sacore.base.inter.BaseServiceImpl;
import com.hjy.sacore.dao.project.ICompanyDao;
import com.hjy.sacore.entity.project.Company;
import com.hjy.sacore.service.project.ICompanyService;

@Service("companyService")
public class CompanyServiceImpl extends BaseServiceImpl<Company, Integer> implements ICompanyService {
	@Resource
	private ICompanyDao companyDao;
}
