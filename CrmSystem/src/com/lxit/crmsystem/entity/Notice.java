package com.lxit.crmsystem.entity;

/**
 * 公告包装类(notice)
 * @author Administrator
 *
 */
public class Notice {
	private Integer noticeId;//公告Id
	private String noticeTitle;//公告标题
	private String noticeReleaseDate;//公告发布时间
	private int noticeReleaseName;//发布人的Id
	private String noticeContent;//发布内容
	private String noticeCreatetime;//创建时间
	private String noticeUpdateTime;//最后一次修改时间
	private String noticeConding;//公告编码
	private int noticeGenreId;//公告类型ID
	private String staffName;//虚拟的用户名
	public Notice(){}
	
	
	public int getNoticeGenreId() {
		return noticeGenreId;
	}


	public void setNoticeGenreId(int noticeGenreId) {
		this.noticeGenreId = noticeGenreId;
	}


	public String getNoticeConding() {
		return noticeConding;
	}


	public void setNoticeConding(String noticeConding) {
		this.noticeConding = noticeConding;
	}


	public String getStaffName() {
		return staffName;
	}


	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}


	public Integer getNoticeId() {
		return noticeId;
	}
	public void setNoticeId(Integer noticeId) {
		this.noticeId = noticeId;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeReleaseDate() {
		return noticeReleaseDate;
	}
	public void setNoticeReleaseDate(String noticeReleaseDate) {
		this.noticeReleaseDate = noticeReleaseDate;
	}
	public int getNoticeReleaseName() {
		return noticeReleaseName;
	}
	public void setNoticeReleaseName(int noticeReleaseName) {
		this.noticeReleaseName = noticeReleaseName;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}
	public String getNoticeCreatetime() {
		return noticeCreatetime;
	}
	public void setNoticeCreatetime(String noticeCreatetime) {
		this.noticeCreatetime = noticeCreatetime;
	}
	public String getNoticeUpdateTime() {
		return noticeUpdateTime;
	}
	public void setNoticeUpdateTime(String noticeUpdateTime) {
		this.noticeUpdateTime = noticeUpdateTime;
	}


	@Override
	public String toString() {
		return "Notice [noticeId=" + noticeId + ", noticeTitle=" + noticeTitle + ", noticeReleaseDate="
				+ noticeReleaseDate + ", noticeReleaseName=" + noticeReleaseName + ", noticeContent=" + noticeContent
				+ ", noticeCreatetime=" + noticeCreatetime + ", noticeUpdateTime=" + noticeUpdateTime
				+ ", noticeConding=" + noticeConding + ", noticeGenreId=" + noticeGenreId + ", staffName=" + staffName
				+ "]";
	}
	
	
	
}
