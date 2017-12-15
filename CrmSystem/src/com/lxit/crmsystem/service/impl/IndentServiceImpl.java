package com.lxit.crmsystem.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lxit.crmsystem.dao.IndentDao;
import com.lxit.crmsystem.entity.CompanyProduct;
import com.lxit.crmsystem.entity.Indent;
import com.lxit.crmsystem.service.IndentService;
import com.lxit.crmsystem.vo.IndentCpp;
import com.lxit.crmsystem.vo.ViewExpentInfo;
import com.lxit.crmsystem.vo.ViewIdentPracticalInfo;
import com.lxit.crmsystem.vo.ViewIdentType;
import com.lxit.crmsystem.vo.ViewIndent;
import com.lxit.crmsystem.vo.ViewIndentSlender;
import com.lxit.crmsystem.vo.ViewMonthStatistics;
import com.lxit.crmsystem.vo.ViewOnlyIndent;

@Transactional(isolation = Isolation.READ_COMMITTED, rollbackFor = {
		RuntimeException.class }, propagation = Propagation.REQUIRED)
@Service
public class IndentServiceImpl implements IndentService {

	@Autowired
	IndentDao id;

	@Override
	public Map<String, Object> selectIndent(Map<String, Object> map) {
		Map<String, Object> data = new Hashtable<>();
		String urole = id.selectLv((int) map.get("userId"));
		Integer lv = urole.contains("销售") && urole.contains("代表") ? 1 : null;
		map.put("state", lv);
		map.put("sid", (int) map.get("userId"));
		List<ViewIndent> list = id.selectIndent(map);
		map.put("counts", "count");
		int count = id.selectIndentCount(map);
		data.put("rows", list);
		data.put("total", count);
		return data;
	}

	@Override
	public Map<String, Object> selectProduct(Map<String, Object> map) {
		List<CompanyProduct> list = id.selectProduct(map);
		map.put("table", "companyproduct");
		int count = id.getCount(map);
		Map<String, Object> data = new Hashtable<>();
		data.put("rows", list);
		data.put("total", count);
		return data;
	}

	@Override
	public int getCount(Map<String, Object> map) {
		return id.getCount(map);
	}

	@Override
	public int insertIndent(Map<String, Object> map) {
		Indent indent = (Indent) map.get("ident");
		id.insertIndent(indent);
		Integer indentid = indent.getIndentId();
		String[] array = (String[]) map.get("sessc");
		Set<IndentCpp> list = new HashSet<IndentCpp>();
		for (String string : array) {
			String[] array2 = string.split("-");
			for (int i = 0; i < array2.length; i++) {
				IndentCpp ic = new IndentCpp();
				ic.setInid(indentid);
				ic.setCid(Integer.parseInt(array2[0]));
				ic.setCpcount(Integer.parseInt(array2[2]));
				list.add(ic);
			}
		}
		map.put("indentid", indentid);
		map.put("list", list);
		return id.insertIndentto(map);
	}

	@Override
	public Map<String, Object> inquery(Map<String, Object> map) {
		Map<String, Object> data = new HashMap<>();
		List<ViewOnlyIndent> list = id.inquery(map);
		map.put("counts", "tian");
		int count = id.inqueryCount(map);
		data.put("rows", list);
		data.put("total", count);
		return data;
	}

	@Override
	public List<ViewIdentType> inqueryTy() {
		return id.inqueryTy();
	}

	@Override
	public ViewIndentSlender slenderInfo(int idc) {
		return id.slenderIndent(idc);

	}

	public Map<String, Object> shwoObjectStatistics(Map<String, Object> map) {
		List<Double> yujiSource = id.shwoObject();// 预计数据源
		Map<String, Object> predictData = new HashMap<>();// 预计
		Map<String, Object> actualDate = new HashMap<>();// 实际
		ViewMonthStatistics vms = id.shwoObjectPractical(map);// 实际数据预处理
		vms = vms == null ? new ViewMonthStatistics() : vms;
		List<Double> actualList = new ArrayList<>();
		String[] month = getMenth();
		ViewIdentPracticalInfo vipi = new ViewIdentPracticalInfo();
		List<ViewExpentInfo> ViewExpentInfoList = new ArrayList<>();
		List<Double> liact = new ArrayList<>();
		for (String string : month) {
			switch (string) {
			case "Jan":// Jan
				actualList.add(vms.getJan());
				break;
			case "Feb":// Feb
				actualList.add(vms.getJan());
				break;
			case "Mar":// Mar
				actualList.add(vms.getMar());
				break;
			case "Apr":// Apr
				actualList.add(vms.getApr());
				break;
			case "May":// May
				actualList.add(vms.getMay());
				break;
			case "Jun":// Jun
				actualList.add(vms.getJun());
				break;
			case "Jul":// Jul
				actualList.add(vms.getJul());
				break;
			case "Aug":// Aug
				actualList.add(vms.getAug());
				break;
			case "Sep":// Sep
				actualList.add(vms.getSep());
				break;
			case "Oct":// Oct
				actualList.add(vms.getOct());
				break;
			case "Nov":// Nov
				actualList.add(vms.getNov());
				break;
			case "dec":// dec
				actualList.add(vms.getDecc());
				break;
			default:
				break;
			}
		}
		int ei = 0;
		for (Double at : actualList) {
			ViewExpentInfo vei = new ViewExpentInfo();
			if (yujiSource.get(ei) <= at) {
				vei.setColor("red");
				vei.setY(at);
			} else {
				vei.setColor("black");
				vei.setY(at);
			}
			liact.add(at);
			ViewExpentInfoList.add(vei);
		}
		vipi.setData(ViewExpentInfoList);
		predictData.put("name", "本月计划额度(单位:万)");
		predictData.put("data", yujiSource);
		/*------------------------------------------------*/
		actualDate.put("name", "本月完成额度(单位:万)");
		actualDate.put("data", liact);
		/**
		 * 处理完成
		 */
		Map<String, Object> data = new HashMap<>();
		data.put("predictData", predictData);
		data.put("actualDate", actualDate);
		return data;
	}

	public String[] getMenth() {
		return "Jan Feb Mar Apr May Jun Jul Aug Sep Oct Nov dec".split(" ");
	}

}
