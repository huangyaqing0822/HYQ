package com.lxit.crmsystem.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxit.crmsystem.entity.Indent;
import com.lxit.crmsystem.service.IndentService;
import com.lxit.crmsystem.vo.Staffs;
import com.lxit.crmsystem.vo.ViewIdentType;
import com.lxit.crmsystem.vo.ViewIndentSlender;

@Controller
@RequestMapping("indent")
public class IndentController {

	@Autowired
	IndentService is;

	@RequestMapping("query")
	@ResponseBody
	public Map<String, Object> queryIndent(HttpSession session, String type, String likeval, Integer page,
			Integer rows) {
		Staffs user = (Staffs) session.getAttribute("staff");
		likeval = likeval == null || likeval.length() == 0 ? null : likeval;
		Map<String, Object> map = getPageParem(page, rows);
		map.put("userId", user.getStaffId());
		map.put(type, likeval);
		return is.selectIndent(map);
	}

	@RequestMapping("queryProduct")
	@ResponseBody
	public Map<String, Object> queryProduct(Integer page, Integer rows) {
		Map<String, Object> map = getPageParem(page, rows);
		return is.selectProduct(map);
	}

	@RequestMapping("insertProduct")
	@ResponseBody
	public boolean insertProduct(Integer id, String info, String heji, String fapiao, HttpSession session) {
		Staffs staff = (Staffs) session.getAttribute("staff");
		String[] array1 = info.split("<br>");
		fapiao = fapiao.replaceAll("<br>", ";");
		fapiao = fapiao.replaceAll("</spen>", ";");
		String allprice = fapiao.substring(fapiao.lastIndexOf(">") + 1);
		fapiao = fapiao.substring(0, fapiao.lastIndexOf("："));
		fapiao += allprice;
		Map<String, Object> map = new HashMap<>();
		Indent dent = new Indent();
		dent.setIndentClientId(id);
		dent.setIndentCountprice(Double.parseDouble(heji));
		dent.setIndentInvoice(fapiao);
		dent.setIndentMod("货到付款,公司送货上门");
		dent.setIndentSid(staff.getStaffId());
		dent.setIndentType("有满的");
		dent.setIndentYunfei(0.0);
		map.put("ident", dent);
		map.put("sessc", array1);
		return is.insertIndent(map) > 0;
	}

	public Map<String, Object> getPageParem(Integer page, Integer rows) {
		Map<String, Object> map = new HashMap<>();
		map.put("page", ((page == 0 ? 1 : page) - 1) * rows);
		map.put("rows", rows);
		return map;
	}

	@RequestMapping("IdentInfos")
	@ResponseBody
	public Map<String, Object> getIdentInfos(Integer page, Integer rows, String date, String type, String input) {
		Map<String, Object> map = getPageParem(page, rows);
		if (input != null && input.contains("-")) {
			String[] inputs = input.split("-");
			map.put(inputs[0], inputs[1]);
		}
		switch (date == null ? new String() : date) {
		case "before":// 小等
			map.put(date, getDate(0, 0, false));
			break;
		case "before3":// 小等
			map.put(date, getDate(null, 1, true));
			break;
		case "nowN":// 小等
			map.put(date, getDate(1, 0, false));
			break;
		default:// 无
			map.put(date, null);
			break;
		}
		if (!"不限".equals(type)) {
			map.put("type", type);
		}
		map = is.inquery(map);
		return map;
	}

	@RequestMapping("Identtype")
	@ResponseBody
	public List<ViewIdentType> getIdentInfos() {
		return is.inqueryTy();
	}

	@SuppressWarnings("deprecation")
	public String getDate(Integer month, int date, boolean flag) {
		Date nowTime = new Date();
		if (flag) {
			nowTime.setMonth(nowTime.getMonth() - 3);
			nowTime.setDate(date);
		} else {
			nowTime.setMonth(month);
			nowTime.setDate(date);
		}
		SimpleDateFormat time = new SimpleDateFormat("yyyy-MM-dd");
		return time.format(nowTime);
	}

	@RequestMapping("slenderInfo")
	@ResponseBody
	public ViewIndentSlender slender(int id) {
		return is.slenderInfo(id);
	}

	/**
	 * 统计方法
	 * 
	 * @return
	 */
	@RequestMapping("statistics")
	@ResponseBody
	public Map<String, Object> statistics(Integer year) {
		Map<String, Object> map=new HashMap<>();
		map.put("year", year);
		map.put("yearNext", year+1);
		return is.shwoObjectStatistics(map);
	}

}
