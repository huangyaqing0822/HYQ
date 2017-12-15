package com.lxit.crmsystem.service;


import java.util.List;
import java.util.Map;

import com.lxit.crmsystem.entity.Staff;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.vo.Staffs;

public interface StaffService {
	public Staffs queryByIdAndPass(String name,String pass);
	public Pager<Staffs> selectStaff(Map<String,Object> map,Pager<Staffs> staff);

	public int insertStaff(Staff staff);
	public int updateStaff(Staff staff);
	public int deleteStaff(int staffId);
	public Staffs selectStaffs(int staffId);

	public Staffs queryBoss(int sid);

	public List<Staffs > queryStaff(int bossId);

	public int deleteTwo(int staffId);  
	
	public int insertRoleStaff(Map<String,Object> map);
	
	
	public int updatLoginName(Map map);
	public int updattephone(Map map);
	public Staffs selectPass(Map map);
	public int updatPass(Map maps);
	
	
	public boolean selectStaffOne(int staffId);
}
