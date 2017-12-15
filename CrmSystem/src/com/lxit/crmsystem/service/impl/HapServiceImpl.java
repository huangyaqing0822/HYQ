package com.lxit.crmsystem.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.crmsystem.dao.HapDao;
import com.lxit.crmsystem.entity.DataDictionary;
import com.lxit.crmsystem.entity.Hap;
import com.lxit.crmsystem.service.HapService;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.vo.HapVo;

@Service
public class HapServiceImpl implements HapService {
	
	@Autowired
    private	HapDao hapDao;

	@Override
	public List<DataDictionary> queryHapTypeValue() {
		return hapDao.queryHapTypeValue();
	}

	@Override
	public int addHap(Hap hap) {
		return hapDao.addHap(hap);
	}

	@Override
	public HapVo getById(int hapId) {
		return hapDao.getById(hapId);
	}

	@Override
	public int updateHap(Hap hap) {
		return hapDao.updateHap(hap);
	}

	@Override
	public int getSumCount(Object[] date) {
		return hapDao.getSumCount(date);
	}

	@Override
	public Pager<HapVo> selectByLike(int pageIndex, int pageSize, String name) {
		Pager<HapVo> pager = new Pager<HapVo>();
		pager.setPageIndex(pageIndex);
		pager.setPageSize(pageSize);
		Object [] obj = {name};
		pager.setSumCount(this.getSumCount(obj));
		
		Map<String, Object> map=new HashMap<>();
		map.put("pageIndex", (pageIndex - 1) * pageSize);
		map.put("pageSize", pageSize);
		map.put("name", name);
		
		List<HapVo> list = hapDao.selectByLike(map);
		pager.setData(list);
		return pager;
	}

	public HapDao getHapDao() {
		return hapDao;
	}

	public void setHapDao(HapDao hapDao) {
		this.hapDao = hapDao;
	}

}
