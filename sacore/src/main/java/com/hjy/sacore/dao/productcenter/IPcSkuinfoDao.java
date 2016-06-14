package com.hjy.sacore.dao.productcenter;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.hjy.sacore.entity.productcenter.PcSkuinfo;
import com.hjy.sacore.entity.productcenter.PcSkuinfoExample;
import com.hjy.sacore.entity.productcenter.PcSkuinfoWithBLOBs;

public interface IPcSkuinfoDao {
	int countByExample(PcSkuinfoExample example);

	int deleteByExample(PcSkuinfoExample example);

	int deleteByPrimaryKey(Integer zid);

	int insert(PcSkuinfoWithBLOBs record);

	int insertSelective(PcSkuinfoWithBLOBs record);

	List<PcSkuinfoWithBLOBs> selectByExampleWithBLOBs(PcSkuinfoExample example);

	List<PcSkuinfo> selectByExample(PcSkuinfoExample example);

	PcSkuinfoWithBLOBs selectByPrimaryKey(Integer zid);

	int updateByExampleSelective(@Param("record") PcSkuinfoWithBLOBs record,
			@Param("example") PcSkuinfoExample example);

	int updateByExampleWithBLOBs(@Param("record") PcSkuinfoWithBLOBs record,
			@Param("example") PcSkuinfoExample example);

	int updateByExample(@Param("record") PcSkuinfo record, @Param("example") PcSkuinfoExample example);

	int updateByPrimaryKeySelective(PcSkuinfoWithBLOBs record);

	int updateByPrimaryKeyWithBLOBs(PcSkuinfoWithBLOBs record);

	int updateByPrimaryKey(PcSkuinfo record);
}