package com.lxit.crmsystem.entity;

import java.io.Serializable;

public class Clientsatisfied implements Serializable{

	/**客户满意度
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int csId;//客户满意度ID
	private String csCreateTime;//创建时间
	private String csUpdateTime;//最后一次修改时间
	private int csClientId;//客户ID
	private String csMydegree;//客户满意度
	private String csSurveyTime;//调查时间
	private int csFwdegree;//服务满意度
	private int csZtdegree;//总体满意度
	private int csXjbdegree;//性价比满意度
	private String csFeedback;//客户反馈
	private int csSid; //操作人
	public int getCsId() {
		return csId;
	}
	public void setCsId(int csId) {
		this.csId = csId;
	}
	public String getCsCreateTime() {
		return csCreateTime;
	}
	public void setCsCreateTime(String csCreateTime) {
		this.csCreateTime = csCreateTime;
	}
	public String getCsUpdateTime() {
		return csUpdateTime;
	}
	public void setCsUpdateTime(String csUpdateTime) {
		this.csUpdateTime = csUpdateTime;
	}
	public int getCsClientId() {
		return csClientId;
	}
	public void setCsClientId(int csClientId) {
		this.csClientId = csClientId;
	}
	public String getCsMydegree() {
		return csMydegree;
	}
	public void setCsMydegree(String csMydegree) {
		this.csMydegree = csMydegree;
	}
	public String getCsSurveyTime() {
		return csSurveyTime;
	}
	public void setCsSurveyTime(String csSurveyTime) {
		this.csSurveyTime = csSurveyTime;
	}
	public int getCsFwdegree() {
		return csFwdegree;
	}
	public void setCsFwdegree(int csFwdegree) {
		this.csFwdegree = csFwdegree;
	}
	public int getCsZtdegree() {
		return csZtdegree;
	}
	public void setCsZtdegree(int csZtdegree) {
		this.csZtdegree = csZtdegree;
	}
	public int getCsXjbdegree() {
		return csXjbdegree;
	}
	public void setCsXjbdegree(int csXjbdegree) {
		this.csXjbdegree = csXjbdegree;
	}
	public String getCsFeedback() {
		return csFeedback;
	}
	public void setCsFeedback(String csFeedback) {
		this.csFeedback = csFeedback;
	}
	public int getCsSid() {
		return csSid;
	}
	public void setCsSid(int csSid) {
		this.csSid = csSid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "Clientsatisfied [csId=" + csId + ", csCreateTime=" + csCreateTime + ", csUpdateTime=" + csUpdateTime
				+ ", csClientId=" + csClientId + ", csMydegree=" + csMydegree + ", csSurveyTime=" + csSurveyTime
				+ ", csFwdegree=" + csFwdegree + ", csZtdegree=" + csZtdegree + ", csXjbdegree=" + csXjbdegree
				+ ", csFeedback=" + csFeedback + ", csSid=" + csSid + "]";
	}

}
