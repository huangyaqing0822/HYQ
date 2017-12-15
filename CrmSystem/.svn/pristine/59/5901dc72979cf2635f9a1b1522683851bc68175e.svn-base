package com.lxit.crmsystem.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crmsystem.entity.ClientDevelop;
import com.lxit.crmsystem.vo.ClientDevelopVo;
import com.lxit.crmsystem.vo.Clients;

@MapperScan
public interface ClientDevelopDao {
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
	 * 查询总条数
	 * @param cdUpdateSid
	 * @return
	 */
	public int getCount(int cdUpdateSid);
	/**
	 * 查询
	 * @param map
	 * @return
	 */
	public List<ClientDevelopVo> query(Map<String, Object> map);
	
	
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
	
	
}
