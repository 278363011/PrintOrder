package com.alibaba.partybusiness.service;

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
public interface OrderManagerService {
	
	/**
	 * 订单列表查看(卖家视角)
	 * @param listParam 入参属性
	 * @param accessToken token验证
	 * @param bizTypes
	 * @return   
	 */
	public AlibabaTradeGetSellerOrderListResult alibabaTradeGetSellerOrderList(AlibabaTradeGetSellerOrderListParam listParam,
			String accessToken) ;
	/**
	 * 获取订单详情
	 * @param listParam 入参属性
	 * @param accessToken token验证
	 * @return
	 */
	public AlibabaTradeGetSellerViewResult  alibabaTradeGetSellerView(AlibabaTradeGetSellerViewParam listParam,String accessToken) ;
	
	/**
	 * 快速创建1688订单
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeFastCreateOrderResult alibabaTradeFastCreateOrder(AlibabaTradeFastCreateOrderParam listParam,String accessToken) ;
	/**
	 * 取消交易
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeCancelResult alibabaTradeCancel(AlibabaTradeCancelParam listParam,String accessToken) ;
	/**
	 * 修改订单价格
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	
	public TradeOrderModifyOrderPriceResult tradeOrderModifyOrderPrice(TradeOrderModifyOrderPriceParam listParam,String accessToken) ;
	/**
	 * 批量提交订单评价
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public TradeOrderBatchRateResult tradeOrderBatchRate(TradeOrderBatchRateParam listParam,String accessToken) ;
	
	/**
	 * 订单增加备注
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaOrderMemoAddResult alibabaOrderMemoAdd(AlibabaOrderMemoAddParam listParam,String accessToken) ;
	/**
	 * 查询卖家混批设置
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeOpQueryMarketingMixConfigResult AlibabaTradeOpQueryMarketingMixConfig(AlibabaTradeOpQueryMarketingMixConfigParam listParam,String accessToken);
	/**
	 * 获取交易地址代码表详情
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeAddresscodeGetResult AlibabaTradeAddresscodeGet(AlibabaTradeAddresscodeGetParam listParam,String accessToken) ;
	 /**
	  * 获取交易地址的下一级信息
	  * @param listParam
	  * @param accessToken
	  * @return
	  */
	public AlibabaTradeAddresscodeGetchildResult AlibabaTradeAddresscodeGetchild(AlibabaTradeAddresscodeGetchildParam listParam,String accessToken) ;
	/**
	 * 退款单列表查询-分页-卖家视角
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeRefundQueryOrderRefundListResult AlibabaTradeRefundQueryOrderRefundList(AlibabaTradeRefundQueryOrderRefundListParam listParam,String accessToken) ;
	/**
	 * 获得退款单详情-卖家视角
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeRefundOpQueryOrderRefundResult AlibabaTradeRefundOpQueryOrderRefund(AlibabaTradeRefundOpQueryOrderRefundParam listParam,String accessToken) ;
	/**
	 * 退款单操作-卖家同意退货
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeRefundOpAgreeReturnGoodsResult AlibabaTradeRefundOpAgreeReturnGoods(AlibabaTradeRefundOpAgreeReturnGoodsParam listParam,String accessToken) ;
	/**
	 * 根据订单号实时查询退款单
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeRefundOpQueryBatchRefundByOrderIdAndStatusResult AlibabaTradeRefundOpQueryBatchRefundByOrderIdAndStatus(AlibabaTradeRefundOpQueryBatchRefundByOrderIdAndStatusParam listParam,String accessToken) ;
	/**
	 * 获取省份编码信息
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AreaCodeGetResult AreaCodeGet(AreaCodeGetParam listParam,String accessToken) ;
	/**
	 * 延迟订单确认时间-卖家操作
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaTradeOrderPostponeConfirmTimeResult AlibabaTradeOrderPostponeConfirmTime(AlibabaTradeOrderPostponeConfirmTimeParam listParam,String accessToken);
	/**
	 * 发票信息获取
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaInvoiceGetResult  AlibabaInvoiceGet(AlibabaInvoiceGetParam listParam,String accessToken) ;

}
