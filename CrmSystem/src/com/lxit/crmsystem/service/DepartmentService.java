package com.lxit.crmsystem.service;

import java.util.List;
import java.util.Map;

import com.lxit.crmsystem.entity.Department;

public interface DepartmentService {
	public List<Department> listDepartment();
	public List<Department> listDepartment2();
	boolean deleteDepartment(int departmentId);
	
	
	public Department listDepartOne(int departmentId);
	
	boolean updateDepartment(Department department);
	
	boolean insertDepartment(Department department);
}
