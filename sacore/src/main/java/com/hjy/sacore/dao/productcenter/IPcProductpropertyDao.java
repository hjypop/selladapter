package com.hjy.sacore.dao.productcenter;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.hjy.sacore.entity.productcenter.PcProductproperty;
import com.hjy.sacore.entity.productcenter.PcProductpropertyExample;

public interface IPcProductpropertyDao {
	int countByExample(PcProductpropertyExample example);

	int deleteByExample(PcProductpropertyExample example);

	int deleteByPrimaryKey(Integer zid);

	int insert(PcProductproperty record);

	int insertSelective(PcProductproperty record);

	List<PcProductproperty> selectByExample(PcProductpropertyExample example);

	PcProductproperty selectByPrimaryKey(Integer zid);

	int updateByExampleSelective(@Param("record") PcProductproperty record,
			@Param("example") PcProductpropertyExample example);

	int updateByExample(@Param("record") PcProductproperty record, @Param("example") PcProductpropertyExample example);

	int updateByPrimaryKeySelective(PcProductproperty record);

	int updateByPrimaryKey(PcProductproperty record);
}