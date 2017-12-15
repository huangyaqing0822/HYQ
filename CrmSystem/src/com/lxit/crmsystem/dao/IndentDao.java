package com.lxit.crmsystem.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crmsystem.entity.CompanyProduct;
import com.lxit.crmsystem.entity.Indent;
import com.lxit.crmsystem.vo.ViewIdentType;
import com.lxit.crmsystem.vo.ViewIndent;
import com.lxit.crmsystem.vo.ViewIndentSlender;
import com.lxit.crmsystem.vo.ViewMonthStatistics;
import com.lxit.crmsystem.vo.ViewOnlyIndent;

@MapperScan
public interface IndentDao {
	/**
	 * 查询订单
	 * 
	 * @param map
	 * @return
	 */
	public List<ViewIndent> selectIndent(Map<String, Object> map);

	/**
	 * 查询所登录的角色所属级别
	 * 
	 * @param id
	 * @return
	 */
	public String selectLv(int id);

	/**
	 * 查询商品属性
	 * 
	 * @param map
	 * @return
	 */
	public List<CompanyProduct> selectProduct(Map<String, Object> map);

	/**
	 * 获取总条数
	 * 
	 * @param tableName
	 * @return
	 */
	public int getCount(Map<String, Object> map);

	/**
	 * 查询订单所对应的条数
	 * 
	 * @param map
	 * @return
	 */
	public int selectIndentCount(Map<String, Object> map);

	/**
	 * 添加订单
	 * 
	 * @param map
	 * @return
	 */
	public int insertIndent(Indent in);

	/**
	 * 添加订单关联表
	 * 
	 * @param map
	 * @return
	 */
	public int insertIndentto(Map<String, Object> map);

	/**
	 * 订单查询2
	 * 
	 * @param map
	 * @return
	 */
	public List<ViewOnlyIndent> inquery(Map<String, Object> map);

	/**
	 * 2 总条数
	 * 
	 * @param map
	 * @return
	 */
	public int inqueryCount(Map<String, Object> map);

	/**
	 * 查询订单类型
	 * 
	 * @param code
	 * @return
	 */
	public List<ViewIdentType> inqueryTy();

	/**
	 * 查询订单详细信息
	 * 
	 * @param id
	 * @return
	 */
	public ViewIndentSlender slenderIndent(int id);

	/**
	 * 根据年查询 每月的实际交易数据
	 */
	
	public ViewMonthStatistics shwoObjectPractical(Map<String, Object> map);
	
	/**
	 * 查询预期的交易数据
	 */
	public List<Double> shwoObject();
}
