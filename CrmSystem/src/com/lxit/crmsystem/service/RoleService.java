package com.lxit.crmsystem.service;

import java.util.List;
import java.util.Map;

import com.lxit.crmsystem.entity.Role;

public interface RoleService {
	public List<Role> roleSelect(Map<String,Object> map);
	
	boolean delRole(int roleId);
	
	boolean insertRole(Role role);
	
	public Role roleSelectOne(int roleId);
	
	boolean updateRole(Role role);
	
	public List<Role> roleSelect1(Map<String,Object> map);
	
	public int roleSelectCount(Map<String,Object> map);
	
	public int roleSelectCount2(Map<String,Object> map);
	
	public int insertRoleNav(Map<String,Object> map);
	
	public int deleteRoleNav(int roleId);
	
	public List<Role> selectAll();
}
