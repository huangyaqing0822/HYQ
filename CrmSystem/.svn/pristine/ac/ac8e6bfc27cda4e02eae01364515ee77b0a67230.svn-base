package com.lxit.crmsystem.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.crmsystem.dao.ContractDao;
import com.lxit.crmsystem.dao.IndentDao;
import com.lxit.crmsystem.dao.StaffDao;
import com.lxit.crmsystem.service.ContractService;
import com.lxit.crmsystem.vo.Staffs;
import com.lxit.crmsystem.vo.ViewContract;
import com.lxit.crmsystem.vo.ViewContractTwo;
import com.lxit.crmsystem.vo.ViewIdentType;

@Service
public class ContractServiceImpl implements ContractService {

	@Autowired
	ContractDao cd;
	@Autowired
	StaffDao sd;
	@Autowired
	IndentDao id;

	@Override
	public List<ViewIdentType> queryType() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("code", "CONTRACT_TYPE");
		return cd.queryType(map);
	}

	@Override
	public List<ViewIdentType> queryState() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("code", "CONTRACT_STATE");
		return cd.queryState(map);
	}

	@Override
	public int insert(Map<String, Object> map) {
		Staffs s = sd.queryBoss((int) map.get("sid"));
		map.put("did", s == null ? ((Integer) map.get("sid")) : s.getStaffId());
		return cd.addContract(map);
	}

	@Override
	public Map<String, Object> contractQuery(Map<String, Object> map) {
		String urole = id.selectLv((int) map.get("sid"));
		Integer lv = urole.contains("销售") && urole.contains("代表") ? 1 : null;
		List<ViewContract> rows = cd.contractQuery(map);
		map.put("counts", "count");
		int total = cd.contractQueryCount(map);

		Map<String, Object> data = new HashMap<>();
		data.put("rows", rows);
		data.put("total", total);
		data.put("lv", lv);
		return data;
	}

	@Override
	public ViewContract contractQueryDetail(Map<String, Object> map) {
		return cd.contractQueryDetail(map);
	}

	@Override
	public int update(Map<String, Object> map) {
		return cd.update(map);
	}

	@Override
	public int delet(int id) {
		return cd.delete(id);
	}

	@Override
	public int updateState(int id) {
		return cd.updateState(id);
	}

	@Override
	public Map<String, Object> selectContract(Map<String, Object> map) {
		List<ViewContract> rows = cd.selectContract(map);
		map.put("counts", "count");
		int total = cd.selectContractCount(map);
		Map<String, Object> data = new HashMap<>();
		data.put("rows", rows);
		data.put("total", total);
		return data;
	}

	@Override
	public ViewContractTwo selectOneCon(int cid) {
		return cd.selectOneCon(cid);
	}

	@Override
	public int insertContractUpd(ViewContractTwo vct) {
		return cd.insertContractUpd(vct);
	}

	@Override
	public int updateContr(ViewContractTwo vct) {
		return cd.updateContr(vct);
	}

	@Override
	public int updateContrState(Map<String, Object> map) {
		return cd.updateContrState(map);
	}

}
