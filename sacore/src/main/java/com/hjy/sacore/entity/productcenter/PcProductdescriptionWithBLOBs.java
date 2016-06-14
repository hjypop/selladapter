package com.hjy.sacore.entity.productcenter;

public class PcProductdescriptionWithBLOBs extends PcProductdescription {
	private String descriptionInfo;

	private String descriptionPic;

	private String keyword;

	public String getDescriptionInfo() {
		return descriptionInfo;
	}

	public void setDescriptionInfo(String descriptionInfo) {
		this.descriptionInfo = descriptionInfo;
	}

	public String getDescriptionPic() {
		return descriptionPic;
	}

	public void setDescriptionPic(String descriptionPic) {
		this.descriptionPic = descriptionPic;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
}