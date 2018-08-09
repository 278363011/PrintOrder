package com.alibaba.partybusiness.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alibaba.ocean.rawsdk.ApiExecutor;
import com.alibaba.partybusiness.service.CommdityManagerService;
import com.alibaba.partybusiness.utils.ApiExecutorUtils;
import com.alibaba.product.param.AlibabaCategoryAttributeGetParam;
import com.alibaba.product.param.AlibabaCategoryAttributeGetResult;
import com.alibaba.product.param.AlibabaCategoryGetParam;
import com.alibaba.product.param.AlibabaCategoryGetResult;
import com.alibaba.product.param.AlibabaCategoryGetSPUInfoParam;
import com.alibaba.product.param.AlibabaCategoryGetSPUInfoResult;
import com.alibaba.product.param.AlibabaCategorySearchByKeywordParam;
import com.alibaba.product.param.AlibabaCategorySearchByKeywordResult;
import com.alibaba.product.param.AlibabaCategorySearchSPUInfoParam;
import com.alibaba.product.param.AlibabaCategorySearchSPUInfoResult;
import com.alibaba.product.param.AlibabaProductAddParam;
import com.alibaba.product.param.AlibabaProductAddResult;
import com.alibaba.product.param.AlibabaProductDeleteParam;
import com.alibaba.product.param.AlibabaProductDeleteResult;
import com.alibaba.product.param.AlibabaProductEditParam;
import com.alibaba.product.param.AlibabaProductEditResult;
import com.alibaba.product.param.AlibabaProductExpireParam;
import com.alibaba.product.param.AlibabaProductExpireResult;
import com.alibaba.product.param.AlibabaProductGetByIdListParam;
import com.alibaba.product.param.AlibabaProductGetByIdListResult;
import com.alibaba.product.param.AlibabaProductGetListParam;
import com.alibaba.product.param.AlibabaProductGetListResult;
import com.alibaba.product.param.AlibabaProductGetParam;
import com.alibaba.product.param.AlibabaProductGetResult;
import com.alibaba.product.param.AlibabaProductIncrementModifyParam;
import com.alibaba.product.param.AlibabaProductIncrementModifyResult;
import com.alibaba.product.param.AlibabaProductListGetParam;
import com.alibaba.product.param.AlibabaProductListGetResult;
import com.alibaba.product.param.AlibabaProductModifyStockParam;
import com.alibaba.product.param.AlibabaProductModifyStockResult;
import com.alibaba.product.param.AlibabaProductRepostParam;
import com.alibaba.product.param.AlibabaProductRepostResult;
import com.alibaba.product.param.AlibabaProductRepublishParam;
import com.alibaba.product.param.AlibabaProductRepublishResult;
import com.alibaba.product.param.AlibabaUserCategoryListGetParam;
import com.alibaba.product.param.AlibabaUserCategoryListGetResult;
import com.alibaba.product.param.AlibabaUserDefineCategoryAddParam;
import com.alibaba.product.param.AlibabaUserDefineCategoryAddResult;
import com.alibaba.trade.param.AlibabaProductGetBySellerCargoNumberParam;
import com.alibaba.trade.param.AlibabaProductGetBySellerCargoNumberResult;

import cn.alibaba.open.param.CategoryGetSelfCatlistParam;
import cn.alibaba.open.param.CategoryGetSelfCatlistResult;
import cn.alibaba.open.param.CategoryLevelAttrGetParam;
import cn.alibaba.open.param.CategoryLevelAttrGetResult;
import cn.alibaba.open.param.OfferGroupHasOpenedParam;
import cn.alibaba.open.param.OfferGroupHasOpenedResult;
import cn.alibaba.open.param.OfferGroupSetParam;
import cn.alibaba.open.param.OfferGroupSetResult;
import cn.alibaba.open.param.UserCategoryGetOfferIdsParam;
import cn.alibaba.open.param.UserCategoryGetOfferIdsResult;
import cn.alibaba.open.param.UserCategoryOffersAddParam;
import cn.alibaba.open.param.UserCategoryOffersAddResult;
import cn.alibaba.open.param.UserCategoryOffersRemoveParam;
import cn.alibaba.open.param.UserCategoryOffersRemoveResult;

/**
 * 商品管理服务
 * @author zzq
 *
 */
