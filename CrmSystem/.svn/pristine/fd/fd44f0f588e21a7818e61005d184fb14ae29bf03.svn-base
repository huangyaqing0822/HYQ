package com.lxit.crmsystem.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.crmsystem.dao.ClientLovingDao;
import com.lxit.crmsystem.entity.ClientLoving;
import com.lxit.crmsystem.service.ClientLovingService;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.vo.ClientLovingVo;
import com.lxit.crmsystem.vo.Clients;

@Service("clientLovingServiceImpl")
public class ClientLovingServiceImpl implements ClientLovingService {

	@Autowired
	ClientLovingDao clientLovingDao;
	
	@Override
	public int insert(ClientLoving clientLoving) {
		return clientLovingDao.insert(clientLoving);
	}

	@Override
	public int delete(int clId) {
		return clientLovingDao.delete(clId);
	}

	@Override
	public ClientLovingVo queryClientLovingById(int clId) {
		return clientLovingDao.queryClientLovingById(clId);
	}

	@Override
	public int update(ClientLoving clientLoving) {
		return clientLovingDao.update(clientLoving);
	}
 
	@Override
	public Pager<ClientLovingVo> query(int pageIndex, int pageSize, int clId,String likeName) {
		Pager<ClientLovingVo> page = new Pager<>();
		page.setPageIndex(pageIndex);
		page.setPageSize(pageSize);
		page.setSumCount(clientLovingDao.getCount(clId));
		Map<String, Object> map=new HashMap<>();
		map.put("pageIndex", (pageIndex - 1) * pageSize);
		map.put("pageSize", pageSize);
		map.put("clId", clId);
		
		if(likeName!=null && likeName!=""){
			map.put("likeName","%"+likeName+"%");
		}else{
			map.put("likeName",likeName);
		}
		
		List<ClientLovingVo> ClientLovingVoList=clientLovingDao.query(map);
		page.setData(ClientLovingVoList);
		return page;
	}

}
