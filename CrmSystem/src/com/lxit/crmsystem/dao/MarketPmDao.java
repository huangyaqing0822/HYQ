package com.lxit.crmsystem.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crmsystem.entity.MarketPm;
import com.lxit.crmsystem.entity.Staff;
import com.lxit.crmsystem.vo.MarketPmVo;

@MapperScan
public interface MarketPmDao {
	
	    //查询下属
	    public List<Staff> listStaff(int bossId);
	   
	    //增加一条销售绩效
	    public int addMarketPm(MarketPm pm);
	    
	    //删除一条销售绩效
	    public int delMarketPm(int pmId);
	
	    //销售绩效修改
	    public int updateMarketPm(MarketPm pm);
	    
	    //根据id得到对象：查看
	    public MarketPmVo getById(int pmId);
	    
		//得到模糊查询的条数
		public int getSumCount(Object [] date);
		
		//模糊查询
		public List<MarketPmVo> selectByLike(Map<String, Object> map);

}
