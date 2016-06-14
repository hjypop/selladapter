package com.hjy.sacore.entity.logcenter;

public class LcStockchange {

	private Integer zid;
	private String uid;
	private String code;
	private String info;
	private String createTime;
	private String createUser;
	private Integer changeStock;
	private Integer oldStock;
	private Integer nowStock;
	private String changeType;
	private String stockArea;
	private String stockBatch;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Integer getChangeStock() {
		return changeStock;
	}

	public void setChangeStock(Integer changeStock) {
		this.changeStock = changeStock;
	}

	public Integer getOldStock() {
		return oldStock;
	}

	public void setOldStock(Integer oldStock) {
		this.oldStock = oldStock;
	}

	public Integer getNowStock() {
		return nowStock;
	}

	public void setNowStock(Integer nowStock) {
		this.nowStock = nowStock;
	}

	public String getChangeType() {
		return changeType;
	}

	public void setChangeType(String changeType) {
		this.changeType = changeType;
	}

	public String getStockArea() {
		return stockArea;
	}

	public void setStockArea(String stockArea) {
		this.stockArea = stockArea;
	}

	public String getStockBatch() {
		return stockBatch;
	}

	public void setStockBatch(String stockBatch) {
		this.stockBatch = stockBatch;
	}
}