package com.lxit.crmsystem.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.crmsystem.dao.CommonproblemDao;
import com.lxit.crmsystem.entity.Commonproblem;
import com.lxit.crmsystem.service.CommonproblemService;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.vo.ServeVo;
@Service("commonproblemService")
public class CommonproblemServiceImpl implements CommonproblemService {
	
	@Autowired
	CommonproblemDao commonproblemDao;
	@Override
	public Pager<Commonproblem> query(int pageIndex,int pageSize,String likeName,String likeType) {
		Pager<Commonproblem> page = new Pager<>();
		page.setPageIndex(pageIndex);
		page.setPageSize(pageSize);
		Map<String, Object> map=new HashMap<>();
		map.put("pageIndex", (pageIndex - 1) * pageSize);
		map.put("pageSize", pageSize);
		if(likeName!=null && likeName!=""){
			map.put("likeName", "%"+likeName+"%");
		}else{
			map.put("likeName", likeName);
		}
		if(likeType!=null && likeType!=""){
			map.put("likeType", Integer.parseInt(likeType));
		}else{
			map.put("likeType", 0);
		}
		
		page.setSumCount(commonproblemDao.getCount(map));
		List<Commonproblem> commList=commonproblemDao.query(map);
		page.setData(commList);
		return page;
	}

	@Override
	public int insert(Commonproblem comm) {
		return commonproblemDao.insert(comm);
	}

	@Override
	public int delete(int commId) {
		return commonproblemDao.delete(commId);
	}

	@Override
	public int update(Commonproblem comm) {
		return commonproblemDao.update(comm);
	}

	@Override
	public Commonproblem queryById(int commId) {
		return commonproblemDao.queryById(commId);
	}

}
