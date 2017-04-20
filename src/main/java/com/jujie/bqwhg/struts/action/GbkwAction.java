package com.jujie.bqwhg.struts.action;

import java.util.Date;
import java.util.List;

import com.jujie.bqwhg.model.service.GbkwService;
import com.jujie.bqwhg.model.utils.BaseActionSupper;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.Gbkw;
import com.jujie.bqwhg.struts.bean.SysUser;

public class GbkwAction extends BaseActionSupper {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//文化馆概况
 
	private Page page;
	private String s_token;
	private Gbkw gbkw;
	private List<Gbkw> gbkwList;

	
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
	public Gbkw getGbkw() {
		return gbkw;
	}
	public void setGbkw(Gbkw gbkw) {
		this.gbkw = gbkw;
	}
	public List<Gbkw> getGbkwList() {
		return gbkwList;
	}
	public void setGbkwList(List<Gbkw> gbkwList) {
		this.gbkwList = gbkwList;
	}

	/**
	 *跳转到 list 页面 
	 */
	public String queryDefaultGbkwList() throws Exception {
		if (page == null) {
			page = new Page(1);
		}
		GbkwService gbkwService = (GbkwService)this.getService("gbkwService");
		gbkwList = gbkwService.queryDefaultGbkwList(gbkw, page);
		return "list";
	}
	
	/**
	 *条件查询 
	 */
	public String queryGbkwList() throws Exception {
		if(page==null){
			page = new Page(1);
		}
		GbkwService gbkwService = (GbkwService)this.getService("gbkwService");
		gbkwList = gbkwService.queryGbkwList(gbkw , page );
		return "list";
	}
	
	/**
	 *跳转到 新增&修改 页面
	 */
	public String findGbkwForModify() throws Exception {
		GbkwService gbkwService = (GbkwService)this.getService("gbkwService");
		String modify = request.getParameter("modify"); 
		if(null!=modify&&"save".equals(modify)){
			gbkw = new Gbkw();
			//设置发布时间
			gbkw.setSubDate(new Date());
			//设置当前登录人即发布人信息
			SysUser user = (SysUser)request.getSession().getAttribute("sessionLoginUser"); 
			gbkw.setSysUser(user);
		}else if(null!=modify&&"update".equals(modify)){
			String gbkwID = request.getParameter("gbkwID");
			gbkw = gbkwService.findGbkwByID(gbkwID);
		}
		return "modify";
	}
	
	
	public String findGbkwForShow() throws Exception {
		GbkwService gbkwService = (GbkwService)this.getService("gbkwService");
		String gbkwID = request.getParameter("gbkwID");
		gbkw = gbkwService.findGbkwByID(gbkwID);
		return "show";
	}
	
	
	public String modifyGbkw() throws Exception {
		GbkwService gbkwService = (GbkwService)this.getService("gbkwService");
		//设置当前登录人即发布人信息
		SysUser user = (SysUser)request.getSession().getAttribute("sessionLoginUser"); 
		
		if(null!=gbkw){
			gbkw.setSysUser(user);
			Integer fjID = (Integer)request.getSession().getAttribute("fjID");
			gbkwService.modifyGbkw(gbkw, fjID);;
			request.getSession().removeAttribute("fjID");
		}
		return this.queryGbkwList();
	}
	
	public String deleteGbkwByID() throws Exception {
		GbkwService gbkwService = (GbkwService)this.getService("gbkwService");
		String gbkwID = request.getParameter("gbkwID");
		gbkwService.deleteGbkwByID(gbkwID);
		return this.queryGbkwList();
	}
	
	
	
	

}
