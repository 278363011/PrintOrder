package com.alibaba.partybusiness.service.impl;

import org.springframework.beans.factory.annotation.Value;

import com.alibaba.ocean.rawsdk.ApiExecutor;
import com.alibaba.partybusiness.service.OrderManagerService;
import com.alibaba.partybusiness.utils.ApiExecutorUtils;
import com.alibaba.trade.param.AlibabaInvoiceGetParam;
import com.alibaba.trade.param.AlibabaInvoiceGetResult;
import com.alibaba.trade.param.AlibabaOrderMemoAddParam;
import com.alibaba.trade.param.AlibabaOrderMemoAddResult;
import com.alibaba.trade.param.AlibabaTradeAddresscodeGetParam;
import com.alibaba.trade.param.AlibabaTradeAddresscodeGetResult;
import com.alibaba.trade.param.AlibabaTradeAddresscodeGetchildParam;
import com.alibaba.trade.param.AlibabaTradeAddresscodeGetchildResult;
import com.alibaba.trade.param.AlibabaTradeCancelParam;
import com.alibaba.trade.param.AlibabaTradeCancelResult;
import com.alibaba.trade.param.AlibabaTradeFastCreateOrderParam;
import com.alibaba.trade.param.AlibabaTradeFastCreateOrderResult;
import com.alibaba.trade.param.AlibabaTradeGetSellerOrderListParam;
import com.alibaba.trade.param.AlibabaTradeGetSellerOrderListResult;
import com.alibaba.trade.param.AlibabaTradeGetSellerViewParam;
import com.alibaba.trade.param.AlibabaTradeGetSellerViewResult;
import com.alibaba.trade.param.AlibabaTradeOpQueryMarketingMixConfigParam;
import com.alibaba.trade.param.AlibabaTradeOpQueryMarketingMixConfigResult;
import com.alibaba.trade.param.AlibabaTradeOrderPostponeConfirmTimeParam;
import com.alibaba.trade.param.AlibabaTradeOrderPostponeConfirmTimeResult;
import com.alibaba.trade.param.AlibabaTradeRefundOpAgreeReturnGoodsParam;
import com.alibaba.trade.param.AlibabaTradeRefundOpAgreeReturnGoodsResult;
import com.alibaba.trade.param.AlibabaTradeRefundOpQueryBatchRefundByOrderIdAndStatusParam;
import com.alibaba.trade.param.AlibabaTradeRefundOpQueryBatchRefundByOrderIdAndStatusResult;
import com.alibaba.trade.param.AlibabaTradeRefundOpQueryOrderRefundParam;
import com.alibaba.trade.param.AlibabaTradeRefundOpQueryOrderRefundResult;
import com.alibaba.trade.param.AlibabaTradeRefundQueryOrderRefundListParam;
import com.alibaba.trade.param.AlibabaTradeRefundQueryOrderRefundListResult;

import cn.alibaba.open.param.AreaCodeGetParam;
import cn.alibaba.open.param.AreaCodeGetResult;
import cn.alibaba.open.param.TradeOrderBatchRateParam;
import cn.alibaba.open.param.TradeOrderBatchRateResult;
import cn.alibaba.open.param.TradeOrderModifyOrderPriceParam;
import cn.alibaba.open.param.TradeOrderModifyOrderPriceResult;

/**
 * 订单管理服务
 * 
 * @author zzq
 *
 */
public class OrderManagerServiceImpl implements OrderManagerService{
	
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
	 * 订单列表查看(卖家视角)
	 * @param listParam 入参属性
	 * @param accessToken token验证
	 * @param bizTypes
	 * @return   
	 */
	public AlibabaTradeGetSellerOrderListResult alibabaTradeGetSellerOrderList(AlibabaTradeGetSellerOrderListParam listParam,
			String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaTradeGetSellerOrderListResult result=apiExecutor.execute(listParam, accessToken);
		return result;
	}
	/**
	 * 获取订单详情
	 * @param listParam 入参属性
	 * @param accessToken token验证
	 * @return
	 */
	public AlibabaTradeGetSellerViewResult  alibabaTradeGetSellerView(AlibabaTradeGetSellerViewParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaTradeGetSellerViewResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	
	/**
	 * 快速创建1688订单
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeFastCreateOrderResult alibabaTradeFastCreateOrder(AlibabaTradeFastCreateOrderParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaTradeFastCreateOrderResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 取消交易
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeCancelResult alibabaTradeCancel(AlibabaTradeCancelParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaTradeCancelResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 修改订单价格
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	
	public TradeOrderModifyOrderPriceResult tradeOrderModifyOrderPrice(TradeOrderModifyOrderPriceParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		TradeOrderModifyOrderPriceResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 批量提交订单评价
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public TradeOrderBatchRateResult tradeOrderBatchRate(TradeOrderBatchRateParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		TradeOrderBatchRateResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	
	/**
	 * 订单增加备注
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaOrderMemoAddResult alibabaOrderMemoAdd(AlibabaOrderMemoAddParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaOrderMemoAddResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 查询卖家混批设置
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeOpQueryMarketingMixConfigResult AlibabaTradeOpQueryMarketingMixConfig(AlibabaTradeOpQueryMarketingMixConfigParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaTradeOpQueryMarketingMixConfigResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 获取交易地址代码表详情
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeAddresscodeGetResult AlibabaTradeAddresscodeGet(AlibabaTradeAddresscodeGetParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaTradeAddresscodeGetResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	 /**
	  * 获取交易地址的下一级信息
	  * @param listParam
	  * @param accessToken
	  * @return
	  */
	public AlibabaTradeAddresscodeGetchildResult AlibabaTradeAddresscodeGetchild(AlibabaTradeAddresscodeGetchildParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaTradeAddresscodeGetchildResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 退款单列表查询-分页-卖家视角
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeRefundQueryOrderRefundListResult AlibabaTradeRefundQueryOrderRefundList(AlibabaTradeRefundQueryOrderRefundListParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaTradeRefundQueryOrderRefundListResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 获得退款单详情-卖家视角
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeRefundOpQueryOrderRefundResult AlibabaTradeRefundOpQueryOrderRefund(AlibabaTradeRefundOpQueryOrderRefundParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaTradeRefundOpQueryOrderRefundResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 退款单操作-卖家同意退货
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeRefundOpAgreeReturnGoodsResult AlibabaTradeRefundOpAgreeReturnGoods(AlibabaTradeRefundOpAgreeReturnGoodsParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaTradeRefundOpAgreeReturnGoodsResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 根据订单号实时查询退款单
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeRefundOpQueryBatchRefundByOrderIdAndStatusResult AlibabaTradeRefundOpQueryBatchRefundByOrderIdAndStatus(AlibabaTradeRefundOpQueryBatchRefundByOrderIdAndStatusParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaTradeRefundOpQueryBatchRefundByOrderIdAndStatusResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 获取省份编码信息
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AreaCodeGetResult AreaCodeGet(AreaCodeGetParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AreaCodeGetResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 延迟订单确认时间-卖家操作
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeOrderPostponeConfirmTimeResult AlibabaTradeOrderPostponeConfirmTime(AlibabaTradeOrderPostponeConfirmTimeParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaTradeOrderPostponeConfirmTimeResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 发票信息获取
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaInvoiceGetResult  AlibabaInvoiceGet(AlibabaInvoiceGetParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);
		AlibabaInvoiceGetResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
































	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
