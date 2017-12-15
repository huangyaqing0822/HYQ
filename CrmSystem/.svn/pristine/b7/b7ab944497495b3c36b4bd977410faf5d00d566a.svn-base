package com.lxit.crmsystem.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.crmsystem.dao.LinkmanDao;
import com.lxit.crmsystem.entity.LinkMan;
import com.lxit.crmsystem.service.LinkmanService;
import com.lxit.crmsystem.util.Pager;

@Service
public class LinkmanServiceImpl implements LinkmanService {

	@Autowired
	private LinkmanDao linkmanDao;

	public LinkmanDao getLinkmanDao() {
		return linkmanDao;
	}

	public void setLinkmanDao(LinkmanDao linkmanDao) {
		this.linkmanDao = linkmanDao;
	}

	@Override
	public int addLinkman(LinkMan linkman) {
		return linkmanDao.addLinkman(linkman);
	}

	@Override
	public int delLineman(int linkId) {
		return linkmanDao.delLineman(linkId);
	}

	@Override
	public int updateLinkman(LinkMan linkman) {
		return linkmanDao.updateLinkman(linkman);
	}

	@Override
	public LinkMan getById(int linkId) {
		return linkmanDao.getById(linkId);
	}

	@Override
	public int getSumCount(Object[] name) {
		return linkmanDao.getSumCount(name);
	}

	@Override
	public Pager<LinkMan> selectByLike(int pageIndex, int pageSize, String name) {
		Pager<LinkMan> pager = new Pager<LinkMan>();
		pager.setPageIndex(pageIndex);
		pager.setPageSize(pageSize);
		Object [] obj = {name};
		pager.setSumCount(this.getSumCount(obj));
		
		Map<String, Object> map=new HashMap<>();
		map.put("pageIndex", (pageIndex - 1) * pageSize);
		map.put("pageSize", pageSize);
		map.put("name", name);
		
		List<LinkMan> list = linkmanDao.selectByLike(map);
		pager.setData(list);
		return pager;
	}
}
