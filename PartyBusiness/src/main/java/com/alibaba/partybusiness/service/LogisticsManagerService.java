package com.alibaba.partybusiness.service;

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

/**
 * 物流管理服务
 * @author zzq
 *
 */
public interface LogisticsManagerService {
		
		/**
		 * 物流发货-自己联系物流发货
		 * @param listParam
		 * @param accessToken
		 * @return
		 */
		public AlibabaLogisticsOpDeliverySendOrderOfflineResult AlibabaLogisticsOpDeliverySendOrderOffline(AlibabaLogisticsOpDeliverySendOrderOfflineParam listParam,String accessToken);
		/**
		 * 获取交易订单的物流跟踪信息-卖家视角
		 * @param listParam
		 * @param accessToken
		 * @return
		 */
		public AlibabaTradeGetLogisticsTraceInfoSellerViewResult AlibabaTradeGetLogisticsTraceInfoSellerView(AlibabaTradeGetLogisticsTraceInfoSellerViewParam listParam,String accessToken);
		/**
		 * 获取订单的物流信息-卖家视角
		 * @param listParam
		 * @param accessToken
		 * @return
		 */
		public AlibabaTradeGetLogisticsInfosSellerViewResult AlibabaTradeGetLogisticsInfosSellerView(AlibabaTradeGetLogisticsInfosSellerViewParam listParam,String accessToken);
		/**
		 * 创建我的运费模板
		 * @param listParam
		 * @param accessToken
		 * @return
		 */
		public AlibabaLogisticsMyFreightTemplateCreateResult AlibabaLogisticsMyFreightTemplateCreate(AlibabaLogisticsMyFreightTemplateCreateParam listParam,String accessToken);
		/**
		 * 修改我的运费模板
		 * @param listParam
		 * @param accessToken
		 * @return
		 */
		public AlibabaLogisticsMyFreightTemplateUpdateResult AlibabaLogisticsMyFreightTemplateUpdate(AlibabaLogisticsMyFreightTemplateUpdateParam listParam,String accessToken);
		/**
		 * 获取卖家的物流模板
		 * @param listParam
		 * @param accessToken
		 * @return
		 */
		public AlibabaLogisticsMyFreightTemplateListGetResult  AlibabaLogisticsMyFreightTemplateListGet(AlibabaLogisticsMyFreightTemplateListGetParam listParam,String accessToken) ;
		/**
		 * 获取所有物流公司列表
		 * @param listParam
		 * @param accessToken
		 * @return
		 */
		public AlibabaLogisticsOpQueryLogisticCompanyListResult AlibabaLogisticsOpQueryLogisticCompanyList(AlibabaLogisticsOpQueryLogisticCompanyListParam listParam,String accessToken);
		/**
		 * 我的发货地址
		 * @param listParam
		 * @param accessToken
		 * @return
		 */
		public AlibabaLogisticsMySendGoodsAddressListGetResult AlibabaLogisticsMySendGoodsAddressListGet(AlibabaLogisticsMySendGoodsAddressListGetParam listParam,String accessToken);
}
