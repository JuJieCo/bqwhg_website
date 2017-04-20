package com.jujie.bqwhg.struts.action;

import java.util.Date;
import java.util.List;

import com.jujie.bqwhg.model.service.YspxService;
import com.jujie.bqwhg.model.utils.BaseActionSupper;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.Yspx;
import com.jujie.bqwhg.struts.bean.SysUser;

public class YspxAction extends BaseActionSupper {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//文化馆概况
 
	private Page page;
	private String s_token;
	private Yspx yspx;
	private List<Yspx> yspxList;

	
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
	public Yspx getYspx() {
		return yspx;
	}
	public void setYspx(Yspx yspx) {
		this.yspx = yspx;
	}
	public List<Yspx> getYspxList() {
		return yspxList;
	}
	public void setYspxList(List<Yspx> yspxList) {
		this.yspxList = yspxList;
	}

	/**
	 *跳转到 list 页面 
	 */
	public String queryDefaultYspxList() throws Exception {
		if (page == null) {
			page = new Page(1);
		}
		YspxService yspxService = (YspxService)this.getService("yspxService");
		yspxList = yspxService.queryDefaultYspxList(yspx, page);
		return "list";
	}
	
	/**
	 *条件查询 
	 */
	public String queryYspxList() throws Exception {
		if(page==null){
			page = new Page(1);
		}
		YspxService yspxService = (YspxService)this.getService("yspxService");
		yspxList = yspxService.queryYspxList(yspx , page );
		return "list";
	}
	
	/**
	 *跳转到 新增&修改 页面
	 */
	public String findYspxForModify() throws Exception {
		YspxService yspxService = (YspxService)this.getService("yspxService");
		String modify = request.getParameter("modify"); 
		if(null!=modify&&"save".equals(modify)){
			yspx = new Yspx();
			//设置发布时间
			yspx.setSubDate(new Date());
			//设置当前登录人即发布人信息
			SysUser user = (SysUser)request.getSession().getAttribute("sessionLoginUser"); 
			yspx.setSysUser(user);
		}else if(null!=modify&&"update".equals(modify)){
			String yspxID = request.getParameter("yspxID");
			yspx = yspxService.findYspxByID(yspxID);
		}
		return "modify";
	}
	
	
	public String findYspxForShow() throws Exception {
		YspxService yspxService = (YspxService)this.getService("yspxService");
		String yspxID = request.getParameter("yspxID");
		yspx = yspxService.findYspxByID(yspxID);
		return "show";
	}
	
	
	public String modifyYspx() throws Exception {
		YspxService yspxService = (YspxService)this.getService("yspxService");
		//设置当前登录人即发布人信息
		SysUser user = (SysUser)request.getSession().getAttribute("sessionLoginUser"); 
		
		if(null!=yspx){
			yspx.setSysUser(user);
			Integer fjID = (Integer)request.getSession().getAttribute("fjID");
			yspxService.modifyYspx(yspx, fjID);;
			request.getSession().removeAttribute("fjID");
		}
		return this.queryYspxList();
	}
	
	public String deleteYspxByID() throws Exception {
		YspxService yspxService = (YspxService)this.getService("yspxService");
		String yspxID = request.getParameter("yspxID");
		yspxService.deleteYspxByID(yspxID);
		return this.queryYspxList();
	}
	
	
	
	

}
