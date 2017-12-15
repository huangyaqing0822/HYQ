package com.lxit.crmsystem.service;

import java.util.List;
import java.util.Map;

import com.lxit.crmsystem.entity.Client;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.vo.ClientDevelopVo;
import com.lxit.crmsystem.vo.Clients;
import com.lxit.crmsystem.vo.ServeVo;
import com.lxit.crmsystem.vo.Staffs;

public interface ClientService {
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
	 * 修改
	 * @param client
	 * @return
	 */
	public int update(Client client);
	
	/**
	 * 根据id查询(客户资源)
	 * @param clientId
	 * @return
	 */
	public Clients queryClientById(int clientId);
	
	
	/**
	 * 客户资源管理分页
	 * @param pageIndex
	 * @param pageSize
	 * @param clientId
	 * @return
	 */
	public Pager<Clients> query(int pageIndex,int pageSize,int clientId,String likeName,String likeState);

	////////////////////////
	
	
	/**
	 * 价值管理 分页
	 * @param pageIndex
	 * @param pageSize
	 * @param clientId
	 * @return
	 */
	public Pager<Clients> queryValue(int pageIndex,int pageSize,int clientId,String likeName,String likeType);

	
	/**
	 * 根据id查询
	 * @param clientId
	 * @return
	 */
	public Clients queryValueById(int clientId);
	
	/////////////////////////////////////
	

	/**
	 * 信誉管理 分页
	 * @param pageIndex
	 * @param pageSize
	 * @param clientId
	 * @return
	 */
	public Pager<Clients> queryReputation(int pageIndex,int pageSize,int clientId,String likeName);

	
	/**
	 * 根据id查询
	 * @param clientId
	 * @return
	 */
	public Clients queryReputationById(int clientId);
	
	
	
	
	public List<Clients> queryClient(int clientId);
	
	public int updateState(Client client);
	
}
