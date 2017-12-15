package com.lxit.crmsystem.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crmsystem.entity.Market;
import com.lxit.crmsystem.vo.Markets;

@MapperScan
public interface MarketDao {
	
	//销售计划增加
	public int addMarket(Market market);
	
	//销售计划删除
	public int delMarket(int marketId);
	
	//销售计划修改
	public int updateMarket(Market market);
	
	//根据id查询对象
	public Market queryById(int marketId);
	
	//得到模糊查询的条数
	public int getSumCount(Object [] date);
	
	//模糊查询
	public List<Markets> selectByLike(Map<String, Object> map);
	
	public List<Market> listMarket();
	
	public int updateMarketStates(Market market);
}
