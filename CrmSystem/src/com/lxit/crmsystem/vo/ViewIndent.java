package com.lxit.crmsystem.vo;

public class ViewIndent {
	private Integer consumption;// 消费次数
	private Integer id;// 客户id
	private String name;// 客户名字
	private String phone;//电话
	private String sex;// 性别
	private String state;//状态
	private Double sum;// 消费总金额
	private String type;// 类型
	private String withs;// 代表

	public Integer getConsumption() {
		return consumption;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

	public String getSex() {
		return sex;
	}

	public String getState() {
		return state;
	}

	public Double getSum() {
		return sum;
	}

	public String getType() {
		return type;
	}

	public String getWiths() {
		return withs;
	}

	public void setConsumption(Integer consumption) {
		this.consumption = consumption;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setWiths(String with) {
		this.withs = with;
	}

	@Override
	public String toString() {
		return "ViewIndent [consumption=" + consumption + ", id=" + id + ", name=" + name + ", sex=" + sex + ", state="
				+ state + ", sum=" + sum + ", type=" + type + ", withs=" + withs + "]";
	}
}
