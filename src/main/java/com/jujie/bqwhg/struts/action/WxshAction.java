package com.jujie.bqwhg.struts.action;

import java.util.Date;
import java.util.List;

import com.jujie.bqwhg.model.service.WxshService;
import com.jujie.bqwhg.model.utils.BaseActionSupper;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.Wxsh;
import com.jujie.bqwhg.struts.bean.SysUser;

public class WxshAction extends BaseActionSupper {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//文化馆概况
 
	private Page page;
	private String s_token;
	private Wxsh wxsh;
	private List<Wxsh> wxshList;

	
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
	public Wxsh getWxsh() {
		return wxsh;
	}
	public void setWxsh(Wxsh wxsh) {
		this.wxsh = wxsh;
	}
	public List<Wxsh> getWxshList() {
		return wxshList;
	}
	public void setWxshList(List<Wxsh> wxshList) {
		this.wxshList = wxshList;
	}

	/**
	 *跳转到 list 页面 
	 */
	public String queryDefaultWxshList() throws Exception {
		if (page == null) {
			page = new Page(1);
		}
		WxshService wxshService = (WxshService)this.getService("wxshService");
		wxshList = wxshService.queryDefaultWxshList(wxsh, page);
		return "list";
	}
	
	/**
	 *条件查询 
	 */
	public String queryWxshList() throws Exception {
		if(page==null){
			page = new Page(1);
		}
		WxshService wxshService = (WxshService)this.getService("wxshService");
		wxshList = wxshService.queryWxshList(wxsh , page );
		return "list";
	}
	
	/**
	 *跳转到 新增&修改 页面
	 */
	public String findWxshForModify() throws Exception {
		WxshService wxshService = (WxshService)this.getService("wxshService");
		String modify = request.getParameter("modify"); 
		if(null!=modify&&"save".equals(modify)){
			wxsh = new Wxsh();
			//设置发布时间
			wxsh.setSubDate(new Date());
			//设置当前登录人即发布人信息
			SysUser user = (SysUser)request.getSession().getAttribute("sessionLoginUser"); 
			wxsh.setSysUser(user);
		}else if(null!=modify&&"update".equals(modify)){
			String wxshID = request.getParameter("wxshID");
			wxsh = wxshService.findWxshByID(wxshID);
		}
		return "modify";
	}
	
	
	public String findWxshForShow() throws Exception {
		WxshService wxshService = (WxshService)this.getService("wxshService");
		String wxshID = request.getParameter("wxshID");
		wxsh = wxshService.findWxshByID(wxshID);
		return "show";
	}
	
	
	public String modifyWxsh() throws Exception {
		WxshService wxshService = (WxshService)this.getService("wxshService");
		//设置当前登录人即发布人信息
		SysUser user = (SysUser)request.getSession().getAttribute("sessionLoginUser"); 
		
		if(null!=wxsh){
			wxsh.setSysUser(user);
			Integer fjID = (Integer)request.getSession().getAttribute("fjID");
			wxshService.modifyWxsh(wxsh, fjID);;
			request.getSession().removeAttribute("fjID");
		}
		return this.queryWxshList();
	}
	
	public String deleteWxshByID() throws Exception {
		WxshService wxshService = (WxshService)this.getService("wxshService");
		String wxshID = request.getParameter("wxshID");
		wxshService.deleteWxshByID(wxshID);
		return this.queryWxshList();
	}
	
	
	
	

}
