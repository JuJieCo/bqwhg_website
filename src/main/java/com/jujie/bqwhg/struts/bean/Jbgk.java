package com.jujie.bqwhg.struts.bean;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import com.jujie.bqwhg.model.utils.BaseBean;

public class Jbgk extends BaseBean {

	private Integer jbgkID;
	private String jbgkTitle;
	private Integer jbgkType;
	private String jbgkContent;
	private Date subDate;
	private SysUser sysUser;
	private String hold;
 
	
	public Jbgk(){
		this.sysUser = new SysUser();
	 
	}

	public Integer getJbgkID() {
		return jbgkID;
	}

	public void setJbgkID(Integer jbgkID) {
		this.jbgkID = jbgkID;
	}

	public String getJbgkTitle() {
		return jbgkTitle;
	}

	public void setJbgkTitle(String jbgkTitle) {
		this.jbgkTitle = jbgkTitle;
	}

	public Integer getJbgkType() {
		return jbgkType;
	}

	public void setJbgkType(Integer jbgkType) {
		this.jbgkType = jbgkType;
	}

	public String getJbgkContent() {
		return jbgkContent;
	}

	public void setJbgkContent(String jbgkContent) {
		this.jbgkContent = jbgkContent;
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
		Jbgk jbgk = new Jbgk();
		jbgk.setJbgkID(rst.getInt("jbgk_id"));
		jbgk.setJbgkTitle(rst.getString("jbgk_title"));
		jbgk.setJbgkType(rst.getInt("jbgk_type"));
		jbgk.setJbgkContent(rst.getString("jbgk_content"));
		
		jbgk.setSubDate(rst.getDate("sub_date"));
		jbgk.getSysUser().setUserID(rst.getInt("user_id"));
		jbgk.setHold(rst.getString("hold"));
		return jbgk;
	}

}
