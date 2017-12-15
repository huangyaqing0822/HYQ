package com.lxit.crmsystem.vo;

/**
 * 合同视图
 * 
 * @author Administrator
 *
 */
public class ViewContract {
	private String context;

	private String dai;

	private Integer id;

	private String jia;

	private String jiaqz;

	private Double price;

	private String remark;

	private String state;

	private String time;

	private String title;

	private String type;

	private String yi;

	private String yiqz;

	public String getContext() {
		return context;
	}

	public String getDai() {
		return dai;
	}

	public Integer getId() {
		return id;
	}

	public String getJia() {
		return jia;
	}

	public String getJiaqz() {
		return jiaqz;
	}

	public Double getPrice() {
		return price;
	}

	public String getRemark() {
		return remark;
	}

	public String getState() {
		return state;
	}

	public String getTime() {
		return time;
	}

	public String getTitle() {
		return title;
	}

	public String getType() {
		return type;
	}

	public String getYi() {
		return yi;
	}

	public String getYiqz() {
		return yiqz;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public void setDai(String dai) {
		this.dai = dai;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setJia(String jia) {
		this.jia = jia;
	}

	public void setJiaqz(String jiaqz) {
		this.jiaqz = jiaqz;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setYi(String yi) {
		this.yi = yi;
	}

	public void setYiqz(String yiqz) {
		this.yiqz = yiqz;
	}

	@Override
	public String toString() {
		return "ViewContract [price=" + price + ", jia=" + jia + ", yi=" + yi + ", yiqz=" + yiqz + ", jiaqz=" + jiaqz
				+ ", context=" + context + ", remark=" + remark + ", dai=" + dai + ", id=" + id + ", state=" + state
				+ ", time=" + time + ", title=" + title + ", type=" + type + "]";
	}
}
