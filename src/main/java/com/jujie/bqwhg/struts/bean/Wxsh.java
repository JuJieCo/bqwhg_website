package com.jujie.bqwhg.struts.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.jujie.bqwhg.model.utils.BaseBean;

public class Wxsh extends BaseBean {

	private Integer wxshID;
	private String wxshTitle;
	private Integer wxshType;
	private String wxshContent;
	private Date subDate;
	private SysUser sysUser;
	private String hold;
	
	public Wxsh(){
		this.sysUser = new SysUser();
	 
	}

	public Integer getWxshID() {
		return wxshID;
	}

	public void setWxshID(Integer wxshID) {
		this.wxshID = wxshID;
	}

	public String getWxshTitle() {
		return wxshTitle;
	}

	public void setWxshTitle(String wxshTitle) {
		this.wxshTitle = wxshTitle;
	}

	public Integer getWxshType() {
		return wxshType;
	}

	public void setWxshType(Integer wxshType) {
		this.wxshType = wxshType;
	}

	public String getWxshContent() {
		return wxshContent;
	}

	public void setWxshContent(String wxshContent) {
		this.wxshContent = wxshContent;
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
		Wxsh wxsh = new Wxsh();
		wxsh.setWxshID(rst.getInt("wxsh_id"));
		wxsh.setWxshTitle(rst.getString("wxsh_title"));
		wxsh.setWxshType(rst.getInt("wxsh_type"));
		wxsh.setWxshContent(rst.getString("wxsh_content"));
		
		wxsh.setSubDate(rst.getDate("sub_date"));
		wxsh.getSysUser().setUserID(rst.getInt("user_id"));
		wxsh.setHold(rst.getString("hold"));
		return wxsh;
	}

}
