package com.lxit.crmsystem.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crmsystem.entity.DataDictionary;
import com.lxit.crmsystem.entity.Department;
import com.lxit.crmsystem.entity.MarketForecast;
import com.lxit.crmsystem.vo.MarketForecastVo;

@MapperScan
public interface MarketForecastDao {
	
	   //增加一条销售预测记录
	   public int addMarketForecast(MarketForecast mark);
	
	   //根据id得到这条对象
	    public MarketForecastVo getById(int forecastId);
	
	    //得到模糊查询的条数
		public int getSumCount(Object [] date);
		
		//模糊查询
		public List<MarketForecast> selectByLike(Map<String, Object> map);
	
		//数据字典查询类型
	    public List<DataDictionary> queryDateCode();

}
