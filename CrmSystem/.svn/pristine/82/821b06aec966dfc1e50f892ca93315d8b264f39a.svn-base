package com.lxit.crmsystem.service;

import com.lxit.crmsystem.entity.ClientDevelop;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.vo.ClientDevelopVo;
import com.lxit.crmsystem.vo.Clients;

public interface ClientDevelopService {
	/**
	 * 增加
	 * @param clientDevelop
	 * @return
	 */
	public int insert(ClientDevelop clientDevelop);
	
	/**
	 * 删除
	 * @param cdId
	 * @return
	 */
	public int delete(int cdId);
	
	
	/**
	 * 根据id查询
	 * @param cdId
	 * @return
	 */
	public ClientDevelopVo queryClientDevelopById(int cdId);
	/**
	 * 修改
	 * @param clientDevelop
	 * @return
	 */
	public int update(ClientDevelop clientDevelop);
	
	/**
	 * 分页
	 * @param pageIndex
	 * @param pageSize
	 * @param clientId
	 * @return
	 */
	public Pager<ClientDevelopVo> query(int pageIndex,int pageSize,int cdUpdateSid,String likeMonth);
}
