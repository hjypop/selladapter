package com.hjy.sacore.web.api;

import com.hjy.sacore.base.inter.IBaseResult;
import com.hjy.sacore.top.api.RootResult;
import com.hjy.sacore.top.topdo.TopUp;

public class RootResultWeb extends RootResult {

	public void inErrorMessage(int iErrorCode, Object... sParms) {

		setResultCode(iErrorCode);

		setResultMessage(TopUp.upLogInfo(iErrorCode, sParms));
	}

	public boolean upFlagTrue() {
		return getResultCode() == 1;
	}

	/**
	 * 添加其他结果
	 * 
	 * @param iResult
	 */
	public void inOtherResult(IBaseResult iResult) {
		setResultCode(iResult.getResultCode());
		setResultMessage(iResult.getResultMessage());

	}

}
