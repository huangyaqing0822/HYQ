package com.lxit.crmsystem.entity;

/**
 * 客户关怀表
 * @author Administrator
 *
 */
public class ClientLoving {
	private int clId; //关怀表id
	private String clOpen; //开启提醒
	private String clReputationrank; // 信誉等级
	private String clLoveproject; //关怀方案
	private String clWarnname; // 提醒名称
	private int clWarntype; //提醒类型
	private String clWarntime; //提醒时间
	private int clRate; // 提醒频率
	private String clPeriod; //提醒周期
	private String clRemarkremind; //备注提醒信息
	private String clExecutiontime; // 备注执行时间
	private int clExecutionscheme; // 执行方案
	private int clExecutionresult; //执行结果
	private String clRemarkresult; //备注执行结果信息
	private int clUpdateSid; //操作人
	public int getClId() {
		return clId;
	}
	public void setClId(int clId) {
		this.clId = clId;
	}
	public String getClOpen() {
		return clOpen;
	}
	public void setClOpen(String clOpen) {
		this.clOpen = clOpen;
	}
	
	public String getClReputationrank() {
		return clReputationrank;
	}
	public void setClReputationrank(String clReputationrank) {
		this.clReputationrank = clReputationrank;
	}
	public String getClLoveproject() {
		return clLoveproject;
	}
	public void setClLoveproject(String clLoveproject) {
		this.clLoveproject = clLoveproject;
	}
	public String getClWarnname() {
		return clWarnname;
	}
	public void setClWarnname(String clWarnname) {
		this.clWarnname = clWarnname;
	}
	public int getClWarntype() {
		return clWarntype;
	}
	public void setClWarntype(int clWarntype) {
		this.clWarntype = clWarntype;
	}
	public String getClWarntime() {
		return clWarntime;
	}
	public void setClWarntime(String clWarntime) {
		this.clWarntime = clWarntime;
	}
	public int getClRate() {
		return clRate;
	}
	public void setClRate(int clRate) {
		this.clRate = clRate;
	}
	public String getClPeriod() {
		return clPeriod;
	}
	public void setClPeriod(String clPeriod) {
		this.clPeriod = clPeriod;
	}
	public String getClRemarkremind() {
		return clRemarkremind;
	}
	public void setClRemarkremind(String clRemarkremind) {
		this.clRemarkremind = clRemarkremind;
	}
	public String getClExecutiontime() {
		return clExecutiontime;
	}
	public void setClExecutiontime(String clExecutiontime) {
		this.clExecutiontime = clExecutiontime;
	}
	public int getClExecutionscheme() {
		return clExecutionscheme;
	}
	public void setClExecutionscheme(int clExecutionscheme) {
		this.clExecutionscheme = clExecutionscheme;
	}
	public int getClExecutionresult() {
		return clExecutionresult;
	}
	public void setClExecutionresult(int clExecutionresult) {
		this.clExecutionresult = clExecutionresult;
	}
	public String getClRemarkresult() {
		return clRemarkresult;
	}
	public void setClRemarkresult(String clRemarkresult) {
		this.clRemarkresult = clRemarkresult;
	}
	public int getClUpdateSid() {
		return clUpdateSid;
	}
	public void setClUpdateSid(int clUpdateSid) {
		this.clUpdateSid = clUpdateSid;
	}
	@Override
	public String toString() {
		return "ClientLoving [clId=" + clId + ", clOpen=" + clOpen + ", clReputationrank=" + clReputationrank
				+ ", clLoveproject=" + clLoveproject + ", clWarnname=" + clWarnname + ", clWarntype=" + clWarntype
				+ ", clWarntime=" + clWarntime + ", clRate=" + clRate + ", clPeriod=" + clPeriod + ", clRemarkremind="
				+ clRemarkremind + ", clExecutiontime=" + clExecutiontime + ", clExecutionscheme=" + clExecutionscheme
				+ ", clExecutionresult=" + clExecutionresult + ", clRemarkresult=" + clRemarkresult + ", clUpdateSid="
				+ clUpdateSid + "]";
	}	
}
