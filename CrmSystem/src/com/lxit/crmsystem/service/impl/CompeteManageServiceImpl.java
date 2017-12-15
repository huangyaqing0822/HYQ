package com.lxit.crmsystem.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.crmsystem.dao.CompeteManageDao;
import com.lxit.crmsystem.entity.CompeteManage;
import com.lxit.crmsystem.entity.DataDictionary;
import com.lxit.crmsystem.service.CompeteManageService;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.vo.CompeteManageVo;

@Service
public class CompeteManageServiceImpl implements CompeteManageService {

	@Autowired
	private CompeteManageDao competeManageDao;
	
	@Override
	public List<DataDictionary> queryState() {
		return competeManageDao.queryState();
	}

	@Override
	public List<DataDictionary> queryType() {
		return competeManageDao.queryType();
	}

	@Override
	public int addCompete(CompeteManage compete) {
		return competeManageDao.addCompete(compete);
	}

	@Override
	public CompeteManageVo getById(int competeId) {
		return competeManageDao.getById(competeId);
	}

	@Override
	public int getSumCount(Object[] obj) {
		return competeManageDao.getSumCount(obj);
	}

	@Override
	public Pager<CompeteManageVo> selectByLike(int pageIndex, int pageSize, String date) {
		Pager<CompeteManageVo> pager = new Pager<CompeteManageVo>();
		pager.setPageIndex(pageIndex);
		pager.setPageSize(pageSize);
		Object [] obj = {date};
		pager.setSumCount(this.getSumCount(obj));
		
		Map<String, Object> map=new HashMap<>();
		map.put("pageIndex", (pageIndex - 1) * pageSize);
		map.put("pageSize", pageSize);
		map.put("date", date);
		
		List<CompeteManageVo> list = competeManageDao.selectByLike(map);
		pager.setData(list);
		return pager;
	}

	public CompeteManageDao getCompeteManageDao() {
		return competeManageDao;
	}

	public void setCompeteManaao(CompeteManageDao competeManageDao) {
		this.competeManageDao = competeManageDao;
	}

	@Override
	public int updateState(int competSid) {
		return competeManageDao.updateState(competSid);
	}

	@Override
	public int updateCompete(CompeteManage compete) {
		return competeManageDao.updateCompete(compete);
	}

 

}
