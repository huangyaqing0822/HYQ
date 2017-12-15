package com.lxit.crmsystem.entity;
/**
 * 竞争管理表
 * @author Administrator
 *
 */
public class CompeteManage {
	
	private int competId;
	private String competTitle;//竞争分析结果标题
	private String competResult;//竞争结果
	private int competType;//类型
	private int competState;//状态
	private String competCreateTime;//创建时间
	private String competUpdateTime;//修改时间
	private int competSid;//操作人
	private int competUpdateSid;//最后一次修改人
	
	public CompeteManage(){
		
	}

	@Override
	public String toString() {
		return "CompeteManage [competId=" + competId + ", competResult=" + competResult + ", competType=" + competType
				+ ", competState=" + competState + ", competCreateTime=" + competCreateTime + ", competUpdateTime="
				+ competUpdateTime + ", competSid=" + competSid + ", competUpdateSid=" + competUpdateSid + "]";
	}

	public int getCompetId() {
		return competId;
	}

	public void setCompetId(int competId) {
		this.competId = competId;
	}

	public String getCompetResult() {
		return competResult;
	}

	public void setCompetResult(String competResult) {
		this.competResult = competResult;
	}

	public int getCompetType() {
		return competType;
	}

	public void setCompetType(int competType) {
		this.competType = competType;
	}

	public int getCompetState() {
		return competState;
	}

	public void setCompetState(int competState) {
		this.competState = competState;
	}

	public String getCompetCreateTime() {
		return competCreateTime;
	}

	public void setCompetCreateTime(String competCreateTime) {
		this.competCreateTime = competCreateTime;
	}

	public String getCompetUpdateTime() {
		return competUpdateTime;
	}

	public void setCompetUpdateTime(String competUpdateTime) {
		this.competUpdateTime = competUpdateTime;
	}

	public int getCompetSid() {
		return competSid;
	}

	public void setCompetSid(int competSid) {
		this.competSid = competSid;
	}

	public int getCompetUpdateSid() {
		return competUpdateSid;
	}

	public void setCompetUpdateSid(int competUpdateSid) {
		this.competUpdateSid = competUpdateSid;
	}

	public String getCompetTitle() {
		return competTitle;
	}

	public void setCompetTitle(String competTitle) {
		this.competTitle = competTitle;
	}
    
	
	
	
	

}
