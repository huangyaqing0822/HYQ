package com.lxit.crmsystem.service;

import java.util.Map;

import com.lxit.crmsystem.entity.Serve;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.vo.ServeVo;

public interface ServeService {
	public int add(Serve serve);
	public int delete(int serveId);
	public int update(Serve serve);
	public int updateState(Map<String, Object> map);
	public Pager<ServeVo> query(int pageIndex,int pageSize,int manageName,String flag,Integer departmentId,String likeName,String likeType,String likeState);
	public ServeVo queryOne(int serveId);
	public int updateHandle(Serve serve);

}
