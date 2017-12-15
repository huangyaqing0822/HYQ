package com.lxit.crmsystem.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxit.crmsystem.dao.NoticeDao;
import com.lxit.crmsystem.entity.Notice;
import com.lxit.crmsystem.service.NoticeService;

@Service("noticeService")
public class NoticeServiceImpl implements NoticeService{
	@Autowired
	NoticeDao noticeDao;

	@Override
	public boolean insertNote(Notice notice) {
		return noticeDao.insertNote(notice)>0?true:false;
	}
	@Override
	public boolean deleteNote(int noticeId) {
		return noticeDao.deleteNote(noticeId)>0?true:false;
	}
	@Override
	public Notice listOne(int noticeId) {
		return noticeDao.listOne(noticeId);
	}
	@Override
	public boolean updateNote(Notice notice) {
		return noticeDao.updateNote(notice)>0?true:false;
	}
	@Override
	public List<Notice> listNoticeSelect(Map<String, Object> map) {
		return noticeDao.listNoticeSelect(map);
	}
	@Override
	public int notiCount(Map<String, Object> map) {
		return noticeDao.notiCount(map);
	}
	

}
