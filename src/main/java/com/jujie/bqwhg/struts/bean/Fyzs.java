package com.jujie.bqwhg.struts.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.jujie.bqwhg.model.utils.BaseBean;

public class Fyzs extends BaseBean {

	private Integer fyzsID;
	private String fyzsTitle;
	private Integer fyzsType;
	private String fyzsContent;
	private Date subDate;
	private SysUser sysUser;
	private String hold;

	public Fyzs() {
		this.sysUser = new SysUser();

	}

	public Integer getFyzsID() {
		return fyzsID;
	}

	public void setFyzsID(Integer fyzsID) {
		this.fyzsID = fyzsID;
	}

	public String getFyzsTitle() {
		return fyzsTitle;
	}

	public void setFyzsTitle(String fyzsTitle) {
		this.fyzsTitle = fyzsTitle;
	}

	public Integer getFyzsType() {
		return fyzsType;
	}

	public void setFyzsType(Integer fyzsType) {
		this.fyzsType = fyzsType;
	}

	public String getFyzsContent() {
		return fyzsContent;
	}

	public void setFyzsContent(String fyzsContent) {
		this.fyzsContent = fyzsContent;
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
		Fyzs fyzs = new Fyzs();
		fyzs.setFyzsID(rst.getInt("fyzs_id"));
		fyzs.setFyzsTitle(rst.getString("fyzs_title"));
		fyzs.setFyzsType(rst.getInt("fyzs_type"));
		fyzs.setFyzsContent(rst.getString("fyzs_content"));
		
		fyzs.setSubDate(rst.getDate("sub_date"));
		fyzs.getSysUser().setUserID(rst.getInt("user_id"));
		fyzs.setHold(rst.getString("hold"));
		return fyzs;
	}

}
