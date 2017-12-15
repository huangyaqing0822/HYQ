package com.lxit.crmsystem.entity;
/**
 * 客户表
 * @author Administrator
 *
 */
public class Client {
	
	private int clientId;//客户id
	private String clientName;//客户姓名
	private String clientSex;//客户性别
    private int clientType;//客户类型
    private int clientState;//客户状态
    private int clientAssignstate;//分配状态
    private String clientCreateTime;//创建时间
    private String clientUpdateTime;//修改时间
    private int clientSid;//录入人
    private int clientUpdateSid;//最后一次修改人id
    private String clientPhone;//客户电话
    private String clientWorkphone;//办公电话
    private String clientHomephone;//家庭电话
    private String clientAddress;//联系地址
    private String clientRemark;//客户备注
    private String clientEmail;//邮箱
    private int clientAllot;//客户资源分配员工Id
    private int clientLv;//客户价值等级
    private int clientServid;//备注
    private String clientBirthday;//生日
    private String clientCoding;//客户编码
    
    public Client(){
    	
    }
    
	@Override
	public String toString() {
		return "Client [clientId=" + clientId + ", clientName=" + clientName + ", clientSex=" + clientSex
				+ ", clientType=" + clientType + ", clientState=" + clientState + ", clientAssignstate="
				+ clientAssignstate + ", clientCreateTime=" + clientCreateTime + ", clientUpdateTime="
				+ clientUpdateTime + ", clientSid=" + clientSid + ", clientUpdateSid=" + clientUpdateSid
				+ ", clientPhone=" + clientPhone + ", clientWorkphone=" + clientWorkphone + ", clientHomephone="
				+ clientHomephone + ", clientAddress=" + clientAddress + ", clientRemark=" + clientRemark
				+ ", clientEmail=" + clientEmail + ", clientAllot=" + clientAllot + ", clientLv=" + clientLv
				+ ", clientServid=" + clientServid + ", clientBirthday=" + clientBirthday + ", clientCoding="
				+ clientCoding + "]";
	}


	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientSex() {
		return clientSex;
	}

	public void setClientSex(String clientSex) {
		this.clientSex = clientSex;
	}

	public int getClientType() {
		return clientType;
	}

	public void setClientType(int clientType) {
		this.clientType = clientType;
	}

	public int getClientState() {
		return clientState;
	}

	public void setClientState(int clientState) {
		this.clientState = clientState;
	}

	public int getClientAssignstate() {
		return clientAssignstate;
	}

	public void setClientAssignstate(int clientAssignstate) {
		this.clientAssignstate = clientAssignstate;
	}

	public String getClientCreateTime() {
		return clientCreateTime;
	}

	public void setClientCreateTime(String clientCreateTime) {
		this.clientCreateTime = clientCreateTime;
	}

	public String getClientUpdateTime() {
		return clientUpdateTime;
	}

	public void setClientUpdateTime(String clientUpdateTime) {
		this.clientUpdateTime = clientUpdateTime;
	}

	public int getClientSid() {
		return clientSid;
	}

	public void setClientSid(int clientSid) {
		this.clientSid = clientSid;
	}

	public int getClientUpdateSid() {
		return clientUpdateSid;
	}

	public void setClientUpdateSid(int clientUpdateSid) {
		this.clientUpdateSid = clientUpdateSid;
	}

	public String getClientPhone() {
		return clientPhone;
	}

	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}

	public String getClientWorkphone() {
		return clientWorkphone;
	}

	public void setClientWorkphone(String clientWorkphone) {
		this.clientWorkphone = clientWorkphone;
	}

	public String getClientHomephone() {
		return clientHomephone;
	}

	public void setClientHomephone(String clientHomephone) {
		this.clientHomephone = clientHomephone;
	}

	public String getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(String clientAddress) {
		this.clientAddress = clientAddress;
	}

	public String getClientRemark() {
		return clientRemark;
	}

	public void setClientRemark(String clientRemark) {
		this.clientRemark = clientRemark;
	}

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public int getClientAllot() {
		return clientAllot;
	}

	public void setClientAllot(int clientAllot) {
		this.clientAllot = clientAllot;
	}

	public int getClientLv() {
		return clientLv;
	}

	public void setClientLv(int clientLv) {
		this.clientLv = clientLv;
	}
	public int getClientServid() {
		return clientServid;
	}
	public void setClientServid(int clientServid) {
		this.clientServid = clientServid;
	}
	public String getClientBirthday() {
		return clientBirthday;
	}
	public void setClientBirthday(String clientBirthday) {
		this.clientBirthday = clientBirthday;
	}
	public String getClientCoding() {
		return clientCoding;
	}
	public void setClientCoding(String clientCoding) {
		this.clientCoding = clientCoding;
	}
    
}
