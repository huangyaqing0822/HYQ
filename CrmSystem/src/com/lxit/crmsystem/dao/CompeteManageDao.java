package com.lxit.crmsystem.dao;

import java.util.List;
import java.util.Map;

import com.lxit.crmsystem.entity.CompeteManage;
import com.lxit.crmsystem.entity.DataDictionary;
import com.lxit.crmsystem.vo.CompeteManageVo;

public interface CompeteManageDao {
	
	//查询归档状态
	public List<DataDictionary> queryState();
	
	//查询竞争分析类型
	public List<DataDictionary> queryType();
	
	//归档：改变状态
	public int updateState(int competSid);
	
	//增加竞争分析记录
	public int addCompete(CompeteManage compete);
	
	//查看
	public CompeteManageVo getById(int competeId);
	
	//修改
	public int updateCompete(CompeteManage compete);
	
	//计算条数
	public int getSumCount(Object [] obj);
	
	//分页
	public List<CompeteManageVo> selectByLike(Map<String, Object> map);

}
