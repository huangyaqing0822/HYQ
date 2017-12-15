package com.lxit.crmsystem.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.crmsystem.dao.DataDictionaryDao;
import com.lxit.crmsystem.entity.DataDictionary;
import com.lxit.crmsystem.service.DataDictionaryService;
@Service("DataDictionaryService")
public class DataDictionaryServiceImpl implements DataDictionaryService{
	@Autowired
	DataDictionaryDao dataDictionaryDao;

	@Override
	public List<DataDictionary> query(String dataCode) {
		return dataDictionaryDao.query(dataCode);
	}


	@Override
	public boolean insertDataDictionary(DataDictionary dataDictionary) {
		return dataDictionaryDao.insertDataDictionary(dataDictionary)>0?true:false;
	}

	@Override
	public boolean deleteDataDictionary(int dataId) {
		return dataDictionaryDao.deleteDataDictionary(dataId)>0?true:false;
	}

	@Override
	public DataDictionary dataDictionId(int dataId) {
		return dataDictionaryDao.dataDictionId(dataId);
	}

	@Override
	public boolean updatDataDictionary(DataDictionary dataDictionary) {
		return dataDictionaryDao.updatDataDictionary(dataDictionary)>0?true:false;
	}


	@Override
	public List<DataDictionary> selectData(Map<String, Object> map) {
		return dataDictionaryDao.selectData(map);
	}


	@Override
	public int selectCountdata(Map<String, Object> map) {
		return dataDictionaryDao.selectCountdata(map);
	}

	
	
}
