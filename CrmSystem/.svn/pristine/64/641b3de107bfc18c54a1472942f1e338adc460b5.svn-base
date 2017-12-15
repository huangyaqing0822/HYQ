package com.lxit.crmsystem.service;

import java.util.List;
import java.util.Map;

import com.lxit.crmsystem.dao.ClientLovingDao;
import com.lxit.crmsystem.entity.ClientLoving;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.vo.ClientLovingVo;
import com.lxit.crmsystem.vo.Clients;

public interface ClientLovingService {
	/**
	 * 增加
	 * @param clientLoving
	 * @return
	 */
	public int insert(ClientLoving clientLoving);
	
	/**
	 * 删除
	 * @param clId
	 * @return
	 */
	public int delete(int clId);
	
	
	/**
	 * 根据id查询
	 * @param clId
	 * @return
	 */
	public ClientLovingVo queryClientLovingById(int clId);
	/**
	 * 修改
	 * @param clientLoving
	 * @return
	 */
	public int update(ClientLoving clientLoving);
	
	
	/**
	 * 分页
	 * @param pageIndex
	 * @param pageSize
	 * @param clientId
	 * @return
	 */
	public Pager<ClientLovingVo> query(int pageIndex,int pageSize,int clId,String likeName);
}