@Service
public class CommdityManagerServiceImpl implements CommdityManagerService{
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
	 * 获取类目属性
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaCategoryAttributeGetResult AlibabaCategoryAttributeGet(AlibabaCategoryAttributeGetParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaCategoryAttributeGetResult result=apiExecutor.execute(listParam,accessToken);
		return result;
		
	}
	/**
	 * 获取标准化产品单元信息（1688）
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaCategoryGetSPUInfoResult AlibabaCategoryGetSPUInfo(AlibabaCategoryGetSPUInfoParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaCategoryGetSPUInfoResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 查询标准化产品单元信息列表
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaCategorySearchSPUInfoResult AlibabaCategorySearchSPUInfo(AlibabaCategorySearchSPUInfoParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaCategorySearchSPUInfoResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 用户自定义类目创建
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaUserDefineCategoryAddResult alibabaUserDefineCategoryAdd(AlibabaUserDefineCategoryAddParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaUserDefineCategoryAddResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 获取类目属性层级级联信息
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public CategoryLevelAttrGetResult CategoryLevelAttrGetresult(CategoryLevelAttrGetParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		CategoryLevelAttrGetResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 发布商品
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaProductAddResult AlibabaProductAdd(AlibabaProductAddParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaProductAddResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 删除商品
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaProductDeleteResult AlibabaProductDelete(AlibabaProductDeleteParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaProductDeleteResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 获取商品列表
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaProductGetListResult AlibabaProductGetList(AlibabaProductGetListParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaProductGetListResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 获取商品
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaProductGetResult AlibabaProductGet(AlibabaProductGetParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaProductGetResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 修改商品
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaProductEditResult AlibabaProductEdit(AlibabaProductEditParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaProductEditResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 增量修改商品信息
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaProductIncrementModifyResult AlibabaProductIncrementModify(AlibabaProductIncrementModifyParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaProductIncrementModifyResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 增量修改产品库存
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaProductModifyStockResult AlibabaProductModifyStock(AlibabaProductModifyStockParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaProductModifyStockResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 重发商品
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public  AlibabaProductRepostResult AlibabaProductRepost(AlibabaProductRepostParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaProductRepostResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 开关会员的自定义分类
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public OfferGroupSetResult OfferGroupSet(OfferGroupSetParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		OfferGroupSetResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 获取用户是否开启自定义分类
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public OfferGroupHasOpenedResult OfferGroupHasOpened(OfferGroupHasOpenedParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		OfferGroupHasOpenedResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 添加产品到自定义分类
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public UserCategoryOffersAddResult UserCategoryOffersAdd(UserCategoryOffersAddParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		UserCategoryOffersAddResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 移除产品的自定义分类
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public UserCategoryOffersRemoveResult UserCategoryOffersRemove(UserCategoryOffersRemoveParam listParam ,String accessToken){
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		UserCategoryOffersRemoveResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 获取会员自定义分类信息
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public CategoryGetSelfCatlistResult CategoryGetSelfCatlist(CategoryGetSelfCatlistParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		CategoryGetSelfCatlistResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 获取产品的自定义分类ID
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public UserCategoryGetOfferIdsResult UserCategoryGetOfferIds(UserCategoryGetOfferIdsParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		UserCategoryGetOfferIdsResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 根据类目ID查询类目
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaCategoryGetResult AlibabaCategoryGet(AlibabaCategoryGetParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaCategoryGetResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 商品转为过期
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaProductExpireResult AlibabaProductExpire(AlibabaProductExpireParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaProductExpireResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 根据商品ID列表获取商品（卖家）
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaProductGetByIdListResult AlibabaProductGetByIdList(AlibabaProductGetByIdListParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaProductGetByIdListResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 未上架商品重新上架
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaProductRepublishResult alibabaProductRepublish(AlibabaProductRepublishParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaProductRepublishResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 卖家查询商品列表
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaProductListGetResult AlibabaProductListGet(AlibabaProductListGetParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaProductListGetResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 根据卖家的货号或商品ID查找商品
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaProductGetBySellerCargoNumberResult AlibabaProductGetBySellerCargoNumber(AlibabaProductGetBySellerCargoNumberParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaProductGetBySellerCargoNumberResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 根据关键字搜索类目
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaCategorySearchByKeywordResult AlibabaCategorySearchByKeyword(AlibabaCategorySearchByKeywordParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaCategorySearchByKeywordResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 获取授权用户的商品自定义分类列表
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaUserCategoryListGetResult AlibabaUserCategoryListGet(AlibabaUserCategoryListGetParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaUserCategoryListGetResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
