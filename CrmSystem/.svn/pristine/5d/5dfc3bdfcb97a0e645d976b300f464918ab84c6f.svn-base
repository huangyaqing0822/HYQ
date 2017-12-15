package com.lxit.crmsystem.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.crmsystem.dao.BaseInfoDao;
import com.lxit.crmsystem.entity.BaseInfo;
import com.lxit.crmsystem.service.BaseInfoService;

@Service("baseInfoService")
public class BaseInfoServiceImpl implements BaseInfoService{
	
	@Autowired
	BaseInfoDao baseInfoDao;
	
	@Override
	public boolean insertBaseInfo(BaseInfo baseInfo) {
		return baseInfoDao.insertBaseInfo(baseInfo)>0?true:false;
	}
	@Override
	public boolean updateBaseInfo(BaseInfo baseInfo) {
		return baseInfoDao.updateBaseInfo(baseInfo)>0?true:false;
	}
	@Override
	public boolean deleteBaseInfo(int baseInfoId) {
		return baseInfoDao.deleteBaseInfo(baseInfoId)>0?true:false;
	}
	@Override
	public BaseInfo selectBaseInfoId(int baseInfoId) {
		return baseInfoDao.selectBaseInfoId(baseInfoId);
	}
	@Override
	public List<BaseInfo> selectBaseInfo(Map<String, Object> map) {
		return baseInfoDao.selectBaseInfo(map);
	}
	@Override
	public int baseInfoCount(Map<String, Object> map) {
		return baseInfoDao.baseInfoCount(map);
	}

}
