package com.hjy.sacore.dao.productcenter;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.hjy.sacore.entity.productcenter.PcProductpic;
import com.hjy.sacore.entity.productcenter.PcProductpicExample;

public interface IPcProductpicDao {

	int countByExample(PcProductpicExample example);

	int deleteByExample(PcProductpicExample example);

	int deleteByPrimaryKey(Integer zid);

	int insert(PcProductpic record);

	int insertSelective(PcProductpic record);

	List<PcProductpic> selectByExample(PcProductpicExample example);

	PcProductpic selectByPrimaryKey(Integer zid);

	int updateByExampleSelective(@Param("record") PcProductpic record, @Param("example") PcProductpicExample example);

	int updateByExample(@Param("record") PcProductpic record, @Param("example") PcProductpicExample example);

	int updateByPrimaryKeySelective(PcProductpic record);

	int updateByPrimaryKey(PcProductpic record);
}