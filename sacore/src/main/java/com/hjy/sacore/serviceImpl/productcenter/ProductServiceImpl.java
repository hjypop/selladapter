package com.hjy.sacore.serviceImpl.productcenter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hjy.sacore.dao.logcenter.ILcStockchangeDao;
import com.hjy.sacore.dao.productcenter.IPcProductcategoryRelDao;
import com.hjy.sacore.dao.productcenter.IPcProductdescriptionDao;
import com.hjy.sacore.dao.productcenter.IPcProductflowDao;
import com.hjy.sacore.dao.productcenter.IPcProductinfoDao;
import com.hjy.sacore.dao.productcenter.IPcProductinfoExtDao;
import com.hjy.sacore.dao.productcenter.IPcProductpicDao;
import com.hjy.sacore.dao.productcenter.IPcProductpropertyDao;
import com.hjy.sacore.dao.productcenter.IPcSkuinfoDao;
import com.hjy.sacore.dao.systemcenter.IScStoreSkunumDao;
import com.hjy.sacore.dao.usercenter.IUcSellercategoryProductRelationDao;
import com.hjy.sacore.service.productcenter.IProductService;

/**
 * 
 * @author zhy
 * @date 2016年6月14日 上午10:13:39
 * @description 商品信息业务处理接口实现类
 */
@Service("productService")
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IUcSellercategoryProductRelationDao ucSellercategoryProductRelationDao;
	@Autowired
	private IPcProductdescriptionDao pcProductdescriptionDao;
	@Autowired
	private IPcProductflowDao pcProductflowDao;
	@Autowired
	private IPcSkuinfoDao pcSkuinfoDao;
	@Autowired
	private IPcProductinfoDao pcProductinfoDao;
	@Autowired
	private IPcProductpicDao pcProductpicDao;
	@Autowired
	private IPcProductpropertyDao pcProductpropertyDao;
	@Autowired
	private ILcStockchangeDao lcStockchangeDao;
	@Autowired
	private IScStoreSkunumDao scStoreSkunumDao;
	@Autowired
	private IPcProductinfoExtDao pcProductinfoExtDao;
	@Autowired
	private IPcProductcategoryRelDao pcProductcategoryRelDao;

	@Override
	public int addProductTx() {
		System.out.println("--------->");
		return 0;
	}

}
