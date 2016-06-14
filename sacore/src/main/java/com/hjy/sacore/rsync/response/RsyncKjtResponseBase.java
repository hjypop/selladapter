package com.hjy.sacore.rsync.response;

import com.hjy.sacore.rsync.IRsyncResponse;

public class RsyncKjtResponseBase implements IRsyncResponse {

	private String Code = "";

	private String Desc = "";

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	public String getDesc() {
		return Desc;
	}

	public void setDesc(String desc) {
		Desc = desc;
	}
}
