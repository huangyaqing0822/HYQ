package com.lxit.crmsystem.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.crmsystem.dao.DepartmentDao;
import com.lxit.crmsystem.entity.Department;
import com.lxit.crmsystem.service.DepartmentService;

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	DepartmentDao departmentDao;
	@Override
	public List<Department> listDepartment() {
		return departmentDao.listDepartment();
	}
	@Override
	public boolean deleteDepartment(int departmentId) {
		return departmentDao.deleteDepartment(departmentId)>0?true:false;
	}
	@Override
	public Department listDepartOne(int departmentId) {
		return departmentDao.listDepartOne(departmentId);
	}
	@Override
	public boolean updateDepartment(Department department) {
		return departmentDao.updateDepartment(department)>0?true:false;
	}
	@Override
	public boolean insertDepartment(Department department) {
		return departmentDao.insertDepartment(department)>0?true:false;
	}
	@Override
	public List<Department> listDepartment2() {
		return departmentDao.listDepartment2();
	}

	

}
