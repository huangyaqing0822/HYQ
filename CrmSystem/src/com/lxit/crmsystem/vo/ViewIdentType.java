package com.lxit.crmsystem.vo;

public class ViewIdentType {
	private String code;
	private Integer id;
	private String value;

	public String getCode() {
		return code;
	}

	public Integer getId() {
		return id;
	}

	public String getValue() {
		return value;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ViewIdentType [code=" + code + ", id=" + id + ", value=" + value + "]";
	}

}
