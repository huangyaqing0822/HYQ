package com.lxit.crmsystem.entity;//

/**
 * 
 * @author Administrator 订单类
 */
public class Indent {
	private Integer indentClientId;// 客户ID
	private Integer indentCount;// 购买数量
	private Double indentCountprice;// 总金额
	private Integer indentId;// 主键id
	private String indentInvoice;// 发票信息
	private String indentMod;// 配送方式
	private Integer indentShopID;// 商品id
	private Integer indentSid;// indent发货人
	private String indentType;// 库存状态

	public void setIndentType(String indentType) {
		this.indentType = indentType;
	}

	private Double indentYunfei;// 运费

	public Indent() {
	}

	public Integer getIndentClientId() {
		return indentClientId;
	}

	public Integer getIndentCount() {
		return indentCount;
	}

	public Double getIndentCountprice() {
		return indentCountprice;
	}

	public Integer getIndentId() {
		return indentId;
	}

	public String getIndentInvoice() {
		return indentInvoice;
	}

	public String getIndentMod() {
		return indentMod;
	}

	public Integer getIndentShopID() {
		return indentShopID;
	}

	public Integer getIndentSid() {
		return indentSid;
	}

	public Double getIndentYunfei() {
		return indentYunfei;
	}

	public void setIndentClientId(Integer indentClientId) {
		this.indentClientId = indentClientId;
	}

	public void setIndentCount(Integer indentCount) {
		this.indentCount = indentCount;
	}

	public void setIndentCountprice(Double indentCountprice) {
		this.indentCountprice = indentCountprice;
	}

	public void setIndentId(Integer indentId) {
		this.indentId = indentId;
	}

	public void setIndentInvoice(String indentInvoice) {
		this.indentInvoice = indentInvoice;
	}

	public void setIndentMod(String indentMod) {
		this.indentMod = indentMod;
	}

	public void setIndentShopID(Integer indentShopID) {
		this.indentShopID = indentShopID;
	}

	public void setIndentSid(Integer indentSid) {
		this.indentSid = indentSid;
	}

	public void setIndentYunfei(Double indentYunfei) {
		this.indentYunfei = indentYunfei;
	}

	@Override
	public String toString() {
		return "Indent [indentId=" + indentId + ", indentSid=" + indentSid + ", indentClientId=" + indentClientId
				+ ", indentCount=" + indentCount + ", indentType=" + indentType + ", indentShopID=" + indentShopID
				+ ", indentYunfei=" + indentYunfei + ", indentCountprice=" + indentCountprice + ", indentInvoice="
				+ indentInvoice + ", indentMod=" + indentMod + "]";
	}
}
