package com.lxit.crmsystem.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crmsystem.vo.ViewContract;
import com.lxit.crmsystem.vo.ViewContractTwo;
import com.lxit.crmsystem.vo.ViewIdentType;

@MapperScan
public interface ContractDao {
	/**
	 * 查询合同类型
	 * 
	 * @return
	 */
	public List<ViewIdentType> queryType(Map<String, String> map);

	/**
	 * 查询合同状态
	 * 
	 * @return
	 */
	public List<ViewIdentType> queryState(Map<String, String> map);

	/**
	 * 添加合同
	 * 
	 * @param map
	 * @return
	 */
	public int addContract(Map<String, Object> map);

	/**
	 * 查询信息
	 * 
	 * @param map
	 * @return
	 */
	public List<ViewContract> contractQuery(Map<String, Object> map);

	/**
	 * 对应条数
	 * 
	 * @param map
	 * @return
	 */
	public int contractQueryCount(Map<String, Object> map);

	/**
	 * 合同管理数据
	 * 
	 * @param map
	 * @return
	 */
	public List<ViewContract> selectContract(Map<String, Object> map);

	/**
	 * 对应条数
	 * 
	 * @param map
	 * @return
	 */
	public int selectContractCount(Map<String, Object> map);

	/**
	 * 查询具体合同
	 * 
	 * @param cid
	 * @return
	 */
	public ViewContractTwo selectOneCon(int cid);

	/**
	 * 修改
	 * 
	 * @param vct
	 * @return
	 */
	public int insertContractUpd(ViewContractTwo vct);

	/**
	 * 修改
	 * 
	 * @param vct
	 * @return
	 */
	public int updateContr(ViewContractTwo vct);

	/**
	 * 
	 * @param map
	 * @return
	 */
	public ViewContract contractQueryDetail(Map<String, Object> map);

	/**
	 * 修改
	 * 
	 * @param map
	 * @return
	 */
	public int update(Map<String, Object> map);

	/**
	 * 删除
	 * 
	 * @param id
	 * @return
	 */
	public int delete(int id);

	/**
	 * 
	 * @param id
	 * @return
	 */
	public int updateState(int id);

	public int updateContrState(Map<String, Object> map);

}
