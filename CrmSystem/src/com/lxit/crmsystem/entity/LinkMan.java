package com.lxit.crmsystem.entity;

/**
 * @author Administrator
 *	联系人表
 */
public class LinkMan {
	private Integer linkId;  //联系人id
	private String linkName;  //联系人姓名
	private String linkSex;  //联系人性别
	private String linkPhone;  //联系人电话
	private String linkAddress;  //联系人地址
	private String linkRemark;  //备注
	private String linkCreateTime;  //创建时间
	private String linkUpdateTime;  //修改时间
	private String linkConding;  //联系人编码
	private String linkWorkphone;  //联系人办公电话
	private String linkHomephone;  //家庭电话
	private String linkBirthdayDate;  //联系人生日
	private String linkEmail;  //电子邮件
	private Integer linkSid;  //联系人所属员工
	private Integer linkUpdateSid;  //最后一次修改人
	public Integer getLinkId() {
		return linkId;
	}
	public void setLinkId(Integer linkId) {
		this.linkId = linkId;
	}
	public String getLinkName() {
		return linkName;
	}
	public void setLinkName(String linkName) {
		this.linkName = linkName;
	}
	public String getLinkSex() {
		return linkSex;
	}
	public void setLinkSex(String linkSex) {
		this.linkSex = linkSex;
	}
	public String getLinkPhone() {
		return linkPhone;
	}
	public void setLinkPhone(String linkPhone) {
		this.linkPhone = linkPhone;
	}
	public String getLinkAddress() {
		return linkAddress;
	}
	public void setLinkAddress(String linkAddress) {
		this.linkAddress = linkAddress;
	}
	public String getLinkRemark() {
		return linkRemark;
	}
	public void setLinkRemark(String linkRemark) {
		this.linkRemark = linkRemark;
	}
	public String getLinkCreateTime() {
		return linkCreateTime;
	}
	public void setLinkCreateTime(String linkCreateTime) {
		this.linkCreateTime = linkCreateTime;
	}
	public String getLinkUpdateTime() {
		return linkUpdateTime;
	}
	public void setLinkUpdateTime(String linkUpdateTime) {
		this.linkUpdateTime = linkUpdateTime;
	}
	public String getLinkConding() {
		return linkConding;
	}
	public void setLinkConding(String linkConding) {
		this.linkConding = linkConding;
	}
	public String getLinkWorkphone() {
		return linkWorkphone;
	}
	public void setLinkWorkphone(String linkWorkphone) {
		this.linkWorkphone = linkWorkphone;
	}
	public String getLinkHomephone() {
		return linkHomephone;
	}
	public void setLinkHomephone(String linkHomephone) {
		this.linkHomephone = linkHomephone;
	}
	public String getLinkBirthdayDate() {
		return linkBirthdayDate;
	}
	public void setLinkBirthdayDate(String linkBirthdayDate) {
		this.linkBirthdayDate = linkBirthdayDate;
	}
	public String getLinkEmail() {
		return linkEmail;
	}
	public void setLinkEmail(String linkEmail) {
		this.linkEmail = linkEmail;
	}
	public Integer getLinkSid() {
		return linkSid;
	}
	public void setLinkSid(Integer linkSid) {
		this.linkSid = linkSid;
	}
	public Integer getLinkUpdateSid() {
		return linkUpdateSid;
	}
	public void setLinkUpdateSid(Integer linkUpdateSid) {
		this.linkUpdateSid = linkUpdateSid;
	}
	@Override
	public String toString() {
		return "LinkMan [linkId=" + linkId + ", linkName=" + linkName + ", linkSex=" + linkSex + ", linkPhone="
				+ linkPhone + ", linkAddress=" + linkAddress + ", linkRemark=" + linkRemark + ", linkCreateTime="
				+ linkCreateTime + ", linkUpdateTime=" + linkUpdateTime + ", linkConding=" + linkConding
				+ ", linkWorkphone=" + linkWorkphone + ", linkHomephone=" + linkHomephone + ", linkBirthdayDate="
				+ linkBirthdayDate + ", linkEmail=" + linkEmail + ", linkSid=" + linkSid + ", linkUpdateSid="
				+ linkUpdateSid + "]";
	}
	
	
}
