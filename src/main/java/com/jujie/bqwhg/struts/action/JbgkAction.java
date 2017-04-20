package com.jujie.bqwhg.struts.action;

import java.util.List;

import com.jujie.bqwhg.model.service.JbgkService;
import com.jujie.bqwhg.model.utils.BaseActionSupper;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.Jbgk;
import com.jujie.bqwhg.struts.bean.SysUser;

public class JbgkAction extends BaseActionSupper {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//文化馆概况
 
	private Page page;
	private String s_token;
	private Jbgk jbgk;
	private List<Jbgk> jbgkList;

	
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
	public Jbgk getJbgk() {
		return jbgk;
	}
	public void setJbgk(Jbgk jbgk) {
		this.jbgk = jbgk;
	}
	public List<Jbgk> getJbgkList() {
		return jbgkList;
	}
	public void setJbgkList(List<Jbgk> jbgkList) {
		this.jbgkList = jbgkList;
	}

	/**
	 *跳转到 list 页面 
	 */
	public String queryDefaultJbgkList() throws Exception {
		if (page == null) {
			page = new Page(1);
		}
		JbgkService jbgkService = (JbgkService)this.getService("jbgkService");
		jbgkList = jbgkService.queryDefaultJbgkList(jbgk, page);
		return "list";
	}
	
	/**
	 *条件查询 
	 */
	public String queryJbgkList() throws Exception {
		if(page==null){
			page = new Page(1);
		}
		JbgkService jbgkService = (JbgkService)this.getService("jbgkService");
		jbgkList = jbgkService.queryJbgkList(jbgk , page );
		return "list";
	}
	
	/**
	 *跳转到 新增&修改 页面
	 */
	public String findJbgkForModify() throws Exception {
		JbgkService jbgkService = (JbgkService)this.getService("jbgkService");
			jbgk = jbgkService.findJbgkByID();
		return "modify";
	}
	
	
	public String findJbgkForShow() throws Exception {
		JbgkService jbgkService = (JbgkService)this.getService("jbgkService");
		jbgk = jbgkService.findJbgkByID();
		return "show";
	}
	
	
	public String modifyJbgk() throws Exception {
		JbgkService jbgkService = (JbgkService)this.getService("jbgkService");
		//设置当前登录人即发布人信息
		SysUser user = (SysUser)request.getSession().getAttribute("sessionLoginUser"); 
		
		if(null!=jbgk){
			jbgk.setSysUser(user);
			Integer fjID = (Integer)request.getSession().getAttribute("fjID");
			jbgkService.modifyJbgk(jbgk, fjID);;
			request.getSession().removeAttribute("fjID");
		}
		return this.queryJbgkList();
	}
	
 
	
	
	

}
