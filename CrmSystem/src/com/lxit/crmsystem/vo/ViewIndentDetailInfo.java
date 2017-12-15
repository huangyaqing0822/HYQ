package com.lxit.crmsystem.vo;

public class ViewIndentDetailInfo {
	private String commodity;// 商品
	private String dentNumber;// 订单号
	private String downIndentDateTime;// 下单时间
	private Integer id;// 主键
	private Double indentPrice;// 订单金额
	private String state;// 状态
	private String takeMan;// 收货人

	public ViewIndentDetailInfo() {

	}

	public String getCommodity() {
		return commodity;
	}

	public String getDentNumber() {
		return dentNumber;
	}

	public String getDownIndentDateTime() {
		return downIndentDateTime;
	}

	public Integer getId() {
		return id;
	}

	public Double getIndentPrice() {
		return indentPrice;
	}

	public String getState() {
		return state;
	}

	public String getTakeMan() {
		return takeMan;
	}

	public void setCommodity(String commodity) {
		this.commodity = commodity;
	}

	public void setDentNumber(String dentNumber) {
		this.dentNumber = dentNumber;
	}

	public void setDownIndentDateTime(String downIndentDateTime) {
		this.downIndentDateTime = downIndentDateTime;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setIndentPrice(Double indentPrice) {
		this.indentPrice = indentPrice;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setTakeMan(String takeMan) {
		this.takeMan = takeMan;
	}

	@Override
	public String toString() {
		return "ViewIndentDetailInfo [id=" + id + ", dentNumber=" + dentNumber + ", commodity=" + commodity
				+ ", takeMan=" + takeMan + ", indentPrice=" + indentPrice + ", downIndentDateTime=" + downIndentDateTime
				+ ", state=" + state + "]";
	}
}
