package com.lxit.crmsystem.service;

import java.util.List;

import com.lxit.crmsystem.entity.DataDictionary;
import com.lxit.crmsystem.entity.Hap;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.vo.HapVo;

public interface HapService {
	
	//查询机会类型
	public List<DataDictionary> queryHapTypeValue();
	
	//添加机会
	public int addHap(Hap hap);
	
	//根据id得到对象：查看
	public HapVo getById(int hapId);
	
	//机会修改
	public int updateHap(Hap hap);
	
	//得到模糊查询的条数
	public int getSumCount(Object [] date);
	
	//模糊查询
	public Pager<HapVo> selectByLike(int pageIndex,int pageSize,String name);
	
	
	
	
	
	
	
	
	
	
	
}
