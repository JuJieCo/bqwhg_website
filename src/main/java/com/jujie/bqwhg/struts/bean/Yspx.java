package com.jujie.bqwhg.struts.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.jujie.bqwhg.model.utils.BaseBean;

public class Yspx extends BaseBean {

	private Integer yspxID;
	private String yspxTitle;
	private Integer yspxType;
	private String yspxContent;
	private Date subDate;
	private SysUser sysUser;
	private String hold;

	public Yspx() {
		this.sysUser = new SysUser();

	}

	public Integer getYspxID() {
		return yspxID;
	}

	public void setYspxID(Integer yspxID) {
		this.yspxID = yspxID;
	}

	public String getYspxTitle() {
		return yspxTitle;
	}

	public void setYspxTitle(String yspxTitle) {
		this.yspxTitle = yspxTitle;
	}

	public Integer getYspxType() {
		return yspxType;
	}

	public void setYspxType(Integer yspxType) {
		this.yspxType = yspxType;
	}

	public String getYspxContent() {
		return yspxContent;
	}

	public void setYspxContent(String yspxContent) {
		this.yspxContent = yspxContent;
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
		Yspx yspx = new Yspx();
		yspx.setYspxID(rst.getInt("yspx_id"));
		yspx.setYspxTitle(rst.getString("yspx_title"));
		yspx.setYspxType(rst.getInt("yspx_type"));
		yspx.setYspxContent(rst.getString("yspx_content"));
		
		yspx.setSubDate(rst.getDate("sub_date"));
		yspx.getSysUser().setUserID(rst.getInt("user_id"));
		yspx.setHold(rst.getString("hold"));
		return yspx;
	}

}
