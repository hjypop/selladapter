package com.hjy.sacore.rsync.response.kjt;

import java.util.ArrayList;
import java.util.List;

import com.hjy.sacore.rsync.model.kjt.RsyncModelGetKjtChangeProduct;
import com.hjy.sacore.rsync.response.RsyncKjtResponseBase;

/**
 * 商品信息返回接口
 * 
 * @author xiegj
 * 
 */
public class RsyncResponseGetKjtProductIdByDate extends RsyncKjtResponseBase {

	private Data Data = new Data();

	public Data getData() {
		return Data;
	}

	public void setData(Data data) {
		Data = data;
	}

	public static class Data {
		private List<RsyncModelGetKjtChangeProduct> ProductList = new ArrayList<RsyncModelGetKjtChangeProduct>();

		private int Total = 0;

		public List<RsyncModelGetKjtChangeProduct> getProductList() {
			return ProductList;
		}

		public void setProductList(List<RsyncModelGetKjtChangeProduct> productList) {
			ProductList = productList;
		}

		public int getTotal() {
			return Total;
		}

		public void setTotal(int total) {
			Total = total;
		}

	}
}
