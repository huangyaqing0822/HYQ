package com.lxit.crmsystem.dao;



import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crmsystem.entity.Serve;
import com.lxit.crmsystem.vo.ServeVo;
@MapperScan
public interface ServeDao {
	public int add(Serve serve);
	public int delete(int serveId);
	public int update(Serve serve);
	public int updateState(Map<String, Object> map);
	public List<ServeVo> query(Map<String, Object> map);
	public ServeVo queryOne(int serveId);
	public int getCount(Map<String, Object> map);
	public int updateHandle(Serve serve);

}
