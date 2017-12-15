package com.lxit.crmsystem.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.crmsystem.dao.TreeDao;
import com.lxit.crmsystem.entity.Tree;
import com.lxit.crmsystem.service.TreeService;
@Service("treeService")
public class TreeServiceImpl implements TreeService{
	@Autowired
	TreeDao treeDao;
	@Override
	public List<Tree> querys(Map<String, Object> map) {
		
		return treeDao.querys(map);
	}

}
