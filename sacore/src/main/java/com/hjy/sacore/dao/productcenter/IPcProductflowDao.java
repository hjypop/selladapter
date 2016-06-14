package com.hjy.sacore.dao.productcenter;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.hjy.sacore.entity.productcenter.PcProductflow;
import com.hjy.sacore.entity.productcenter.PcProductflowExample;

public interface IPcProductflowDao {
	int countByExample(PcProductflowExample example);

	int deleteByExample(PcProductflowExample example);

	int deleteByPrimaryKey(Integer zid);

	int insert(PcProductflow record);

	int insertSelective(PcProductflow record);

	List<PcProductflow> selectByExampleWithBLOBs(PcProductflowExample example);

	List<PcProductflow> selectByExample(PcProductflowExample example);

	PcProductflow selectByPrimaryKey(Integer zid);

	int updateByExampleSelective(@Param("record") PcProductflow record, @Param("example") PcProductflowExample example);

	int updateByExampleWithBLOBs(@Param("record") PcProductflow record, @Param("example") PcProductflowExample example);

	int updateByExample(@Param("record") PcProductflow record, @Param("example") PcProductflowExample example);

	int updateByPrimaryKeySelective(PcProductflow record);

	int updateByPrimaryKeyWithBLOBs(PcProductflow record);

	int updateByPrimaryKey(PcProductflow record);
}