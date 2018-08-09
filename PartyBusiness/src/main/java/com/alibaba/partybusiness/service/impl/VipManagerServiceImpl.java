package com.alibaba.partybusiness.service.impl;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.alibaba.account.param.AlibabaAccountBasicParam;
import com.alibaba.account.param.AlibabaAccountBasicResult;
import com.alibaba.ocean.rawsdk.ApiExecutor;
import com.alibaba.partybusiness.service.VipManagerService;
import com.alibaba.partybusiness.utils.ApiExecutorUtils;

import cn.alibaba.open.param.ConvertLoginIdsByMemberIdsParam;
import cn.alibaba.open.param.ConvertLoginIdsByMemberIdsResult;
import cn.alibaba.open.param.ConvertMemberIdsByLoginIdsParam;
import cn.alibaba.open.param.ConvertMemberIdsByLoginIdsResult;
import cn.alibaba.open.param.CreditInfoGetParam;
import cn.alibaba.open.param.CreditInfoGetResult;
import cn.alibaba.open.param.MemberGetParam;
import cn.alibaba.open.param.MemberGetResult;

/**
 * 会员管理服务
 * @author zzq
 *
 */
@Service
public class VipManagerServiceImpl implements VipManagerService{
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
	 * 获取单个会员信息
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public MemberGetResult MemberGet(MemberGetParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		MemberGetResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 获取会员诚信信息
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public CreditInfoGetResult  CreditInfoGet(CreditInfoGetParam listParam, String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		CreditInfoGetResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 批量转换memberid to loginid
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public ConvertLoginIdsByMemberIdsResult ConvertLoginIdsByMemberIds(ConvertLoginIdsByMemberIdsParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		ConvertLoginIdsByMemberIdsResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 批量转换loginid 到 memberid
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public ConvertMemberIdsByLoginIdsResult ConvertMemberIdsByLoginIds(ConvertMemberIdsByLoginIdsParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		ConvertMemberIdsByLoginIdsResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	/**
	 * 获取授权用户的基本信息
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaAccountBasicResult AlibabaAccountBasic(AlibabaAccountBasicParam listParam,String accessToken) {
		ApiExecutor apiExecutor =ApiExecutorUtils.getApiExecutor(appkey, seckey);			
		AlibabaAccountBasicResult result=apiExecutor.execute(listParam,accessToken);
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
