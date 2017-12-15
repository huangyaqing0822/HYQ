package com.lxit.crmsystem.service;

import com.lxit.crmsystem.entity.Clientsatisfied;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.vo.ClientsatisfiedVo;

public interface ClientsatisfiedService {
	/**
	 * 增加
	 * @param clientsatisfied
	 * @return
	 */
	public int insert(Clientsatisfied clientsatisfied);
	
	/**
	 * 删除
	 * @param csId
	 * @return
	 */
	public int delete(int csId);
		
	
	/**
	 * 分页
	 * @param pageIndex
	 * @param pageSize
	 * @param clientId
	 * @return
	 */
	public Pager<ClientsatisfiedVo> query(int pageIndex,int pageSize,int csSid,String likeName);
	
	
	/**
	 * 根据id查询
	 * @param csId
	 * @return
	 */
	public ClientsatisfiedVo queryClientsatisfiedById(int csId);
	/**
	 * 修改
	 * @param clientsatisfied
	 * @return
	 */
	public int update(Clientsatisfied clientsatisfied);
}
