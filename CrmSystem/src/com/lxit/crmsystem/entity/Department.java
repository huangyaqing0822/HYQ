package com.lxit.crmsystem.entity;



/**
 * 部门包装类
 * @author Administrator
 *
 */
public class Department {
	private int departmentId;//部门Id
	private String departmentFallName;//部门名称
	private String departmentConding;//组织编码
	private String departmentEasyName;//部门简称
	private int departmentNid;//所属部门ID
	private String departmentIntro;//部门简介
	private String departmentRemark;//部门备注
	private String departmentCreateTime;//创建时间
	private String departmentUpdateTime;//最后一次修改时间
	private String departmentStandby;//备用字段
	private int departmentUpdateSid;//最后一次操作人
	private String staffName;
	

	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public Department(){}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentFallName() {
		return departmentFallName;
	}
	public void setDepartmentFallName(String departmentFallName) {
		this.departmentFallName = departmentFallName;
	}
	public String getDepartmentConding() {
		return departmentConding;
	}
	public void setDepartmentConding(String departmentConding) {
		this.departmentConding = departmentConding;
	}
	public String getDepartmentEasyName() {
		return departmentEasyName;
	}
	public void setDepartmentEasyName(String departmentEasyName) {
		this.departmentEasyName = departmentEasyName;
	}
	public int getDepartmentNid() {
		return departmentNid;
	}
	public void setDepartmentNid(int departmentNid) {
		this.departmentNid = departmentNid;
	}
	public String getDepartmentIntro() {
		return departmentIntro;
	}
	public void setDepartmentIntro(String departmentIntro) {
		this.departmentIntro = departmentIntro;
	}
	public String getDepartmentRemark() {
		return departmentRemark;
	}
	public void setDepartmentRemark(String departmentRemark) {
		this.departmentRemark = departmentRemark;
	}
	public String getDepartmentCreateTime() {
		return departmentCreateTime;
	}
	public void setDepartmentCreateTime(String departmentCreateTime) {
		this.departmentCreateTime = departmentCreateTime;
	}
	public String getDepartmentUpdateTime() {
		return departmentUpdateTime;
	}
	public void setDepartmentUpdateTime(String departmentUpdateTime) {
		this.departmentUpdateTime = departmentUpdateTime;
	}
	public String getDepartmentStandby() {
		return departmentStandby;
	}
	public void setDepartmentStandby(String departmentStandby) {
		this.departmentStandby = departmentStandby;
	}
	public int getDepartmentUpdateSid() {
		return departmentUpdateSid;
	}
	public void setDepartmentUpdateSid(int departmentUpdateSid) {
		this.departmentUpdateSid = departmentUpdateSid;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentFallName=" + departmentFallName
				+ ", departmentConding=" + departmentConding + ", departmentEasyName=" + departmentEasyName
				+ ", departmentNid=" + departmentNid + ", departmentIntro=" + departmentIntro + ", departmentRemark="
				+ departmentRemark + ", departmentCreateTime=" + departmentCreateTime + ", departmentUpdateTime="
				+ departmentUpdateTime + ", departmentStandby=" + departmentStandby + ", departmentUpdateSid="
				+ departmentUpdateSid + "]";
	}
	
	
}
