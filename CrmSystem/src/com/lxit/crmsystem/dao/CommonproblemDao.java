package com.lxit.crmsystem.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crmsystem.entity.Commonproblem;

@MapperScan
public interface CommonproblemDao {
	public List<Commonproblem> query(Map<String, Object> map);
	public Commonproblem queryById(int commId);
	public int getCount(Map<String, Object> map);
	public int insert(Commonproblem comm);
	public int delete(int commId);
	public int update(Commonproblem comm);
}
