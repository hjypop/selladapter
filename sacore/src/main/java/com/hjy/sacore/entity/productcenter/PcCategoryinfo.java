package com.hjy.sacore.entity.productcenter;

/**
 * 商品分类表 pc_categoryinfo
 * @author zhy
 * @date 2016年6月14日 上午10:23:54
 * @description
 */
public class PcCategoryinfo {

	/**
	 * 
	 */
	private Integer zid = 0;
	/**
	 * 
	 */
	private String uid = "";
	/**
	 * 分类编号
	 */
	private String categoryCode = "";
	/**
	 * 分类名称
	 */
	private String categoryName = "";
	/**
	 * 父编号
	 */
	private String parentCode = "";

	public void setZid(Integer zid) {
		this.zid = zid;
	}

	public Integer getZid() {
		return this.zid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUid() {
		return this.uid;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryCode() {
		return this.categoryCode;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setParentCode(String parentCode) {
		this.parentCode = parentCode;
	}

	public String getParentCode() {
		return this.parentCode;
	}
}
