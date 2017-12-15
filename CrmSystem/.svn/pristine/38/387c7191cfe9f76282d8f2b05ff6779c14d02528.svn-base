package com.lxit.crmsystem.service;

import java.util.List;
import java.util.Map;

import com.lxit.crmsystem.entity.MarketForecast;
import com.lxit.crmsystem.entity.MarketPm;
import com.lxit.crmsystem.entity.Staff;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.vo.MarketPmVo;

public interface MarketPmService {
	 

	    //查询下属
	    public List<Staff> listStaff(int bossId);
	   
	    //增加一条销售绩效
	    public int addMarketPm(MarketPm pm);
	    
	    //删除一条销售绩效
	    public int delMarketPm(int pmId);
	
	    //销售绩效修改
	    public int updateMarketPm(MarketPm pm);
	    
	    //根据id得到对象:查看
	    public MarketPmVo getById(int pmId);
	    
		//得到模糊查询的条数
		public int getSumCount(Object [] date);
				
		//模糊查询
		public Pager<MarketPmVo> selectByLike(int pageIndex,int pageSize,String name);

}
