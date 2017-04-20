package com.jujie.bqwhg.struts.action;

import java.util.Date;
import java.util.List;

import com.jujie.bqwhg.model.service.QwllService;
import com.jujie.bqwhg.model.utils.BaseActionSupper;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.Qwll;
import com.jujie.bqwhg.struts.bean.SysUser;

public class QwllAction extends BaseActionSupper {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//文化馆概况
 
	private Page page;
	private String s_token;
	private Qwll qwll;
	private List<Qwll> qwllList;

	
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
	public Qwll getQwll() {
		return qwll;
	}
	public void setQwll(Qwll qwll) {
		this.qwll = qwll;
	}
	public List<Qwll> getQwllList() {
		return qwllList;
	}
	public void setQwllList(List<Qwll> qwllList) {
		this.qwllList = qwllList;
	}

	/**
	 *跳转到 list 页面 
	 */
	public String queryDefaultQwllList() throws Exception {
		if (page == null) {
			page = new Page(1);
		}
		QwllService qwllService = (QwllService)this.getService("qwllService");
		qwllList = qwllService.queryDefaultQwllList(qwll, page);
		return "list";
	}
	
	/**
	 *条件查询 
	 */
	public String queryQwllList() throws Exception {
		if(page==null){
			page = new Page(1);
		}
		QwllService qwllService = (QwllService)this.getService("qwllService");
		qwllList = qwllService.queryQwllList(qwll , page );
		return "list";
	}
	
	/**
	 *跳转到 新增&修改 页面
	 */
	public String findQwllForModify() throws Exception {
		QwllService qwllService = (QwllService)this.getService("qwllService");
		String modify = request.getParameter("modify"); 
		if(null!=modify&&"save".equals(modify)){
			qwll = new Qwll();
			//设置发布时间
			qwll.setSubDate(new Date());
			//设置当前登录人即发布人信息
			SysUser user = (SysUser)request.getSession().getAttribute("sessionLoginUser"); 
			qwll.setSysUser(user);
		}else if(null!=modify&&"update".equals(modify)){
			String qwllID = request.getParameter("qwllID");
			qwll = qwllService.findQwllByID(qwllID);
		}
		return "modify";
	}
	
	
	public String findQwllForShow() throws Exception {
		QwllService qwllService = (QwllService)this.getService("qwllService");
		String qwllID = request.getParameter("qwllID");
		qwll = qwllService.findQwllByID(qwllID);
		return "show";
	}
	
	
	public String modifyQwll() throws Exception {
		QwllService qwllService = (QwllService)this.getService("qwllService");
		//设置当前登录人即发布人信息
		SysUser user = (SysUser)request.getSession().getAttribute("sessionLoginUser"); 
		
		if(null!=qwll){
			qwll.setSysUser(user);
			Integer fjID = (Integer)request.getSession().getAttribute("fjID");
			qwllService.modifyQwll(qwll, fjID);;
			request.getSession().removeAttribute("fjID");
		}
		return this.queryQwllList();
	}
	
	public String deleteQwllByID() throws Exception {
		QwllService qwllService = (QwllService)this.getService("qwllService");
		String qwllID = request.getParameter("qwllID");
		qwllService.deleteQwllByID(qwllID);
		return this.queryQwllList();
	}
	
	
	
	

}
