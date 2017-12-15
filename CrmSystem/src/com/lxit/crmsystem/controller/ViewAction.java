package com.lxit.crmsystem.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crmsystem.service.ViewService;
import com.lxit.crmsystem.vo.HistogramOneVo;
/**
 * 统计分析模块
 * @author Administrator
 *
 */
@Controller
public class ViewAction {
	@Autowired
	ViewService viewService;
	
	@ResponseBody
	@RequestMapping("/selectOne")
	public List<HistogramOneVo> selectViewOne(Integer state){
		state = state == null||state==0?1:state;
		List<HistogramOneVo> list = viewService.histogramone(state,0);
		
		return list;
	}
	
	@RequestMapping("/selectOne1")
	public String selectViewOne1(Integer month,HttpServletRequest request){
		request.setAttribute("month", month);
		return "piechart";
	}
	@ResponseBody
	@RequestMapping("/selectOne2")
	public List<HistogramOneVo> selectViewOne2(Integer month,HttpServletRequest request){
		List<HistogramOneVo> list = viewService.histogramone(6,month);
		return list;
	}
	
	
}















