package com.lxit.crmsystem.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crmsystem.entity.Market;
import com.lxit.crmsystem.service.MarketService;
import com.lxit.crmsystem.service.StaffService;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.util.Serialnumber;
import com.lxit.crmsystem.vo.Markets;
import com.lxit.crmsystem.vo.Staffs;


@Controller
public class MarketAction {
	
	@Autowired
	MarketService marketService;
	@Autowired
	StaffService staffService;
	
	@ResponseBody
	@RequestMapping("/addMarketPost")
	public String addMarket(Market market,HttpSession session){
		 
		String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		String marketCoding = Serialnumber.Getnum("643");
		
		Staffs staff =   (Staffs) session.getAttribute("staff");
		int marketOperatorId = staff.getStaffId();
		market.setMarketOperatorId(marketOperatorId);
		market.setMarketUpdateSid(marketOperatorId);
		market.setMarketCoding("JH"+marketCoding);
		market.setMarketCreateDate(time);
		market.setMarketDate(time);
		market.setMarketState(33);
		
		int count = marketService.addMarket(market);
		if(count > 0){
		}
		return "true";
	}
	
	 
	
	@ResponseBody
	@RequestMapping("/query")
	public List<Market> query(){
		 List<Market> list = marketService.listMarket();
		 return list;
	}
	
	@ResponseBody
	@RequestMapping("/delPostMarket")
	public String delMarket(int marketId,HttpSession session){
		
		Market market = marketService.queryById(marketId);
		Staffs staff = (Staffs) session.getAttribute("staff");
		int loginId = staff.getStaffId();
		
		/*if(market.getMarketState() != 44 && loginId==market.getMarketOperatorId()){*/
			int count = marketService.delMarket(marketId);
			if(count > 0){
				return "true";
			}
		/*}*/
		return "false";
		//String [] str = ids.split(",");
		/*for (int i = 0; i < str.length; i++) {
			
			int id = Integer.parseInt(str[i]);
			
			int count = marketService.delMarket(id);
			if(count > 0){
				return "true";
			}
			
		}*/
		
	}
	
	@ResponseBody
	@RequestMapping("/getMarketById")
	public List<Market> getMarketById(int marketId){
		
		Market market = marketService.queryById(marketId);
		String [] str = (market.getMarketDate()).split("-");
		market.setMarketDate(str[0]+"-"+str[1]);
		
		List<Market> list = new ArrayList<Market>();
		list.add(market);
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/updatPost_market")
	public String updatePost(Market market){
		
		int count = marketService.updateMarket(market);
		if(count > 0){
			return "true";
		}else{
			return "false";
		}
	}
	
	@ResponseBody
	@RequestMapping("/pageByLike")
	public Map<String, Object> pageByLike(HttpSession session,int page,int rows,String date,HttpServletRequest request){
		/*String date = request.getParameter("marketDate_likeby");		
		System.out.println("date : "+date);*/
		
		
		Staffs staff =   (Staffs) session.getAttribute("staff");
		int marketId = staff.getStaffId();
		
		Pager<Markets> pager = marketService.selectByLike(page, rows, date,marketId);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", pager.getSumCount());
		map.put("rows", pager.getData());
		return map;
	}
	@ResponseBody
	@RequestMapping("/updateMarketStates")
	public String updateMarketStates(Market market,HttpSession session){
		Staffs staff=(Staffs) session.getAttribute("staff");
		market.setMarketState(36);
		int bossId=staffService.queryBoss(staff.getStaffId())==null?0:staffService.queryBoss(staff.getStaffId()).getStaffId();	
		market.setMarketWaithandleId(bossId);
		int count=marketService.updateMarketStates(market);
		if(count>0){
			return "true";
		}
		return "false";
		
	}

}
