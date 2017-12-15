package com.lxit.crmsystem.vo;

public class MarketForecastVo {
	
	private Integer forecastId;  //销售预测Id
	private String forecastResultTitle;  //预测标题
	private String forecastMonth;  //预测月份
	private String forecastTypeValue;  //预测类型(个人，部门，整体)
	private String forecastText;  //文件里的内容
	private String forecastCreateTime;  //创建时间
	private String forecastUpdateTime;  //修改时间
	private String forecastUpdateSname;  //最后一次修改人
	private String departmentName;//部门name
	private String fc_departmentBig;//部门规模
	private String fc_departmentCount;//部门大小
   
	public MarketForecastVo(){
		
	}

	@Override
	public String toString() {
		return "MarketForecastVo [forecastId=" + forecastId + ", forecastResultTitle=" + forecastResultTitle
				+ ", forecastMonth=" + forecastMonth + ", forecastTypeValue=" + forecastTypeValue + ", forecastText="
				+ forecastText + ", forecastCreateTime=" + forecastCreateTime + ", forecastUpdateTime="
				+ forecastUpdateTime + ", forecastUpdateSname=" + forecastUpdateSname + ", departmentName="
				+ getDepartmentName() + ", fc_departmentBig=" + fc_departmentBig + ", fc_departmentCount="
				+ fc_departmentCount + "]";
	}
	public MarketForecastVo(Integer forecastId, String forecastResultTitle, String forecastMonth,
			String forecastTypeValue, String forecastText, String forecastCreateTime, String forecastUpdateTime,
			String forecastUpdateSname) {
		super();
		this.forecastId = forecastId;
		this.forecastResultTitle = forecastResultTitle;
		this.forecastMonth = forecastMonth;
		this.forecastTypeValue = forecastTypeValue;
		this.forecastText = forecastText;
		this.forecastCreateTime = forecastCreateTime;
		this.forecastUpdateTime = forecastUpdateTime;
		this.forecastUpdateSname = forecastUpdateSname;
	}

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

	public String getForecastTypeValue() {
		return forecastTypeValue;
	}

	public void setForecastTypeValue(String forecastTypeValue) {
		this.forecastTypeValue = forecastTypeValue;
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

	public String getForecastUpdateSname() {
		return forecastUpdateSname;
	}

	public void setForecastUpdateSname(String forecastUpdateSname) {
		this.forecastUpdateSname = forecastUpdateSname;
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



	public String getDepartmentName() {
		return departmentName;
	}



	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}
