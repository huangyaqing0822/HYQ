package com.lxit.crmsystem.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crmsystem.entity.BaseInfo;
@MapperScan
public interface BaseInfoDao {
	/**
	 * 查询所以的数据
	 * @return
	 */
	public List<BaseInfo> selectBaseInfo(Map<String, Object>map);
	
	public int baseInfoCount(Map<String, Object>map);
	/**
	 * 增加
	 * @param baseInfo
	 * @return
	 */
	int insertBaseInfo(BaseInfo baseInfo);
	
	/**
	 * 修改
	 * @param baseInfo
	 * @return
	 */
	int updateBaseInfo(BaseInfo baseInfo);
	
	/**
	 * 删除
	 * @param baseInfoId
	 * @return
	 */
	int deleteBaseInfo(int baseInfoId);
	
	public BaseInfo selectBaseInfoId(int baseInfoId);
}
