package com.lxit.crmsystem.vo;

/**
 * 客户关怀表
 * @author Administrator
 *
 */
public class ClientLovingVo {
	private int clientId; //关怀表id
	private String clOpen; //开启提醒
	private String clReputationrank; // 信誉等级
	private String clLoveproject; //关怀方案
	
	private String clWarnname; // 提醒名称
	private String clWarntype; //提醒类型
	private String clWarntime; //提醒时间
	private String clRate; // 提醒频率
	
	private String clPeriod; //提醒周期
	private String clRemarkremind; //备注提醒信息
	private String clExecutiontime; // 备注执行时间
	private String clExecutionscheme; // 执行方案
	private String clExecutionresult; //执行结果
	private String clRemarkresult; //备注执行结果信息
	private int clUpdateSid; //操作人
	
	
	
	private String clientName;//客户姓名
	private String clientSex;//客户性别
    private String clientType;//客户类型
    private int clientLv;//价值等级
    private int csZtdegree; //满意度	
	
    private String clientBirthday;//生日
    private String clientState; //状态
    
    
    
	public int getClientId() {
		return clientId;
	}
	public void setClientId(int clientId) {
		this.clientId = clientId;
	}
	public String getClientBirthday() {
		return clientBirthday;
	}
	public void setClientBirthday(String clientBirthday) {
		this.clientBirthday = clientBirthday;
	}
	public String getClientState() {
		return clientState;
	}
	public void setClientState(String clientState) {
		this.clientState = clientState;
	}
	public int getClentId() {
		return clientId;
	}
	public void setClentId(int clentId) {
		this.clientId = clentId;
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
	
	public String getClWarntype() {
		return clWarntype;
	}
	public void setClWarntype(String clWarntype) {
		this.clWarntype = clWarntype;
	}
	public String getClWarntime() {
		return clWarntime;
	}
	public void setClWarntime(String clWarntime) {
		this.clWarntime = clWarntime;
	}
	
	public String getClRate() {
		return clRate;
	}
	public void setClRate(String clRate) {
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
	
	public String getClExecutionscheme() {
		return clExecutionscheme;
	}
	public void setClExecutionscheme(String clExecutionscheme) {
		this.clExecutionscheme = clExecutionscheme;
	}
	public String getClExecutionresult() {
		return clExecutionresult;
	}
	public void setClExecutionresult(String clExecutionresult) {
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
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientSex() {
		return clientSex;
	}
	public void setClientSex(String clientSex) {
		this.clientSex = clientSex;
	}
	public String getClientType() {
		return clientType;
	}
	public void setClientType(String clientType) {
		this.clientType = clientType;
	}
	public int getClientLv() {
		return clientLv;
	}
	public void setClientLv(int clientLv) {
		this.clientLv = clientLv;
	}
	public int getCsZtdegree() {
		return csZtdegree;
	}
	public void setCsZtdegree(int csZtdegree) {
		this.csZtdegree = csZtdegree;
	}
	@Override
	public String toString() {
		return "ClientLovingVo [clientId=" + clientId + ", clOpen=" + clOpen + ", clReputationrank=" + clReputationrank
				+ ", clLoveproject=" + clLoveproject + ", clWarnname=" + clWarnname + ", clWarntype=" + clWarntype
				+ ", clWarntime=" + clWarntime + ", clRate=" + clRate + ", clPeriod=" + clPeriod + ", clRemarkremind="
				+ clRemarkremind + ", clExecutiontime=" + clExecutiontime + ", clExecutionscheme=" + clExecutionscheme
				+ ", clExecutionresult=" + clExecutionresult + ", clRemarkresult=" + clRemarkresult + ", clUpdateSid="
				+ clUpdateSid + ", clientName=" + clientName + ", clientSex=" + clientSex + ", clientType=" + clientType
				+ ", clientLv=" + clientLv + ", csZtdegree=" + csZtdegree + "]";
	}
	
  
	
}
