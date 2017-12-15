package com.lxit.crmsystem.entity;

/**
 * @author Administrator
 *	数据字典
 */
public class DataDictionary {
	private Integer dataId;  //数据字典ID
	private String dataCode;  //数据代码
	private String dataName;  //数据字段名称
	private String dataValue;  //数据值
	private String dataCreateTime;  //创建时间
	private String dataUpdateTime;  //修改时间
	private Integer dataSid;  //操作人
	private String dataRemark;
	private String staffName;
	
	public String getDataRemark() {
		return dataRemark;
	}
	public void setDataRemark(String dataRemark) {
		this.dataRemark = dataRemark;
	}
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	public Integer getDataId() {
		return dataId;
	}
	public void setDataId(Integer dataId) {
		this.dataId = dataId;
	}
	public String getDataCode() {
		return dataCode;
	}
	public void setDataCode(String dataCode) {
		this.dataCode = dataCode;
	}
	public String getDataName() {
		return dataName;
	}
	public void setDataName(String dataName) {
		this.dataName = dataName;
	}
	public String getDataValue() {
		return dataValue;
	}
	public void setDataValue(String dataValue) {
		this.dataValue = dataValue;
	}
	public String getDataCreateTime() {
		return dataCreateTime;
	}
	public void setDataCreateTime(String dataCreateTime) {
		this.dataCreateTime = dataCreateTime;
	}
	public String getDataUpdateTime() {
		return dataUpdateTime;
	}
	public void setDataUpdateTime(String dataUpdateTime) {
		this.dataUpdateTime = dataUpdateTime;
	}
	public Integer getDataSid() {
		return dataSid;
	}
	public void setDataSid(Integer dataSid) {
		this.dataSid = dataSid;
	}
	@Override
	public String toString() {
		return "DataDictionary [dataId=" + dataId + ", dataCode=" + dataCode + ", dataName=" + dataName + ", dataValue="
				+ dataValue + ", dataCreateTime=" + dataCreateTime + ", dataUpdateTime=" + dataUpdateTime + ", dataSid="
				+ dataSid + "]";
	}
	
	
	
}
