package com.lxit.crmsystem.service;

import java.util.List;
import java.util.Map;

import com.lxit.crmsystem.entity.DataDictionary;

public interface DataDictionaryService {
	public List<DataDictionary> query(String dataCode);
	
	public List<DataDictionary> selectData(Map<String, Object>map);
	public int selectCountdata(Map<String, Object>map);
	
	
	boolean insertDataDictionary(DataDictionary dataDictionary);
	
	boolean deleteDataDictionary(int dataId);
	
	
	public DataDictionary dataDictionId(int dataId);
	
	/**
	 * 修改
	 * @param dataDictionary
	 * @return
	 */
	boolean updatDataDictionary(DataDictionary dataDictionary);
}
