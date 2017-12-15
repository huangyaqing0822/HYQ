package com.lxit.crmsystem.service;

import java.util.List;
import java.util.Map;

import com.lxit.crmsystem.entity.BaseInfo;

public interface BaseInfoService {
	public List<BaseInfo> selectBaseInfo(Map<String, Object>map);
	public int baseInfoCount(Map<String, Object>map);
	/**
	 * 增加
	 * @param baseInfo
	 * @return
	 */
	boolean insertBaseInfo(BaseInfo baseInfo);
	
	/**
	 * 修改
	 * @param baseInfo
	 * @return
	 */
	boolean updateBaseInfo(BaseInfo baseInfo);
	
	/**
	 * 删除
	 * @param baseInfoId
	 * @return
	 */
	boolean deleteBaseInfo(int baseInfoId);
	
	public BaseInfo selectBaseInfoId(int baseInfoId);
}
