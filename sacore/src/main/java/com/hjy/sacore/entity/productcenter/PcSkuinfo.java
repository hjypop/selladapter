package com.hjy.sacore.entity.productcenter;

import java.math.BigDecimal;

public class PcSkuinfo {
	private Integer zid;

	private String uid;
	private String skuCodeOld;

	private String skuCode;
	private String productCode;

	private BigDecimal sellPrice;
	private BigDecimal marketPrice;

	private BigDecimal costPrice;

	private Long stockNum;
	private String skuKey;
	private String skuKeyvalue;

	private String skuPicurl;
	private String sellProductcode;

	private String sellerCode;

	private Long securityStockNum;

	private String productCodeOld;

	private String qrcodeLink;

	private Integer sellCount;

	private String saleYn;

	private Integer flagEnable;

	private String barcode;
	private Integer miniOrder;

	public Integer getZid() {
		return zid;
	}

	public void setZid(Integer zid) {
		this.zid = zid;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getSkuCodeOld() {
		return skuCodeOld;
	}

	public void setSkuCodeOld(String skuCodeOld) {
		this.skuCodeOld = skuCodeOld;
	}

	public String getSkuCode() {
		return skuCode;
	}

	public void setSkuCode(String skuCode) {
		this.skuCode = skuCode;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public BigDecimal getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(BigDecimal sellPrice) {
		this.sellPrice = sellPrice;
	}

	public BigDecimal getMarketPrice() {
		return marketPrice;
	}

	public void setMarketPrice(BigDecimal marketPrice) {
		this.marketPrice = marketPrice;
	}

	public BigDecimal getCostPrice() {
		return costPrice;
	}

	public void setCostPrice(BigDecimal costPrice) {
		this.costPrice = costPrice;
	}

	public Long getStockNum() {
		return stockNum;
	}

	public void setStockNum(Long stockNum) {
		this.stockNum = stockNum;
	}

	public String getSkuKey() {
		return skuKey;
	}

	public void setSkuKey(String skuKey) {
		this.skuKey = skuKey;
	}

	public String getSkuKeyvalue() {
		return skuKeyvalue;
	}

	public void setSkuKeyvalue(String skuKeyvalue) {
		this.skuKeyvalue = skuKeyvalue;
	}

	public String getSkuPicurl() {
		return skuPicurl;
	}

	public void setSkuPicurl(String skuPicurl) {
		this.skuPicurl = skuPicurl;
	}

	public String getSellProductcode() {
		return sellProductcode;
	}

	public void setSellProductcode(String sellProductcode) {
		this.sellProductcode = sellProductcode;
	}

	public String getSellerCode() {
		return sellerCode;
	}

	public void setSellerCode(String sellerCode) {
		this.sellerCode = sellerCode;
	}

	public Long getSecurityStockNum() {
		return securityStockNum;
	}

	public void setSecurityStockNum(Long securityStockNum) {
		this.securityStockNum = securityStockNum;
	}

	public String getProductCodeOld() {
		return productCodeOld;
	}

	public void setProductCodeOld(String productCodeOld) {
		this.productCodeOld = productCodeOld;
	}

	public String getQrcodeLink() {
		return qrcodeLink;
	}

	public void setQrcodeLink(String qrcodeLink) {
		this.qrcodeLink = qrcodeLink;
	}

	public Integer getSellCount() {
		return sellCount;
	}

	public void setSellCount(Integer sellCount) {
		this.sellCount = sellCount;
	}

	public String getSaleYn() {
		return saleYn;
	}

	public void setSaleYn(String saleYn) {
		this.saleYn = saleYn;
	}

	public Integer getFlagEnable() {
		return flagEnable;
	}

	public void setFlagEnable(Integer flagEnable) {
		this.flagEnable = flagEnable;
	}

	public String getBarcode() {
		return barcode;
	}

	public void setBarcode(String barcode) {
		this.barcode = barcode;
	}

	public Integer getMiniOrder() {
		return miniOrder;
	}

	public void setMiniOrder(Integer miniOrder) {
		this.miniOrder = miniOrder;
	}
}