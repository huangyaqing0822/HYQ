package com.lxit.crmsystem.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crmsystem.vo.HistogramOneVo;

@MapperScan
public interface ViewDao {
	/**
	 * 业务：客户构成查询
	 * @return
	 */
	public List<HistogramOneVo> histogramone(Map<String,Object> hashMap);
	
	/**
	 * 客户缺失查询
	 * @param hashMap
	 * @return
	 */
	public List<HistogramOneVo> histogramtwo(Map<String,Object> hashMap);
	/**
	 * 服务查询查询
	 * @param hashMap
	 * @return
	 */
	public List<HistogramOneVo> histogramthree(Map<String,Object> hashMap);
	/**
	 * 服务贡献查询
	 * @param hashMap
	 * @return
	 */
	public List<HistogramOneVo> histogramfour(Map<String,Object> hashMap);
	
	/**
	 * 销售分析
	 * @param hashMap
	 * @return
	 */
	public List<HistogramOneVo> histogramfive(Map<String,Object> hashMap);
	
	
	/**
	 * 销售分析
	 * @param hashMap
	 * @return
	 */
	public List<HistogramOneVo> histogramsix(Map<String,Object> hashMap);
}
