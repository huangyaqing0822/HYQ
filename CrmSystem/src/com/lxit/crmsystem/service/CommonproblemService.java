package com.lxit.crmsystem.service;

import java.util.List;

import com.lxit.crmsystem.entity.Commonproblem;
import com.lxit.crmsystem.util.Pager;

public interface CommonproblemService {
	public Pager<Commonproblem>query(int pageIndex,int pageSize,String likeName,String likeType);
	public Commonproblem queryById(int commId);
	public int insert(Commonproblem comm);
	public int delete(int commId);
	public int update(Commonproblem comm);
}
