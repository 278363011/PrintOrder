package com.alibaba.partybusiness.utils;

import com.alibaba.ocean.rawsdk.ApiExecutor;

public class ApiExecutorUtils {
	/**
	 * 获取调用淘宝API的入口初始化类
	 * @param appkey 密码
	 * @param seckey 密钥
	 * @return 新的APIExecutor 实例
	 */
	public static ApiExecutor getApiExecutor(String appkey,String seckey) {
		return new ApiExecutor(appkey,seckey);
	}
	
	
}
