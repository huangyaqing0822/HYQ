package com.lxit.crmsystem.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crmsystem.entity.Tree;
import com.lxit.crmsystem.service.TreeService;
import com.lxit.crmsystem.vo.Staffs;

@Controller
@RequestMapping("/treeAction")
public class TreeAction {
	@Autowired
	TreeService TreeService;
	
	@ResponseBody
	@RequestMapping("/tree")
	public List<Tree> tree(Integer id,HttpSession session){
		id=id==null?0:id;
		Map<String, Object> map=new HashMap<>();
		Staffs sid= (Staffs) session.getAttribute("staff");
		map.put("sid", sid.getStaffId());
		map.put("nid", id);
		List<Tree> listTree= TreeService.querys(map);
		return listTree;
	}
	
	
	
}
