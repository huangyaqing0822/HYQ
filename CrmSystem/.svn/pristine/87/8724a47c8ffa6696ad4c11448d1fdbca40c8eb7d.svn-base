package com.lxit.crmsystem.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.lxit.crmsystem.entity.CompeteManage;
import com.lxit.crmsystem.entity.DataDictionary;
import com.lxit.crmsystem.service.CompeteManageService;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.vo.CompeteManageVo;
import com.lxit.crmsystem.vo.Staffs;

@Controller
public class CompeteAction {
	
	@Autowired
	private CompeteManageService competeManageService;
	 


	public void setCompeteManageService(CompeteManageService competeManageService) {
		this.competeManageService = competeManageService;
	}
	
	@ResponseBody
	@RequestMapping("/pageByLikeCompete")
	public Map<String, Object> pageByLikeMarketHap(HttpSession session,int page,int rows,String date){
		Pager<CompeteManageVo> pager = competeManageService.selectByLike(page, rows, date);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", pager.getSumCount());
		map.put("rows", pager.getData());
		return map;
	}
	
	//查询状态
	@ResponseBody
	@RequestMapping("/queryStateCompete")
	public List<DataDictionary> queryStateCompete(){
		List<DataDictionary> list = competeManageService.queryState();
		return list;
	}
	
	//查询类型
	@ResponseBody
	@RequestMapping("/queryTypeCompete")
	public List<DataDictionary> queryTypeCompete(){
		List<DataDictionary> list = competeManageService.queryType();
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/getByCompeteId")
	public List<CompeteManageVo> listCom(int competId){
		CompeteManageVo vo = competeManageService.getById(competId);
		List<CompeteManageVo> list = new ArrayList<CompeteManageVo>();
		list.add(vo);
		return list;
	}
	
	//归档：改变状态
	@ResponseBody
	@RequestMapping("/updateState")
	public String updateState(int competId,HttpSession session){

		CompeteManageVo voId = competeManageService.getById(competId);
		if(voId.getCompetStateValue().equals("未归档")){
			int count = competeManageService.updateState(competId);
			if(count > 0){
				return "true";
			}
		}
		return "false";
		
	}
	
	//增加同时导入数据（上传附件）
	@ResponseBody
	@RequestMapping("/addCompete")
	public String fileupload(ServletRequest request, @RequestParam("file") MultipartFile file, Model model,
			HttpSession session,CompeteManage competeManage) throws IOException {
		
		Staffs staff =   (Staffs) session.getAttribute("staff");
		int loginId = staff.getStaffId();
		
	    //获取文件类型
	    String type = file.getContentType();
		 
		if (!file.isEmpty()) { 
			
			String str = new String(file.getBytes(),"utf-8");
			competeManage.setCompetResult(str);
			competeManage.setCompetSid(loginId);
			competeManage.setCompetUpdateSid(loginId);
			competeManage.setCompetType(87);
			competeManage.setCompetState(89);
			
			int count = competeManageService.addCompete(competeManage);
			if(count > 0 ){
				return "true";
			}
		}else if(type.equals("text/plain")){
			model.addAttribute("message", "选择要上传的文件类型必须为.text文件");
		} else {
			model.addAttribute("message", "请选择要上传的文件");
		}
		return "false";
	}
	
	
 
	

}
