package com.jujie.bqwhg.struts.action;

import java.util.Date;
import java.util.List;

import com.jujie.bqwhg.model.service.WhhdService;
import com.jujie.bqwhg.model.utils.BaseActionSupper;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.SysUser;
import com.jujie.bqwhg.struts.bean.Whhd;

public class WhhdAction extends BaseActionSupper{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Page page;
	private String s_token;
	private Whhd whhd;
	private List<Whhd> whhdList;
 
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
	public Whhd getWhhd() {
		return whhd;
	}
	public void setWhhd(Whhd whhd) {
		this.whhd = whhd;
	}
	public List<Whhd> getWhhdList() {
		return whhdList;
	}
	public void setWhhdList(List<Whhd> whhdList) {
		this.whhdList = whhdList;
	}
 
    
	/**
	 *跳转到 list 页面 
	 */
	public String queryDefaultWhhdList() throws Exception {
		if (page == null) {
			page = new Page(1);
		}
		WhhdService whhdService = (WhhdService)this.getService("whhdService");
		whhdList = whhdService.queryDefaultWhhdList(whhd, page);
		return "list";
	}
	
	/**
	 *条件查询 
	 */
	public String queryWhhdList() throws Exception {
		if(page==null){
			page = new Page(1);
		}
		WhhdService whhdService = (WhhdService)this.getService("whhdService");
		whhdList = whhdService.queryWhhdList(whhd , page );
		return "list";
	}
	
	/**
	 *跳转到 新增&修改 页面
	 */
	public String findWhhdForModify() throws Exception {
		WhhdService whhdService = (WhhdService)this.getService("whhdService");
		String modify = request.getParameter("modify"); 
		if(null!=modify&&"save".equals(modify)){
			whhd = new Whhd();
			//设置发布时间
			whhd.setSubDate(new Date());
			//设置当前登录人即发布人信息
			SysUser user = (SysUser)request.getSession().getAttribute("sessionLoginUser"); 
			whhd.setSysUser(user);
		}else if(null!=modify&&"update".equals(modify)){
			String whhdID = request.getParameter("whhdID");
			whhd = whhdService.findWhhdByID(whhdID);
		}
		return "modify";
	}
	
	
	public String findWhhdForShow() throws Exception {
		WhhdService whhdService = (WhhdService)this.getService("whhdService");
		String whhdID = request.getParameter("whhdID");
		whhd = whhdService.findWhhdByID(whhdID);
		return "show";
	}
	
	
	public String modifyWhhd() throws Exception {
		WhhdService whhdService = (WhhdService)this.getService("whhdService");
		//设置当前登录人即发布人信息
		SysUser user = (SysUser)request.getSession().getAttribute("sessionLoginUser"); 
		
		if(null!=whhd){
			whhd.setSysUser(user);
			Integer fjID = (Integer)request.getSession().getAttribute("fjID");
			whhdService.modifyWhhd(whhd, fjID);;
			request.getSession().removeAttribute("fjID");
		}
		return this.queryWhhdList();
	}
	
	public String deleteWhhdByID() throws Exception {
		WhhdService whhdService = (WhhdService)this.getService("whhdService");
		String whhdID = request.getParameter("whhdID");
		whhdService.deleteWhhdByID(whhdID);
		return this.queryWhhdList();
	}
	
	
	

}
