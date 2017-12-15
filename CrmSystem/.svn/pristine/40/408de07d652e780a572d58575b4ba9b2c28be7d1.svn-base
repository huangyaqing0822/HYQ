package com.lxit.crmsystem.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crmsystem.entity.Clientsatisfied;
import com.lxit.crmsystem.vo.ClientsatisfiedVo;

@MapperScan
public interface ClientsatisfiedDao {
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
	 * 查询总条数
	 * @param csSid
	 * @return
	 */
	public int getCount(int csSid);
	/**
	 * 查询
	 * @param map
	 * @return
	 */
	public List<ClientsatisfiedVo> query(Map<String, Object> map);
	
	
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
