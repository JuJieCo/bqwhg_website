package com.jujie.bqwhg.struts.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.jujie.bqwhg.model.utils.BaseBean;

public class Qwzc extends BaseBean {

	private Integer qwzcID;
	private String qwzcTitle;
	private Integer qwzcType;
	private String qwzcContent;
	private Date subDate;
	private SysUser sysUser;
	private String hold;

	public Qwzc() {
		this.sysUser = new SysUser();

	}

	public Integer getQwzcID() {
		return qwzcID;
	}

	public void setQwzcID(Integer qwzcID) {
		this.qwzcID = qwzcID;
	}

	public String getQwzcTitle() {
		return qwzcTitle;
	}

	public void setQwzcTitle(String qwzcTitle) {
		this.qwzcTitle = qwzcTitle;
	}

	public Integer getQwzcType() {
		return qwzcType;
	}

	public void setQwzcType(Integer qwzcType) {
		this.qwzcType = qwzcType;
	}

	public String getQwzcContent() {
		return qwzcContent;
	}

	public void setQwzcContent(String qwzcContent) {
		this.qwzcContent = qwzcContent;
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
		Qwzc qwzc = new Qwzc();
		qwzc.setQwzcID(rst.getInt("qwzc_id"));
		qwzc.setQwzcTitle(rst.getString("qwzc_title"));
		qwzc.setQwzcType(rst.getInt("qwzc_type"));
		qwzc.setQwzcContent(rst.getString("qwzc_content"));
		
		qwzc.setSubDate(rst.getDate("sub_date"));
		qwzc.getSysUser().setUserID(rst.getInt("user_id"));
		qwzc.setHold(rst.getString("hold"));
		return qwzc;
	}

}
