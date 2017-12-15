package com.lxit.crmsystem.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crmsystem.entity.LinkMan;
import com.lxit.crmsystem.service.LinkmanService;
import com.lxit.crmsystem.util.Pager;
import com.lxit.crmsystem.util.Serialnumber;
import com.lxit.crmsystem.vo.Staffs;

@Controller
public class LinkmanAction {
	
	@Autowired
	private LinkmanService linkmanService;
	
	@ResponseBody
	@RequestMapping("/pageByLikeLinkman")
	public Map<String, Object> pageByLikeMarketHap(HttpSession session,int page,int rows,String name){
		
		Pager<LinkMan> pager = linkmanService.selectByLike(page, rows, name);		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("total", pager.getSumCount());
		map.put("rows", pager.getData());
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/addLinkmanPost")
	public String addLinkman(HttpSession session,LinkMan linkman){
		
		Staffs staff =   (Staffs) session.getAttribute("staff");
		int loginId = staff.getStaffId();
		String linkmanCoding = Serialnumber.Getnum("643");
		
		linkman.setLinkSid(loginId); //联系人所属员工
		linkman.setLinkUpdateSid(loginId);//最后一次修改人
		linkman.setLinkConding("LXR"+linkmanCoding);
		
		int count = linkmanService.addLinkman(linkman);
		if(count > 0){
			return "true";
		}
		return "false";
	}
	
	@ResponseBody
	@RequestMapping("/getById_linkman")
	public List<LinkMan> getById(int linkId){
		
		LinkMan link = linkmanService.getById(linkId);
		List<LinkMan> list = new ArrayList<LinkMan>();
		list.add(link);
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/updateLinkmanPost")
	public String updateLinkmanPost(LinkMan linkman,HttpSession session){
		
		Staffs staff =   (Staffs) session.getAttribute("staff");
		int loginId = staff.getStaffId();
		linkman.setLinkSid(loginId);
		linkman.setLinkUpdateSid(loginId);
		int count = linkmanService.updateLinkman(linkman);
		if(count > 0){
			return "true";
		}
		return "false";
	}
	
	@ResponseBody
	@RequestMapping("/delLinkmanPost")
	public String delLinkman(int linkId){
		
		int count = linkmanService.delLineman(linkId);
		if(count > 0){
			return "true";
		}
		return "false";
	}
	

}
