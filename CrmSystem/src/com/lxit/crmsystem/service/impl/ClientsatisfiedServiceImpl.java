package com.lxit.crmsystem.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.crmsystem.dao.ClientsatisfiedDao;
import com.lxit.crmsystem.entity.Clientsatisfied;
import com.lxit.crmsystem.service.ClientsatisfiedService;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.vo.ClientDevelopVo;
import com.lxit.crmsystem.vo.ClientsatisfiedVo;

@Service("clientsatisfiedServiceImpl")
public class ClientsatisfiedServiceImpl implements ClientsatisfiedService {

	@Autowired
	ClientsatisfiedDao clientsatisfiedDao;
	
	@Override
	public int insert(Clientsatisfied clientsatisfied) {
		return clientsatisfiedDao.insert(clientsatisfied);
	}

	@Override
	public int delete(int csId) {
		return clientsatisfiedDao.delete(csId);
	}



	@Override
	public ClientsatisfiedVo queryClientsatisfiedById(int csId) {
		return clientsatisfiedDao.queryClientsatisfiedById(csId);
	}

	@Override
	public int update(Clientsatisfied clientsatisfied) {
		return clientsatisfiedDao.update(clientsatisfied);
	}

	@Override
	public Pager<ClientsatisfiedVo> query(int pageIndex, int pageSize, int csSid,String likeName) {
		Pager<ClientsatisfiedVo> page = new Pager<>();
		page.setPageIndex(pageIndex);
		page.setPageSize(pageSize);
		page.setSumCount(clientsatisfiedDao.getCount(csSid));
		Map<String, Object> map=new HashMap<>();
		map.put("pageIndex", (pageIndex-1) * pageSize);
		map.put("pageSize", pageSize);
		map.put("csSid", csSid);
		
		if(likeName!=null && likeName!=""){
			map.put("likeName","%"+likeName+"%");
		}else{
			map.put("likeName",likeName);
		}
		
		List<ClientsatisfiedVo> ClientsatisfiedVoList=clientsatisfiedDao.query(map);
		page.setData(ClientsatisfiedVoList);
		return page;
	}

	

}
