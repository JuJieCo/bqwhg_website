package com.jujie.bqwhg.struts.action;

import java.util.Date;
import java.util.List;

import com.jujie.bqwhg.model.service.FyzsService;
import com.jujie.bqwhg.model.utils.BaseActionSupper;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.Fyzs;
import com.jujie.bqwhg.struts.bean.SysUser;

public class FyzsAction extends BaseActionSupper {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//文化馆概况
 
	private Page page;
	private String s_token;
	private Fyzs fyzs;
	private List<Fyzs> fyzsList;

	
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public String getS_token() {
		return s_token;
	}
	public void setS_token(String s_token) {
		this.s_token = s_token;
	}
	public Fyzs getFyzs() {
		return fyzs;
	}
	public void setFyzs(Fyzs fyzs) {
		this.fyzs = fyzs;
	}
	public List<Fyzs> getFyzsList() {
		return fyzsList;
	}
	public void setFyzsList(List<Fyzs> fyzsList) {
		this.fyzsList = fyzsList;
	}

	/**
	 *跳转到 list 页面 
	 */
	public String queryDefaultFyzsList() throws Exception {
		if (page == null) {
			page = new Page(1);
		}
		FyzsService fyzsService = (FyzsService)this.getService("fyzsService");
		fyzsList = fyzsService.queryDefaultFyzsList(fyzs, page);
		return "list";
	}
	
	/**
	 *条件查询 
	 */
	public String queryFyzsList() throws Exception {
		if(page==null){
			page = new Page(1);
		}
		FyzsService fyzsService = (FyzsService)this.getService("fyzsService");
		fyzsList = fyzsService.queryFyzsList(fyzs , page );
		return "list";
	}
	
	/**
	 *跳转到 新增&修改 页面
	 */
	public String findFyzsForModify() throws Exception {
		FyzsService fyzsService = (FyzsService)this.getService("fyzsService");
		String modify = request.getParameter("modify"); 
		if(null!=modify&&"save".equals(modify)){
			fyzs = new Fyzs();
			//设置发布时间
			fyzs.setSubDate(new Date());
			//设置当前登录人即发布人信息
			SysUser user = (SysUser)request.getSession().getAttribute("sessionLoginUser"); 
			fyzs.setSysUser(user);
		}else if(null!=modify&&"update".equals(modify)){
			String fyzsID = request.getParameter("fyzsID");
			fyzs = fyzsService.findFyzsByID(fyzsID);
		}
		return "modify";
	}
	
	
	public String findFyzsForShow() throws Exception {
		FyzsService fyzsService = (FyzsService)this.getService("fyzsService");
		String fyzsID = request.getParameter("fyzsID");
		fyzs = fyzsService.findFyzsByID(fyzsID);
		return "show";
	}
	
	
	public String modifyFyzs() throws Exception {
		FyzsService fyzsService = (FyzsService)this.getService("fyzsService");
		//设置当前登录人即发布人信息
		SysUser user = (SysUser)request.getSession().getAttribute("sessionLoginUser"); 
		
		if(null!=fyzs){
			fyzs.setSysUser(user);
			Integer fjID = (Integer)request.getSession().getAttribute("fjID");
			fyzsService.modifyFyzs(fyzs, fjID);
			request.getSession().removeAttribute("fjID");
		}
		return this.queryFyzsList();
	}
	
	public String deleteFyzsByID() throws Exception {
		FyzsService fyzsService = (FyzsService)this.getService("fyzsService");
		String fyzsID = request.getParameter("fyzsID");
		fyzsService.deleteFyzsByID(fyzsID);
		return this.queryFyzsList();
	}
	
	
	
	

}
