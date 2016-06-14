package com.hjy.sacore.dao.productcenter;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.hjy.sacore.entity.productcenter.PcProductinfo;
import com.hjy.sacore.entity.productcenter.PcProductinfoExample;

public interface IPcProductinfoDao {
	int countByExample(PcProductinfoExample example);

	int deleteByExample(PcProductinfoExample example);

	int deleteByPrimaryKey(Integer zid);

	int insert(PcProductinfo record);

	int insertSelective(PcProductinfo record);

	List<PcProductinfo> selectByExampleWithBLOBs(PcProductinfoExample example);

	List<PcProductinfo> selectByExample(PcProductinfoExample example);

	PcProductinfo selectByPrimaryKey(Integer zid);

	int updateByExampleSelective(@Param("record") PcProductinfo record, @Param("example") PcProductinfoExample example);

	int updateByExampleWithBLOBs(@Param("record") PcProductinfo record, @Param("example") PcProductinfoExample example);

	int updateByExample(@Param("record") PcProductinfo record, @Param("example") PcProductinfoExample example);

	int updateByPrimaryKeySelective(PcProductinfo record);

	int updateByPrimaryKeyWithBLOBs(PcProductinfo record);

	int updateByPrimaryKey(PcProductinfo record);
}