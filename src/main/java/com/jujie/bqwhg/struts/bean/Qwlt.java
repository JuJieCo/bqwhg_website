package com.jujie.bqwhg.struts.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.jujie.bqwhg.model.utils.BaseBean;

public class Qwlt extends BaseBean {

	private Integer qwltID;
	private String qwltTitle;
	private Integer qwltType;
	private String qwltContent;
	private Date subDate;
	private SysUser sysUser;
	private String hold;

	public Qwlt() {
		this.sysUser = new SysUser();

	}

	public Integer getQwltID() {
		return qwltID;
	}

	public void setQwltID(Integer qwltID) {
		this.qwltID = qwltID;
	}

	public String getQwltTitle() {
		return qwltTitle;
	}

	public void setQwltTitle(String qwltTitle) {
		this.qwltTitle = qwltTitle;
	}

	public Integer getQwltType() {
		return qwltType;
	}

	public void setQwltType(Integer qwltType) {
		this.qwltType = qwltType;
	}

	public String getQwltContent() {
		return qwltContent;
	}

	public void setQwltContent(String qwltContent) {
		this.qwltContent = qwltContent;
	}

	public Date getSubDate() {
		return subDate;
	}

	public void setSubDate(Date subDate) {
		this.subDate = subDate;
	}

	public SysUser getSysUser() {
		return sysUser;
	}

	public void setSysUser(SysUser sysUser) {
		this.sysUser = sysUser;
	}

	public String getHold() {
		return hold;
	}

	public void setHold(String hold) {
		this.hold = hold;
	}

	@Override
	public Object mapRow(ResultSet rst, int rowNum) throws SQLException {
		Qwlt qwlt = new Qwlt();
		qwlt.setQwltID(rst.getInt("qwlt_id"));
		qwlt.setQwltTitle(rst.getString("qwlt_title"));
		qwlt.setQwltType(rst.getInt("qwlt_type"));
		qwlt.setQwltContent(rst.getString("qwlt_content"));
		
		qwlt.setSubDate(rst.getDate("sub_date"));
		qwlt.getSysUser().setUserID(rst.getInt("user_id"));
		qwlt.setHold(rst.getString("hold"));
		return qwlt;
	}

}
