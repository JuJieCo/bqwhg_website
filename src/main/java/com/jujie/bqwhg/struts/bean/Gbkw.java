package com.jujie.bqwhg.struts.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.jujie.bqwhg.model.utils.BaseBean;

public class Gbkw extends BaseBean {

	private Integer gbkwID;
	private String gbkwTitle;
	private Integer gbkwType;
	private String gbkwContent;
	private Date subDate;
	private SysUser sysUser;
	private String hold;

	public Gbkw() {
		this.sysUser = new SysUser();

	}

	public Integer getGbkwID() {
		return gbkwID;
	}

	public void setGbkwID(Integer gbkwID) {
		this.gbkwID = gbkwID;
	}

	public String getGbkwTitle() {
		return gbkwTitle;
	}

	public void setGbkwTitle(String gbkwTitle) {
		this.gbkwTitle = gbkwTitle;
	}

	public Integer getGbkwType() {
		return gbkwType;
	}

	public void setGbkwType(Integer gbkwType) {
		this.gbkwType = gbkwType;
	}

	public String getGbkwContent() {
		return gbkwContent;
	}

	public void setGbkwContent(String gbkwContent) {
		this.gbkwContent = gbkwContent;
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
		Gbkw gbkw = new Gbkw();
		gbkw.setGbkwID(rst.getInt("gbkw_id"));
		gbkw.setGbkwTitle(rst.getString("gbkw_title"));
		gbkw.setGbkwType(rst.getInt("gbkw_type"));
		gbkw.setGbkwContent(rst.getString("gbkw_content"));
		
		gbkw.setSubDate(rst.getDate("sub_date"));
		gbkw.getSysUser().setUserID(rst.getInt("user_id"));
		gbkw.setHold(rst.getString("hold"));
		return gbkw;
	}

}
