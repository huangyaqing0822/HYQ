package com.lxit.crmsystem.entity;
/**
 * 基础信息
 * @author Administrator
 *
 */
public class BaseInfo {
	private int baseId;//基础信息ID
	private String baseDescribe;//参数描述
	private String baseKeywords;//参数关键字
	private String baseValue;//参数值
	private int baseCreateId;//创建人的ID
	private String baseUpdateTime;//最后一次修改时间
	private String baseCaeateTime;//创建时间
	private int baseUpdateSid;//最后一次修改这条数据的人
	private String baseRamrk;
	private String staffName;
	
	public String getStaffName() {
		return staffName;
	}

	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}

	public BaseInfo(){}
	
	public String getBaseRamrk() {
		return baseRamrk;
	}

	public void setBaseRamrk(String baseRamrk) {
		this.baseRamrk = baseRamrk;
	}

	public int getBaseId() {
		return baseId;
	}
	public void setBaseId(int baseId) {
		this.baseId = baseId;
	}
	public String getBaseDescribe() {
		return baseDescribe;
	}
	public void setBaseDescribe(String baseDescribe) {
		this.baseDescribe = baseDescribe;
	}
	public String getBaseKeywords() {
		return baseKeywords;
	}
	public void setBaseKeywords(String baseKeywords) {
		this.baseKeywords = baseKeywords;
	}
	public String getBaseValue() {
		return baseValue;
	}
	public void setBaseValue(String baseValue) {
		this.baseValue = baseValue;
	}
	public int getBaseCreateId() {
		return baseCreateId;
	}
	public void setBaseCreateId(int baseCreateId) {
		this.baseCreateId = baseCreateId;
	}
	public String getBaseUpdateTime() {
		return baseUpdateTime;
	}
	public void setBaseUpdateTime(String baseUpdateTime) {
		this.baseUpdateTime = baseUpdateTime;
	}
	public String getBaseCaeateTime() {
		return baseCaeateTime;
	}
	public void setBaseCaeateTime(String baseCaeateTime) {
		this.baseCaeateTime = baseCaeateTime;
	}
	public int getBaseUpdateSid() {
		return baseUpdateSid;
	}
	public void setBaseUpdateSid(int baseUpdateSid) {
		this.baseUpdateSid = baseUpdateSid;
	}
	@Override
	public String toString() {
		return "BaseInfo [baseId=" + baseId + ", baseDescribe=" + baseDescribe + ", baseKeywords=" + baseKeywords
				+ ", baseValue=" + baseValue + ", baseCreateId=" + baseCreateId + ", baseUpdateTime=" + baseUpdateTime
				+ ", baseCaeateTime=" + baseCaeateTime + ", baseUpdateSid=" + baseUpdateSid + "]";
	}
	
	
}
