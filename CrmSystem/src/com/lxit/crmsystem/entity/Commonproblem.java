package com.lxit.crmsystem.entity;

import java.io.Serializable;

public class Commonproblem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 常见问题类
	 */
	private int cpId;//常见问题ID
	private String cpTitle;//常见问题标题
	private int cpType;//常见问题类型
	private int cpCreateSid;//创建人
	private String cpUpdateTime;//最后修改的时间
	private String cpAnswer;//答复要点
	private String cpRemark;//备注
	private String cpTypeName;//类型名称
	private String cpCreateName;//创建人姓名
	public int getCpId() {
		return cpId;
	}
	public void setCpId(int cpId) {
		this.cpId = cpId;
	}
	public String getCpTitle() {
		return cpTitle;
	}
	public void setCpTitle(String cpTitle) {
		this.cpTitle = cpTitle;
	}
	public int getCpType() {
		return cpType;
	}
	public void setCpType(int cpType) {
		this.cpType = cpType;
	}
	public int getCpCreateSid() {
		return cpCreateSid;
	}
	public void setCpCreateSid(int cpCreateSid) {
		this.cpCreateSid = cpCreateSid;
	}
	public String getCpUpdateTime() {
		return cpUpdateTime;
	}
	public void setCpUpdateTime(String cpUpdateTime) {
		this.cpUpdateTime = cpUpdateTime;
	}
	
	public String getCpAnswer() {
		return cpAnswer;
	}
	public void setCpAnswer(String cpAnswer) {
		this.cpAnswer = cpAnswer;
	}
	public String getCpRemark() {
		return cpRemark;
	}
	public void setCpRemark(String cpRemark) {
		this.cpRemark = cpRemark;
	}
	public String getCpTypeName() {
		return cpTypeName;
	}
	public void setCpTypeName(String cpTypeName) {
		this.cpTypeName = cpTypeName;
	}
	public String getCpCreateName() {
		return cpCreateName;
	}
	public void setCpCreateName(String cpCreateName) {
		this.cpCreateName = cpCreateName;
	}
	public Commonproblem() {
	}
	@Override
	public String toString() {
		return "Commonproblem [cpId=" + cpId + ", cpTitle=" + cpTitle + ", cpType=" + cpType + ", cpCreateSid="
				+ cpCreateSid + ", cpUpdateTime=" + cpUpdateTime + ", cpAnswer=" + cpAnswer + ", cpRemark=" + cpRemark
				+ ", cpTypeName=" + cpTypeName + ", cpCreateName=" + cpCreateName + "]";
	}
	
	

}
