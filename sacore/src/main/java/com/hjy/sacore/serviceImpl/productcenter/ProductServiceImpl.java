package com.hjy.sacore.serviceImpl.productcenter;

import java.util.UUID;

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
import com.hjy.sacore.dto.productcenter.PcProductinfo;
import com.hjy.sacore.entity.productcenter.PcProductcategoryRel;
import com.hjy.sacore.entity.usercenter.UcSellercategoryProductRelation;
import com.hjy.sacore.service.productcenter.IProductService;
import com.hjy.sacore.util.DateUtil;

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
	public int addProductTx(PcProductinfo pc) {
		// 添加新的商品到商品表pc_productinfo
		String createTime = DateUtil.getSysDateTimeString();
		com.hjy.sacore.entity.productcenter.PcProductinfo pptModel = new com.hjy.sacore.entity.productcenter.PcProductinfo();
		pptModel.setUid(UUID.randomUUID().toString().replace("-", ""));
		pptModel.setCreateTime(createTime);
		pptModel.setBrandCode(pc.getBrandCode());
		pptModel.setFlagPayway(pc.getFlagPayway());
		pptModel.setFlagSale(pc.getFlagSale());
		pptModel.setLabels(pc.getLabels());
		pptModel.setMainpicUrl(pc.getMainPicUrl());
		pptModel.setMarketPrice(pc.getMarketPrice());
		pptModel.setMaxSellPrice(pc.getMaxSellPrice());
		pptModel.setMinSellPrice(pc.getMinSellPrice());
		pptModel.setProductCode(pc.getProductCode());
		pptModel.setProductCodeOld(pc.getProductCodeOld() == null ? "" : pc.getProductCodeOld());
		pptModel.setProductName(pc.getProdutName());
		pptModel.setProductStatus(pc.getProductStatus());
		pptModel.setProductVolume(pc.getProductVolume());
		pptModel.setProductVolumeItem(pc.getProductVolumeItem());
		pptModel.setProductWeight(pc.getProductWeight());
		pptModel.setSellerCode(pc.getSellerCode());
		pptModel.setSmallSellerCode(pc.getSmallSellerCode());
		pptModel.setSellProductcode(pc.getSellProductcode());
		pptModel.setTransportTemplate(pc.getTransportTemplate());
		pptModel.setAreaTemplate(pc.getAreaTemplate()); // 限购地区
		pptModel.setUpdateTime(createTime);
		pptModel.setCostPrice(pc.getCostPrice());
		pptModel.setProductShortname(pc.getProductShortname());
		pptModel.setSupplierName(pc.getSupplierName());
		pptModel.setVideoUrl(pc.getVideoUrl());
		pptModel.setValidateFlag(pc.getValidate_flag());// 添加是否是虚拟商品字段
		pptModel.setTaxRate(pc.getTaxRate());
		pptModel.setProductCodeCopy(pc.getProductCodeCopy());
		pptModel.setAdpicUrl(pc.getAdPicUrl());
		pptModel.setExpiryDate(pc.getExpiryDate());// 保质期
		pptModel.setExpiryUnit(pc.getExpiryUnit());// 保质期单位
		pptModel.setQualificationCategoryCode(pc.getQualificationCategoryCode());// 资质品类
		int insertPcProductInfoResult = pcProductinfoDao.insertSelective(pptModel);
		// 添加商品的分类信息
		if (insertPcProductInfoResult > 0) {
			/*
			 * 如果店铺商品分类与商品关联列表不为空
			 * 添加铺商品分类与商品关联信息到铺商品分类与商品关联表uc_sellercategory_product_relation
			 */
			if (pc.getUsprList() != null && pc.getUsprList().size() > 0) {
				for (int i = 0; i < pc.getUsprList().size(); i++) {
					UcSellercategoryProductRelation usprModel = new UcSellercategoryProductRelation();
					usprModel.setCategoryCode(pc.getUsprList().get(i).getCategoryCode());
					usprModel.setProductCode(pc.getUsprList().get(i).getProductCode());
					usprModel.setSellerCode(pc.getUsprList().get(i).getSellerCode());
					usprModel.setUid(UUID.randomUUID().toString().replace("-", ""));
					ucSellercategoryProductRelationDao.insertSelective(usprModel);
				}
			}
		}
		// 添加商品的实类信息
		if (null != pc.getPcProductcategoryRel()) {
			PcProductcategoryRel pprModel = new PcProductcategoryRel();
			pprModel.setCategoryCode(pc.getPcProductcategoryRel().getCategoryCode());
			pprModel.setFlagMain(Long.parseLong(pc.getPcProductcategoryRel().getFlagMain() + ""));
			pprModel.setProductCode(pc.getPcProductcategoryRel().getProductCode());
			pprModel.setUid(UUID.randomUUID().toString().replace("-", ""));
			pcProductcategoryRelDao.insertSelective(pprModel);
		}
		//
		return 0;
	}

}
