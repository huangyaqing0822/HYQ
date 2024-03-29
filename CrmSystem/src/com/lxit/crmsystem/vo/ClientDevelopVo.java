package com.lxit.crmsystem.vo;
/**
 * 发展计划表
 * @author Administrator
 *
 */
public class ClientDevelopVo {
	
	private int cdId;//客户发展计划id
	private String cdPlanCoding;//计划编码
	private String cdName;//客户姓名
	private String cdMonth;//计划月份
	private String cdCreateTime;//创建时间
	private String cdUpdateTime;//修改时间
	private String cdPlanContent; //计划内容
	private String cdUpdateSid;//最后一次修改人
	
	public ClientDevelopVo(){
		
	}

	public int getCdId() {
		return cdId;
	}

	public void setCdId(int cdId) {
		this.cdId = cdId;
	}

	public String getCdPlanCoding() {
		return cdPlanCoding;
	}

	public void setCdPlanCoding(String cdPlanCoding) {
		this.cdPlanCoding = cdPlanCoding;
	}

	public String getCdName() {
		return cdName;
	}

	public void setCdName(String cdName) {
		this.cdName = cdName;
	}

	public String getCdMonth() {
		return cdMonth;
	}

	public void setCdMonth(String cdMonth) {
		this.cdMonth = cdMonth;
	}

	public String getCdCreateTime() {
		return cdCreateTime;
	}

	public void setCdCreateTime(String cdCreateTime) {
		this.cdCreateTime = cdCreateTime;
	}

	public String getCdUpdateTime() {
		return cdUpdateTime;
	}

	public void setCdUpdateTime(String cdUpdateTime) {
		this.cdUpdateTime = cdUpdateTime;
	}

	public String getCdPlanContent() {
		return cdPlanContent;
	}

	public void setCdPlanContent(String cdPlanContent) {
		this.cdPlanContent = cdPlanContent;
	}

	public String getCdUpdateSid() {
		return cdUpdateSid;
	}

	public void setCdUpdateSid(String cdUpdateSid) {
		this.cdUpdateSid = cdUpdateSid;
	}

	@Override
	public String toString() {
		return "ClientDevelopVo [cdId=" + cdId + ", cdPlanCoding=" + cdPlanCoding + ", cdName=" + cdName + ", cdMonth="
				+ cdMonth + ", cdCreateTime=" + cdCreateTime + ", cdUpdateTime=" + cdUpdateTime + ", cdPlanContent="
				+ cdPlanContent + ", cdUpdateSid=" + cdUpdateSid + "]";
	}
}
