package com.lxit.crmsystem.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crmsystem.entity.Role;
@MapperScan
public interface RoleDao {
	/**
	 * 查询所有
	 * @return
	 */
	public List<Role> roleSelect(Map<String,Object> map);
	
	public int roleSelectCount2(Map<String,Object> map);
	/**
	 * 查询所有
	 * @return
	 */
	public List<Role> roleSelect1(Map<String,Object> map);
	
	/**
	 * 删除
	 * @param roleId
	 * @return
	 */
	boolean delRole(int roleId);
	
	/**
	 * 增加
	 * @param role
	 * @return
	 */
	int insertRole(Role role);
	
	/**
	 * 按照ID查询
	 * @param roleId
	 * @return
	 */
	public Role roleSelectOne(int roleId);
	
	/**
	 * 修改
	 * @param role
	 * @return
	 */
	int updateRole(Role role);
	
	/**
	 * 查询总条数
	 * @param map
	 * @return
	 */
	public int roleSelectCount(Map<String,Object> map);
	
	/**
	 * 查询角色权限关系
	 * @param map
	 * @return
	 */
	public int insertRoleNav(Map<String,Object> map);
	
	public int deleteRoleNav(int roleId);
	
	public List<Role> selectAll();
}
