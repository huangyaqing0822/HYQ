package com.lxit.crmsystem.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.crmsystem.dao.MarketPmDao;
import com.lxit.crmsystem.entity.MarketPm;
import com.lxit.crmsystem.entity.Staff;
import com.lxit.crmsystem.service.MarketPmService;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.vo.MarketPmVo;

@Service
public class MarketPmServiceImpl implements MarketPmService {
	
	@Autowired
	private MarketPmDao marketPmDao;

	public MarketPmDao getMarketPmDao() {
		return marketPmDao;
	}

	public void setMarketPmDao(MarketPmDao marketPmDao) {
		this.marketPmDao = marketPmDao;
	}

	@Override
	public int addMarketPm(MarketPm pm) {
		return marketPmDao.addMarketPm(pm);
	}

	@Override
	public int delMarketPm(int pmId) {
		return marketPmDao.delMarketPm(pmId);
	}

	@Override
	public int updateMarketPm(MarketPm pm) {
		return marketPmDao.updateMarketPm(pm);
	}

	@Override
	public MarketPmVo getById(int pmId) {
		return marketPmDao.getById(pmId);
	}

	@Override
	public int getSumCount(Object[] date) {
		return marketPmDao.getSumCount(date);
	}

	@Override
	public Pager<MarketPmVo> selectByLike(int pageIndex, int pageSize, String name) {
		Pager<MarketPmVo> pager = new Pager<MarketPmVo>();
		pager.setPageIndex(pageIndex);
		pager.setPageSize(pageSize);
		Object [] obj = {name};
		pager.setSumCount(this.getSumCount(obj));
		
		Map<String, Object> map=new HashMap<>();
		map.put("pageIndex", (pageIndex - 1) * pageSize);
		map.put("pageSize", pageSize);
		map.put("name", name);
		
		List<MarketPmVo> list = marketPmDao.selectByLike(map);
		pager.setData(list);
		return pager;
	}

	@Override
	public List<Staff> listStaff(int bossId) {
		return marketPmDao.listStaff(bossId);
	}
 

}
