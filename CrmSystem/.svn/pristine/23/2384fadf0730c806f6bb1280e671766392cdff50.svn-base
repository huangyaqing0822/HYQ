package com.lxit.crmsystem.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

import com.lxit.crmsystem.entity.DataDictionary;
import com.lxit.crmsystem.entity.Department;
import com.lxit.crmsystem.entity.MarketForecast;
import com.lxit.crmsystem.service.MarketForecastService;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.util.UploadAction;
import com.lxit.crmsystem.vo.MarketForecastVo;
import com.lxit.crmsystem.vo.Staffs;

@Controller
public class MarketForecastAction {
	
	@Autowired
	MarketForecastService marketForecastService;
	
	@ResponseBody
	@RequestMapping("/getMarketForById")
	public List<MarketForecastVo> listForecast(int forecastId){
		
		MarketForecastVo mar = marketForecastService.getById(forecastId);
		List<MarketForecastVo> list = new ArrayList<MarketForecastVo>();
		list.add(mar);
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/queryCodeData")
	public List<DataDictionary> queryCodeData(){
		List<DataDictionary> list = marketForecastService.queryDateCode();
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/pageByLikeForecast")
	public Map<String, Object> pageByLike(HttpSession session,int page,int rows,String date){
		
		Pager<MarketForecast> pager = marketForecastService.selectByLike(page, rows, date);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", pager.getSumCount());
		map.put("rows", pager.getData());
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/forecastPost")
	public String fileupload(ServletRequest request, @RequestParam("file") MultipartFile file,
			Model model,HttpSession session,MarketForecast marketForecast) throws IOException {
		
		//String filename = file.getOriginalFilename();
		//String uploadpath = request.getServletContext().getRealPath("/"+filename);
		
		
		//String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		Staffs staff =   (Staffs) session.getAttribute("staff");
		int loginId = staff.getStaffId();
		
		String type = file.getContentType();
		if (!file.isEmpty()) { 
			 
			String str = new String(file.getBytes(),"utf-8");
			marketForecast.setForecastText(str);
			marketForecast.setDepartmentId(1);
			marketForecast.setForecastType(47);
			marketForecast.setForecastUpdateSid(loginId);
			
			int count = marketForecastService.addMarketForecast(marketForecast);
			if(count > 0){
				return "true";
			}
		}else if(type.equals("text/plain")){
			model.addAttribute("message","文件上传类型必须为.text文件");
		} else {
			model.addAttribute("message", "请选择要上传的文件");
		}
		
		return "false";
	}
 

 
 


}
