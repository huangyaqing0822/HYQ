package com.lxit.crmsystem.vo;

public class IndentCpp {
	private Integer cid;
	private Integer cpcount;
	private Integer inid;

	@Override
	public int hashCode()// 重写
	{
		return cid.hashCode() + inid;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			System.out.println("true");
			return true;
		}
		if ((obj == null) || (obj.getClass() != this.getClass())) {
			System.out.println("false");
			return false;
		}
		if (cid == ((IndentCpp) obj).cid && cid == ((IndentCpp) obj).cid) {
			return true;
		} else {
			return false;
		}
	}

	public Integer getCid() {
		return cid;
	}

	public Integer getCpcount() {
		return cpcount;
	}

	public Integer getInid() {
		return inid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public void setCpcount(Integer cpcount) {
		this.cpcount = cpcount;
	}

	public void setInid(Integer inid) {
		this.inid = inid;
	}

	@Override
	public String toString() {
		return "IndentCpp [inid=" + inid + ", cid=" + cid + ", cpcount=" + cpcount + "]";
	}
}
