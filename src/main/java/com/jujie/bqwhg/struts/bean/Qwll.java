package com.jujie.bqwhg.struts.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.jujie.bqwhg.model.utils.BaseBean;

public class Qwll extends BaseBean {

	private Integer qwllID;
	private String qwllTitle;
	private Integer qwllType;
	private String qwllContent;
	private Date subDate;
	private SysUser sysUser;
	private String hold;

	public Qwll() {
		this.sysUser = new SysUser();

	}

	public Integer getQwllID() {
		return qwllID;
	}

	public void setQwllID(Integer qwllID) {
		this.qwllID = qwllID;
	}

	public String getQwllTitle() {
		return qwllTitle;
	}

	public void setQwllTitle(String qwllTitle) {
		this.qwllTitle = qwllTitle;
	}

	public Integer getQwllType() {
		return qwllType;
	}

	public void setQwllType(Integer qwllType) {
		this.qwllType = qwllType;
	}

	public String getQwllContent() {
		return qwllContent;
	}

	public void setQwllContent(String qwllContent) {
		this.qwllContent = qwllContent;
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
		Qwll qwll = new Qwll();
		qwll.setQwllID(rst.getInt("qwll_id"));
		qwll.setQwllTitle(rst.getString("qwll_title"));
		qwll.setQwllType(rst.getInt("qwll_type"));
		qwll.setQwllContent(rst.getString("qwll_content"));
		
		qwll.setSubDate(rst.getDate("sub_date"));
		qwll.getSysUser().setUserID(rst.getInt("user_id"));
		qwll.setHold(rst.getString("hold"));
		return qwll;
	}

}
