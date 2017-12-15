package com.lxit.crmsystem.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crmsystem.entity.LinkMan;

@MapperScan
public interface LinkmanDao {
	
	//增加联系人
	public int addLinkman(LinkMan linkman);
	
	//联系人删除
	public int delLineman(int linkId);
	
	//联系人信息修改
	public int updateLinkman(LinkMan linkman);
	
	//更具id得到对象：查看
	public LinkMan getById(int linkId);
	
	//得到模糊查询的条数
	public int getSumCount(Object [] name);
	
	//模糊查询
	public List<LinkMan> selectByLike(Map<String, Object> map);
		
	

}
