package com.lxit.crmsystem.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.annotation.MapperScan;

import com.lxit.crmsystem.entity.Notice;

@MapperScan
public interface NoticeDao {
	/**
	 * 查询所有的数据
	 * @return
	 */
	public List<Notice> listNoticeSelect(Map<String, Object>map);
	
	public int notiCount(Map<String, Object>map);
	
	/**
	 * 插入数据
	 * @param notice
	 * @return
	 */
	int insertNote(Notice notice);
	
	/**
	 * 删除数据
	 * @param noticeId
	 * @return
	 */
	int deleteNote(int noticeId);
	
	/**
	 * 按照ID查询数据
	 * @param noticeId
	 * @return
	 */
	public Notice listOne(int noticeId);
	
	/**
	 * 修改数据
	 * @param notice
	 * @return
	 */
	int updateNote(Notice notice);
}
