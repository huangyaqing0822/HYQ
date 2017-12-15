package com.lxit.crmsystem.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.crmsystem.dao.RoleDao;
import com.lxit.crmsystem.entity.Role;
import com.lxit.crmsystem.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService{

	@Autowired
	RoleDao roleDao;
	@Override
	public List<Role> roleSelect(Map<String,Object> map) {
		return roleDao.roleSelect(map);
	}
	@Override
	public boolean delRole(int roleId) {
		return roleDao.delRole(roleId);
	}
	@Override
	public boolean insertRole(Role role) {
		return roleDao.insertRole(role)>0?true:false;
	}
	@Override
	public Role roleSelectOne(int roleId) {
		return roleDao.roleSelectOne(roleId);
	}
	@Override
	public boolean updateRole(Role role) {
		return roleDao.updateRole(role)>0?true:false;
	}
	
	@Override
	public List<Role> roleSelect1(Map<String,Object> map) {
		return roleDao.roleSelect1(map);
	}
	@Override
	public int roleSelectCount(Map<String, Object> map) {
		return roleDao.roleSelectCount(map);
	}
	@Override
	public int roleSelectCount2(Map<String, Object> map) {
		return roleDao.roleSelectCount2(map);
	}
	@Override
	public int insertRoleNav(Map<String, Object> map) {
		return roleDao.insertRoleNav(map);
	}
	@Override
	public int deleteRoleNav(int roleId) {
		return roleDao.deleteRoleNav(roleId);
	}
	@Override
	public List<Role> selectAll() {
		// TODO Auto-generated method stub
		return roleDao.selectAll();
	}
	

}
