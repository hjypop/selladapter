package com.hjy.sacore.service.productcenter;

import com.hjy.sacore.dto.productcenter.PcProductinfo;

/**
 * 
 * @author zhy
 * @date 2016年6月14日 上午10:13:39
 * @description 商品信息业务处理接口
 */
public interface IProductService {

	/**
	 * 
	 * @name: addProductTx
	 * @description: 添加商品
	 * @author: zhy
	 * @date: 2016年6月14日上午11:00:26
	 * @return: int
	 */
	int addProductTx(PcProductinfo pc);
}
