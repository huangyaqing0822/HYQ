package com.lxit.crmsystem.entity;//

/**
 * 
 * @author Administrator 公司产品类
 */
public class CompanyProduct {
	private String cppCoding;// 型号
	private Integer cppCount;// 数量
	private Integer cppId;// 公司产品id
	private Double cppPrice;// 单价
	private String name;// 名称

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CompanyProduct() {
	}

	public String getCppCoding() {
		return cppCoding;
	}

	public Integer getCppCount() {
		return cppCount;
	}

	public Integer getCppId() {
		return cppId;
	}

	public Double getCppPrice() {
		return cppPrice;
	}

	public void setCppCoding(String cppCoding) {
		this.cppCoding = cppCoding;
	}

	public void setCppCount(Integer cppCount) {
		this.cppCount = cppCount;
	}

	public void setCppId(Integer cppId) {
		this.cppId = cppId;
	}

	public void setCppPrice(Double cppPrice) {
		this.cppPrice = cppPrice;
	}

	@Override
	public String toString() {
		return "CompanyProduct [cppId=" + cppId + ", cppCoding=" + cppCoding + ", cppPrice=" + cppPrice + ", cppCount="
				+ cppCount + "]";
	}
}
