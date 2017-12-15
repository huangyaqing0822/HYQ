package com.lxit.crmsystem.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lxit.crmsystem.dao.ServeDao;
import com.lxit.crmsystem.entity.Serve;
import com.lxit.crmsystem.service.ServeService;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.vo.ServeVo;

@Service("serveService")
public class ServeServiceImpl implements ServeService {
	@Autowired
	ServeDao serveDao;

	@Override
	public int add(Serve serve) {
		return serveDao.add(serve);
	}

	@Override
	public int delete(int serveId) {
		return serveDao.delete(serveId);
	}

	@Override
	public int update(Serve serve) {
		return serveDao.update(serve);
	}

	@Override
	public Pager<ServeVo> query(int pageIndex,int pageSize,int manageName,String flag,Integer departmentId,String likeName,String likeType,String likeState) {
		Pager<ServeVo> page = new Pager<>();
		page.setPageIndex(pageIndex);
		page.setPageSize(pageSize);
		Map<String, Object> map=new HashMap<>();
		map.put("pageIndex", (pageIndex - 1) * pageSize);
		map.put("pageSize", pageSize);
		map.put("manageName", manageName);
		map.put("flag", flag);
		map.put("departmentId", departmentId);
		if(likeName!=null && likeName!=""){
			map.put("likeName","%"+likeName+"%");
		}else{
			map.put("likeName",likeName);
		}
		if(likeType!=null && likeType!=""){
			map.put("likeType",Integer.parseInt(likeType));
		}else{
			map.put("likeType",0);
		}
		if(likeState!=null && likeState!=""){
			map.put("likeState",Integer.parseInt(likeState));
		}else{
			map.put("likeState",0);
		}
		page.setSumCount(serveDao.getCount(map));
		List<ServeVo> ServeList=serveDao.query(map);
		page.setData(ServeList);
		return page;
	}

	@Override
	public ServeVo queryOne(int serveId) {
		return serveDao.queryOne(serveId);
	}

	@Override
	public int updateState(Map<String, Object> map) {
		return serveDao.updateState(map);
	}

	@Override
	public int updateHandle(Serve serve) {
		return serveDao.updateHandle(serve);
	}

	

}
