package com.lxit.crmsystem.entity;

/**
 * @author Administrator
 * 销售预测表
 *
 */
public class MarketForecast {
	private Integer forecastId;  //销售预测Id
	private String forecastResultTitle;  //预测标题
	private String forecastMonth;  //预测月份
	private Integer forecastType;  //预测类型(个人，部门，整体)
	private String forecastText;  //文件里的内容
	private String forecastCreateTime;  //创建时间
	private String forecastUpdateTime;  //修改时间
	private Integer forecastUpdateSid;  //最后一次修改人
	private int departmentId;//部门id
	private String fc_departmentBig;//部门规模
	private String fc_departmentCount;//部门人数 
	
	public Integer getForecastId() {
		return forecastId;
	}
	public void setForecastId(Integer forecastId) {
		this.forecastId = forecastId;
	}
	public String getForecastResultTitle() {
		return forecastResultTitle;
	}
	public void setForecastResultTitle(String forecastResultTitle) {
		this.forecastResultTitle = forecastResultTitle;
	}
	public String getForecastMonth() {
		return forecastMonth;
	}
	public void setForecastMonth(String forecastMonth) {
		this.forecastMonth = forecastMonth;
	}
	public Integer getForecastType() {
		return forecastType;
	}
	public void setForecastType(Integer forecastType) {
		this.forecastType = forecastType;
	}
	public String getForecastText() {
		return forecastText;
	}
	public void setForecastText(String forecastText) {
		this.forecastText = forecastText;
	}
	public String getForecastCreateTime() {
		return forecastCreateTime;
	}
	public void setForecastCreateTime(String forecastCreateTime) {
		this.forecastCreateTime = forecastCreateTime;
	}
	public String getForecastUpdateTime() {
		return forecastUpdateTime;
	}
	public void setForecastUpdateTime(String forecastUpdateTime) {
		this.forecastUpdateTime = forecastUpdateTime;
	}
	public Integer getForecastUpdateSid() {
		return forecastUpdateSid;
	}
	public void setForecastUpdateSid(Integer forecastUpdateSid) {
		this.forecastUpdateSid = forecastUpdateSid;
	}
	@Override
	public String toString() {
		return "MarketForecast [forecastId=" + forecastId + ", forecastResultTitle=" + forecastResultTitle
				+ ", forecastMonth=" + forecastMonth + ", forecastType=" + forecastType + ", forecastText="
				+ forecastText + ", forecastCreateTime=" + forecastCreateTime + ", forecastUpdateTime="
				+ forecastUpdateTime + ", forecastUpdateSid=" + forecastUpdateSid + "]";
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getFc_departmentBig() {
		return fc_departmentBig;
	}
	public void setFc_departmentBig(String fc_departmentBig) {
		this.fc_departmentBig = fc_departmentBig;
	}
	public String getFc_departmentCount() {
		return fc_departmentCount;
	}
	public void setFc_departmentCount(String fc_departmentCount) {
		this.fc_departmentCount = fc_departmentCount;
	}
	
	
}
