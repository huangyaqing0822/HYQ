package com.lxit.crmsystem.service;

import java.util.List;
import java.util.Map;

import com.lxit.crmsystem.vo.HistogramOneVo;

/**
 * 统计业务层接口
 * @author Administrator
 *
 */
public interface ViewService {
	/**
	 * 业务：客户构成查询
	 * @return
	 */
	public List<HistogramOneVo> histogramone(int state,int month);
	
}
