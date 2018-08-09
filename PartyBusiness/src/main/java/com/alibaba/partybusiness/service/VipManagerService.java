package com.alibaba.partybusiness.service;

import com.alibaba.account.param.AlibabaAccountBasicParam;
import com.alibaba.account.param.AlibabaAccountBasicResult;

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
public interface VipManagerService {
	
	/**
	 * 获取单个会员信息
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public MemberGetResult MemberGet(MemberGetParam listParam,String accessToken) ;
	/**
	 * 获取会员诚信信息
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public CreditInfoGetResult  CreditInfoGet(CreditInfoGetParam listParam, String accessToken) ;
	/**
	 * 批量转换memberid to loginid
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public ConvertLoginIdsByMemberIdsResult ConvertLoginIdsByMemberIds(ConvertLoginIdsByMemberIdsParam listParam,String accessToken) ;
	/**
	 * 批量转换loginid 到 memberid
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public ConvertMemberIdsByLoginIdsResult ConvertMemberIdsByLoginIds(ConvertMemberIdsByLoginIdsParam listParam,String accessToken);
	/**
	 * 获取授权用户的基本信息
	 * @param listParam
	 * @param accessToken
	 * @return
	 */
	public AlibabaAccountBasicResult AlibabaAccountBasic(AlibabaAccountBasicParam listParam,String accessToken) ;
}
