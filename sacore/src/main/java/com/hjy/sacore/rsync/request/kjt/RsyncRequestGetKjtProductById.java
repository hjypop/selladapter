package com.hjy.sacore.rsync.request.kjt;

import com.hjy.sacore.rsync.IRsyncRequest;

/**
 * 根据ID批量获取商品基本信息
 * 
 * @author xiegj
 * 
 */
public class RsyncRequestGetKjtProductById implements IRsyncRequest {

	private String[] ProductIDs ;

	private String SaleChannelSysNo = "";
	
	public String[] getProductIDs() {
		return ProductIDs;
	}

	public void setProductIDs(String[] productIDs) {
		ProductIDs = productIDs;
	}

	public String getSaleChannelSysNo() {
		return SaleChannelSysNo;
	}

	public void setSaleChannelSysNo(String saleChannelSysNo) {
		SaleChannelSysNo = saleChannelSysNo;
	}
}
