package com.hjy.sacore.dao.productcenter;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hjy.sacore.entity.productcenter.PcProductdescription;
import com.hjy.sacore.entity.productcenter.PcProductdescriptionExample;
import com.hjy.sacore.entity.productcenter.PcProductdescriptionWithBLOBs;

/**
 * 
 * @author zhy
 * @date 2016年6月14日 上午11:02:01
 * @description
 */
public interface IPcProductdescriptionDao {
	int countByExample(PcProductdescriptionExample example);

	int deleteByExample(PcProductdescriptionExample example);

	int deleteByPrimaryKey(Integer zid);

	int insert(PcProductdescriptionWithBLOBs record);

	int insertSelective(PcProductdescriptionWithBLOBs record);

	List<PcProductdescriptionWithBLOBs> selectByExampleWithBLOBs(PcProductdescriptionExample example);

	List<PcProductdescription> selectByExample(PcProductdescriptionExample example);

	PcProductdescriptionWithBLOBs selectByPrimaryKey(Integer zid);

	int updateByExampleSelective(@Param("record") PcProductdescriptionWithBLOBs record,
			@Param("example") PcProductdescriptionExample example);

	int updateByExampleWithBLOBs(@Param("record") PcProductdescriptionWithBLOBs record,
			@Param("example") PcProductdescriptionExample example);

	int updateByExample(@Param("record") PcProductdescription record,
			@Param("example") PcProductdescriptionExample example);

	int updateByPrimaryKeySelective(PcProductdescriptionWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(PcProductdescriptionWithBLOBs record);

	int updateByPrimaryKey(PcProductdescription record);
}
