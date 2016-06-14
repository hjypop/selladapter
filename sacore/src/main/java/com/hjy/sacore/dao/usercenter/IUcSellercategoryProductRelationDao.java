package com.hjy.sacore.dao.usercenter;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hjy.sacore.entity.usercenter.UcSellercategoryProductRelation;
import com.hjy.sacore.entity.usercenter.UcSellercategoryProductRelationExample;

/**
 * 店铺商品分类与商品关联表
 * 
 * @author zhy
 * @date 2016年6月14日 上午11:16:22
 * @description
 */
public interface IUcSellercategoryProductRelationDao {
	int countByExample(UcSellercategoryProductRelationExample example);

	int deleteByExample(UcSellercategoryProductRelationExample example);

	int deleteByPrimaryKey(Integer zid);

	int insert(UcSellercategoryProductRelation record);

	int insertSelective(UcSellercategoryProductRelation record);

	List<UcSellercategoryProductRelation> selectByExample(UcSellercategoryProductRelationExample example);

	UcSellercategoryProductRelation selectByPrimaryKey(Integer zid);

	int updateByExampleSelective(@Param("record") UcSellercategoryProductRelation record,
			@Param("example") UcSellercategoryProductRelationExample example);

	int updateByExample(@Param("record") UcSellercategoryProductRelation record,
			@Param("example") UcSellercategoryProductRelationExample example);

	int updateByPrimaryKeySelective(UcSellercategoryProductRelation record);

	int updateByPrimaryKey(UcSellercategoryProductRelation record);
}
