package com.lxit.crmsystem.service;

import java.util.List;
import java.util.Map;

import com.lxit.crmsystem.vo.ViewIdentType;
import com.lxit.crmsystem.vo.ViewIndentSlender;

public interface IndentService {
	public Map<String, Object> selectIndent(Map<String, Object> map);
	
	public Map<String, Object> selectProduct(Map<String, Object> map);
	
	public int getCount(Map<String, Object> map);
	
	public int insertIndent(Map<String, Object> map);
	
	public Map<String, Object> inquery(Map<String, Object> map);
	
	public List<ViewIdentType> inqueryTy();
	
	public ViewIndentSlender slenderInfo(int id);
	
	public Map<String, Object> shwoObjectStatistics(Map<String, Object> map);
}
