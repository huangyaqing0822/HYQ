package com.lxit.crmsystem.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crmsystem.entity.ClientLoving;
import com.lxit.crmsystem.vo.ClientLovingVo;

@MapperScan
public interface ClientLovingDao {
	
	
	
	/**
	 * 查询总条数
	 * @param clUpdateSid
	 * @return
	 */
	public int getCount(int clUpdateSid);
	
	/**
	 * 查询
	 * @param map
	 * @return
	 */
	public List<ClientLovingVo> query(Map<String, Object> map);
	
	
	
	/**
	 * 根据id查询,修改用
	 * @param clientId
	 * @return
	 */
	public ClientLovingVo queryClientLovingById(int clId);
	
	
	
	
	////////关怀提醒
	
	
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
	 * 修改
	 * @param client
	 * @return
	 */
	public int update(ClientLoving clientLoving);
	
}
