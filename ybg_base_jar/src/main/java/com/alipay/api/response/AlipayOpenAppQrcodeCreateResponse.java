package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.app.qrcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2017-10-11 11:16:39
 */
public class AlipayOpenAppQrcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3523679821228229589L;

	/** 
	 * 二维码图片链接地址
	 */
	@ApiField("qr_code_url")
	private String qrCodeUrl;

	public void setQrCodeUrl(String qrCodeUrl) {
		this.qrCodeUrl = qrCodeUrl;
	}
	public String getQrCodeUrl( ) {
		return this.qrCodeUrl;
	}

}
