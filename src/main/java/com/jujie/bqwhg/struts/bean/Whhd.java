package com.jujie.bqwhg.struts.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.jujie.bqwhg.model.utils.BaseBean;

public class Whhd extends BaseBean {

	private Integer whhdID;
	private String whhdTitle;
	private Integer whhdType;
	private String whhdContent;
	private Date subDate;
	private SysUser sysUser;
	private String hold;
	 
	
	public Whhd(){
		this.sysUser = new SysUser();
		 
	}
	
	public Integer getWhhdID() {
		return whhdID;
	}

	public void setWhhdID(Integer whhdID) {
		this.whhdID = whhdID;
	}

	public String getWhhdTitle() {
		return whhdTitle;
	}

	public void setWhhdTitle(String whhdTitle) {
		this.whhdTitle = whhdTitle;
	}

	public Integer getWhhdType() {
		return whhdType;
	}

	public void setWhhdType(Integer whhdType) {
		this.whhdType = whhdType;
	}

	public String getWhhdContent() {
		return whhdContent;
	}

	public void setWhhdContent(String whhdContent) {
		this.whhdContent = whhdContent;
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
		Whhd whhd = new Whhd();

		whhd.setWhhdID(rst.getInt("whhd_id"));
		whhd.setWhhdTitle(rst.getString("whhd_title"));
		whhd.setWhhdType(rst.getInt("whhd_type"));
		whhd.setWhhdContent(rst.getString("whhd_content"));
		
		whhd.setSubDate(rst.getDate("sub_date"));
		whhd.getSysUser().setUserID(rst.getInt("user_id"));
		whhd.setHold(rst.getString("hold"));
		return whhd;
	}

}
