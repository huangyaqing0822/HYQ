package com.lxit.crmsystem.vo;

public class ViewOnlyIndent {
	private String clientName;
	private String datetime;
	private Integer id;
	private String namec;
	private Double price;
	private String type;
	private String types;

	public ViewOnlyIndent() {
	}

	public String getClientName() {
		return clientName;
	}

	public String getDatetime() {
		return datetime;
	}

	public Integer getId() {
		return id;
	}

	public String getNamec() {
		return namec;
	}

	public Double getPrice() {
		return price;
	}

	public String getType() {
		return type;
	}

	public String getTypes() {
		return types;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNamec(String namec) {
		this.namec = namec;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setTypes(String types) {
		this.types = types;
	}

	@Override
	public String toString() {
		return "ViewOnlyIndent [id=" + id + ", types=" + types + ", namec=" + namec + ", clientName=" + clientName + ", price="
				+ price + ", datetime=" + datetime + ", type=" + type + "]";
	}
}
