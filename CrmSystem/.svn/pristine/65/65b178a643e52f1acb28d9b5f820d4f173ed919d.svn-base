package com.lxit.crmsystem.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.crmsystem.dao.StaffDao;
import com.lxit.crmsystem.dao.ViewDao;
import com.lxit.crmsystem.service.ViewService;
import com.lxit.crmsystem.vo.HistogramOneVo;
@Service("viewService")
public class ViewServiceImpl implements ViewService {

	@Autowired
	ViewDao viewDao;
	
	@Override
	public List<HistogramOneVo> histogramone(int state,int month) {
		Map<String,Object> maps = new HashMap<String,Object>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date date = new Date();
        String str = sdf.format(date);
        int year = Integer.parseInt(str);
		maps.put("shier", 12);
		maps.put("yearNew", year);
		maps.put("yearOld", year-1);
		if(state==1){
			return viewDao.histogramone(maps);
		}else if (state==2){
			return viewDao.histogramtwo(maps);
		}else if (state==3){
			return viewDao.histogramthree(maps);
		}else if (state==4){
			return viewDao.histogramfour(maps);
		}else if (state == 5){
			return viewDao.histogramfive(maps);
		}else if (state == 6){
			maps.put("month", month);
			return viewDao.histogramsix(maps);
		}
		return null;
	}

	
}
