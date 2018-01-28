package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 获取生产指令接口
 *
 * @author auto create
 * @since 1.0, 2017-11-02 20:59:35
 */
public class AntMerchantExpandAssetproduceAssignQueryModel extends AlipayObject {

	private static final long serialVersionUID = 7379423836683543793L;

	/**
	 * 每次拉取最大记录数量，可选值为[1,200] ;
	 */
	@ApiField("page_size")
	private Long pageSize;

	public Long getPageSize() {
		return this.pageSize;
	}
	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}

}
