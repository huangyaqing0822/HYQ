package com.lxit.crmsystem.entity;//

/**
 * 
 * @author Administrator 合同类
 */
public class Contract {
	private String contractContent;// 合同内容
	private String contractCreateSid;// 这条数据创建人
	private String contractCreateTime;// 创建时间
	private Integer contractId;// 主键id
	private Double contractMoney;// 合同金额大于10000需要总监审核通过
	private String contractOwner;// 甲方单位
	private String contractOwnerlicence;// 甲方许可证
	private String contractRemark;// 备注
	private String contractSp;// 乙方单位
	private String contractSplicence;// 乙方许可证
	private String contractState;// 合同状态
	private String contractTitle;// 合同名称
	private Integer contractType;// 合同类型
	private String contractUpdateSid;// 最后一次修改人
	private String contractUpdateTime;// 最后修改时间
	private String contractWaithandle;// 待处理人
	public Contract() {
	}

	public String getContractContent() {
		return contractContent;
	}

	public String getContractCreateSid() {
		return contractCreateSid;
	}

	public String getContractCreateTime() {
		return contractCreateTime;
	}

	public Integer getContractId() {
		return contractId;
	}

	public Double getContractMoney() {
		return contractMoney;
	}

	public String getContractOwner() {
		return contractOwner;
	}

	public String getContractOwnerlicence() {
		return contractOwnerlicence;
	}

	public String getContractRemark() {
		return contractRemark;
	}

	public String getContractSp() {
		return contractSp;
	}

	public String getContractSplicence() {
		return contractSplicence;
	}

	public String getContractState() {
		return contractState;
	}

	public String getContractTitle() {
		return contractTitle;
	}

	public Integer getContractType() {
		return contractType;
	}

	public String getContractUpdateSid() {
		return contractUpdateSid;
	}

	public String getContractUpdateTime() {
		return contractUpdateTime;
	}

	public String getContractWaithandle() {
		return contractWaithandle;
	}

	public void setContractContent(String contractContent) {
		this.contractContent = contractContent;
	}

	public void setContractCreateSid(String contractCreateSid) {
		this.contractCreateSid = contractCreateSid;
	}

	public void setContractCreateTime(String contractCreateTime) {
		this.contractCreateTime = contractCreateTime;
	}

	public void setContractId(Integer contractId) {
		this.contractId = contractId;
	}

	public void setContractMoney(Double contractMoney) {
		this.contractMoney = contractMoney;
	}

	public void setContractOwner(String contractOwner) {
		this.contractOwner = contractOwner;
	}

	public void setContractOwnerlicence(String contractOwnerlicence) {
		this.contractOwnerlicence = contractOwnerlicence;
	}

	public void setContractRemark(String contractRemark) {
		this.contractRemark = contractRemark;
	}

	public void setContractSp(String contractSp) {
		this.contractSp = contractSp;
	}

	public void setContractSplicence(String contractSplicence) {
		this.contractSplicence = contractSplicence;
	}

	public void setContractState(String contractState) {
		this.contractState = contractState;
	}

	public void setContractTitle(String contractTitle) {
		this.contractTitle = contractTitle;
	}

	public void setContractType(Integer contractType) {
		this.contractType = contractType;
	}

	public void setContractUpdateSid(String contractUpdateSid) {
		this.contractUpdateSid = contractUpdateSid;
	}

	public void setContractUpdateTime(String contractUpdateTime) {
		this.contractUpdateTime = contractUpdateTime;
	}

	public void setContractWaithandle(String contractWaithandle) {
		this.contractWaithandle = contractWaithandle;
	}

	@Override
	public String toString() {
		return "Contract [contractId=" + contractId + ", contractType=" + contractType + ", contractTitle="
				+ contractTitle + ", contractState=" + contractState + ", contractCreateTime=" + contractCreateTime
				+ ", contractUpdateTime=" + contractUpdateTime + ", contractCreateSid=" + contractCreateSid
				+ ", contractUpdateSid=" + contractUpdateSid + ", contractWaithandle=" + contractWaithandle
				+ ", contractMoney=" + contractMoney + ", contractOwner=" + contractOwner + ", contractSp=" + contractSp
				+ ", contractOwnerlicence=" + contractOwnerlicence + ", contractSplicence=" + contractSplicence
				+ ", contractContent=" + contractContent + ", contractRemark=" + contractRemark + "]";
	}
}
