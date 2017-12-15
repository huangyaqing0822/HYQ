package com.lxit.crmsystem.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crmsystem.entity.DataDictionary;
@MapperScan
public interface DataDictionaryDao {
	public List<DataDictionary> query(String dataCode);
	
	/**
	 * 查询所有
	 * @return
	 */
	public List<DataDictionary> selectData(Map<String, Object>map);
	
	/**
	 * 查询总条数
	 * @param map
	 * @return
	 */
	public int selectCountdata(Map<String, Object>map);
	
	/**
	 * 增加
	 * @param dataDictionary
	 * @return
	 */
	int insertDataDictionary(DataDictionary dataDictionary);
	
	/**
	 * 删除
	 * @param dataId
	 * @return
	 */
	int deleteDataDictionary(int dataId);
	
	/**
	 * 按照id查询
	 * @param dataId
	 * @return
	 */
	public DataDictionary dataDictionId(int dataId);
	
	/**
	 * 修改
	 * @param dataDictionary
	 * @return
	 */
	int updatDataDictionary(DataDictionary dataDictionary);
}
