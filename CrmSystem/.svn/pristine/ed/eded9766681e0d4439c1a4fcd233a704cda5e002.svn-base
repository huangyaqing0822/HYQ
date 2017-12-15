package com.lxit.crmsystem.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crmsystem.entity.Client;
import com.lxit.crmsystem.vo.Clients;
import com.lxit.crmsystem.vo.ServeVo;

@MapperScan
public interface ClientDao {
	/**
	 * 增加
	 * @param client
	 * @return
	 */
	public int insert(Client client);
	
	/**
	 * 删除
	 * @param clientId
	 * @return
	 */
	public int delete(int clientId);
	
	
	/**
	 * 查询总条数
	 * @param clientSid
	 * @return
	 */
	public int getCount(int clientSid);
	
	/**
	 * 查询
	 * @param map
	 * @return
	 */
	public List<Clients> query(Map<String, Object> map);
	
	
	
	
	
	/**
	 * 根据id查询,修改用(客户资源)
	 * @param clientId
	 * @return
	 */
	public Clients queryClientById(int clientId);
	/**
	 * 修改
	 * @param client
	 * @return
	 */
	public int update(Client client);
	
	
	
	////////////////////////////////////////////// 客户价值管理
	
	/**
	 * 查询
	 * @param map
	 * @return
	 */
	public List<Clients> queryValue(Map<String, Object> map);
	
	/**
	 * 根据id查询
	 * @param clientId
	 * @return
	 */
	public Clients queryValueById(int clientId);
	
	
	
	//////////////////////////////////////客户信誉管理
	
	/**
	 * 查询
	 * @param map
	 * @return
	 */
	public List<Clients> queryReputation(Map<String,Object> map);
	
	/**
	 * 根据id查询
	 * @param clientId
	 * @return
	 */
	public Clients queryReputationById(int clientId);
	
	public int updateState(Client client);
	
}
