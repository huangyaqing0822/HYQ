package com.lxit.crmsystem.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crmsystem.entity.BaseInfo;
import com.lxit.crmsystem.service.BaseInfoService;
import com.lxit.crmsystem.vo.Staffs;

@Controller
@RequestMapping("/baseInfoAction")
public class BaseInfoAction {
	
	@Autowired
	BaseInfoService baseInfoService;
	
	@ResponseBody
	@RequestMapping("/listSelectBaseInfo")
	public Map<String, Object> listSelectBaseInfo(Integer rows,Integer page,String baseDescribe){
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("pageSize", rows);
		map.put("pageIndex", (page-1)*rows);
		if(baseDescribe!=null&&(!baseDescribe.equals(""))){
			map.put("baseDescribe", "%"+baseDescribe+"%");
		}
		List<BaseInfo> list = baseInfoService.selectBaseInfo(map);
		Map<String,Object> maps = new HashMap<String,Object>();
		maps.put("rows", list);
		maps.put("total", baseInfoService.baseInfoCount(map));
		return maps;
	}
	
	@ResponseBody
	@RequestMapping("/insertBaseInfos")
	public String insertBaseInfos(BaseInfo baseInfo,HttpSession session){
		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		Staffs staff = (Staffs) session.getAttribute("staff");
		int countId = staff.getStaffId();
		baseInfo.setBaseCreateId(countId);
		baseInfo.setBaseCaeateTime(time);
		if (baseInfoService.insertBaseInfo(baseInfo)){
			return "true";
		}else{
			return "false";
		}
	}
	
	@ResponseBody
	@RequestMapping("/deleteBaseInfos")
	public String deleteBaseInfos(int baseId){
		if (baseInfoService.deleteBaseInfo(baseId)){
			return "true";
		}else {
			return "false";
		}
	}
	
	@ResponseBody
	@RequestMapping("/selectBaseinfoOne")
	public List<BaseInfo> selectBaseinfoOne(int baseId,Map<String, Object>map){
		BaseInfo baseInfo = baseInfoService.selectBaseInfoId(baseId);
		List<BaseInfo> list = new ArrayList<>();
		list.add(baseInfo);
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/updateBaseInfo")
	public String updateBaseInfo(BaseInfo baseInfo,HttpSession session){
		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		baseInfo.setBaseUpdateTime(time);
		Staffs staff = (Staffs) session.getAttribute("staff");
		int countId = staff.getStaffId();
		baseInfo.setBaseUpdateSid(countId);
		if (baseInfoService.updateBaseInfo(baseInfo)){
			return "true";
		}else{
			return "false";
		}
	}
	
}
