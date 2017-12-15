package com.lxit.crmsystem.service;

import java.util.List;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crmsystem.entity.CompeteManage;
import com.lxit.crmsystem.entity.DataDictionary;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.vo.CompeteManageVo;

@MapperScan
public interface CompeteManageService {
	
	
	//查询归档状态
	public List<DataDictionary> queryState();
	
	//查询竞争分析类型
	public List<DataDictionary> queryType();
	
	//增加竞争分析记录
	public int addCompete(CompeteManage compete);
	
	//归档:改变状态
	public int updateState(int competSid);
	
	//查看
	public CompeteManageVo getById(int competeId);
	
	//修改
	public int updateCompete(CompeteManage compete);
	
	//计算条数
	public int getSumCount(Object [] obj);
	
	//分页
	public Pager<CompeteManageVo> selectByLike(int pageIndex,int pageSize,String date);

}
