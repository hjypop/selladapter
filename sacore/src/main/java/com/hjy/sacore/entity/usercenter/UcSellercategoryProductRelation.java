package com.hjy.sacore.entity.usercenter;

/**
 * 
 * @author zhy
 * @date 2016年6月14日 上午10:23:11
 * @description 店铺商品分类与商品关联表
 */
public class UcSellercategoryProductRelation {

	private String productCode = "";
	private String categoryCode = "";
	private String sellerCode = "";

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getSellerCode() {
		return sellerCode;
	}

	public void setSellerCode(String sellerCode) {
		this.sellerCode = sellerCode;
	}

}
