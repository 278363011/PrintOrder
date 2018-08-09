package com.alibaba.partybusiness.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alibaba.logistics.param.AlibabaLogisticsMyFreightTemplateCreateParam;
import com.alibaba.logistics.param.AlibabaLogisticsMyFreightTemplateCreateResult;
import com.alibaba.logistics.param.AlibabaLogisticsMyFreightTemplateListGetParam;
import com.alibaba.logistics.param.AlibabaLogisticsMyFreightTemplateListGetResult;
import com.alibaba.logistics.param.AlibabaLogisticsMyFreightTemplateUpdateParam;
import com.alibaba.logistics.param.AlibabaLogisticsMyFreightTemplateUpdateResult;
import com.alibaba.logistics.param.AlibabaLogisticsMySendGoodsAddressListGetParam;
import com.alibaba.logistics.param.AlibabaLogisticsMySendGoodsAddressListGetResult;
import com.alibaba.logistics.param.AlibabaLogisticsOpDeliverySendOrderOfflineParam;
import com.alibaba.logistics.param.AlibabaLogisticsOpDeliverySendOrderOfflineResult;
import com.alibaba.logistics.param.AlibabaLogisticsOpQueryLogisticCompanyListParam;
import com.alibaba.logistics.param.AlibabaLogisticsOpQueryLogisticCompanyListResult;
import com.alibaba.logistics.param.AlibabaTradeGetLogisticsInfosSellerViewParam;
import com.alibaba.logistics.param.AlibabaTradeGetLogisticsInfosSellerViewResult;
import com.alibaba.logistics.param.AlibabaTradeGetLogisticsTraceInfoSellerViewParam;
import com.alibaba.logistics.param.AlibabaTradeGetLogisticsTraceInfoSellerViewResult;
import com.alibaba.ocean.rawsdk.ApiExecutor;
import com.alibaba.partybusiness.service.LogisticsManagerService;
import com.alibaba.partybusiness.utils.ApiExecutorUtils;

/**
 * 物流管理服务
 * @author zzq
 *
 */
@Service
public class LogisticsManagerServiceImpl implements LogisticsManagerService {
	@Value("appkey")
	private String appkey;
	@Value("seckey")
	private String seckey;
	
	public String getAppkey() {
		return appkey;
	}
	public void setAppkey(String appkey) {
		this.appkey = appkey;
	}
	public String getSeckey() {
		return seckey;
	}
	public void setSeckey(String seckey) {
		this.seckey = seckey;
	}
	/**
	 * 物流发货-自己联系物流发货
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaLogisticsOpDeliverySendOrderOfflineResult AlibabaLogisticsOpDeliverySendOrderOffline(AlibabaLogisticsOpDeliverySendOrderOfflineParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaLogisticsOpDeliverySendOrderOfflineResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 获取交易订单的物流跟踪信息-卖家视角
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeGetLogisticsTraceInfoSellerViewResult AlibabaTradeGetLogisticsTraceInfoSellerView(AlibabaTradeGetLogisticsTraceInfoSellerViewParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaTradeGetLogisticsTraceInfoSellerViewResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 获取订单的物流信息-卖家视角
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeGetLogisticsInfosSellerViewResult AlibabaTradeGetLogisticsInfosSellerView(AlibabaTradeGetLogisticsInfosSellerViewParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaTradeGetLogisticsInfosSellerViewResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 创建我的运费模板
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaLogisticsMyFreightTemplateCreateResult AlibabaLogisticsMyFreightTemplateCreate(AlibabaLogisticsMyFreightTemplateCreateParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaLogisticsMyFreightTemplateCreateResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 修改我的运费模板
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaLogisticsMyFreightTemplateUpdateResult AlibabaLogisticsMyFreightTemplateUpdate(AlibabaLogisticsMyFreightTemplateUpdateParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaLogisticsMyFreightTemplateUpdateResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 获取卖家的物流模板
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaLogisticsMyFreightTemplateListGetResult  AlibabaLogisticsMyFreightTemplateListGet(AlibabaLogisticsMyFreightTemplateListGetParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaLogisticsMyFreightTemplateListGetResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 获取所有物流公司列表
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaLogisticsOpQueryLogisticCompanyListResult AlibabaLogisticsOpQueryLogisticCompanyList(AlibabaLogisticsOpQueryLogisticCompanyListParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaLogisticsOpQueryLogisticCompanyListResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 我的发货地址
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaLogisticsMySendGoodsAddressListGetResult AlibabaLogisticsMySendGoodsAddressListGet(AlibabaLogisticsMySendGoodsAddressListGetParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaLogisticsMySendGoodsAddressListGetResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
