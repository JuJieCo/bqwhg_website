package com.jujie.bqwhg.struts.action;

import java.util.Date;
import java.util.List;

import com.jujie.bqwhg.model.service.QwltService;
import com.jujie.bqwhg.model.utils.BaseActionSupper;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.Qwlt;
import com.jujie.bqwhg.struts.bean.SysUser;

public class QwltAction extends BaseActionSupper {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//文化馆概况
 
	private Page page;
	private String s_token;
	private Qwlt qwlt;
	private List<Qwlt> qwltList;

	
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
	public Qwlt getQwlt() {
		return qwlt;
	}
	public void setQwlt(Qwlt qwlt) {
		this.qwlt = qwlt;
	}
	public List<Qwlt> getQwltList() {
		return qwltList;
	}
	public void setQwltList(List<Qwlt> qwltList) {
		this.qwltList = qwltList;
	}

	/**
	 *跳转到 list 页面 
	 */
	public String queryDefaultQwltList() throws Exception {
		if (page == null) {
			page = new Page(1);
		}
		QwltService qwltService = (QwltService)this.getService("qwltService");
		qwltList = qwltService.queryDefaultQwltList(qwlt, page);
		return "list";
	}
	
	/**
	 *条件查询 
	 */
	public String queryQwltList() throws Exception {
		if(page==null){
			page = new Page(1);
		}
		QwltService qwltService = (QwltService)this.getService("qwltService");
		qwltList = qwltService.queryQwltList(qwlt , page );
		return "list";
	}
	
	/**
	 *跳转到 新增&修改 页面
	 */
	public String findQwltForModify() throws Exception {
		QwltService qwltService = (QwltService)this.getService("qwltService");
		String modify = request.getParameter("modify"); 
		if(null!=modify&&"save".equals(modify)){
			qwlt = new Qwlt();
			//设置发布时间
			qwlt.setSubDate(new Date());
			//设置当前登录人即发布人信息
			SysUser user = (SysUser)request.getSession().getAttribute("sessionLoginUser"); 
			qwlt.setSysUser(user);
		}else if(null!=modify&&"update".equals(modify)){
			String qwltID = request.getParameter("qwltID");
			qwlt = qwltService.findQwltByID(qwltID);
		}
		return "modify";
	}
	
	
	public String findQwltForShow() throws Exception {
		QwltService qwltService = (QwltService)this.getService("qwltService");
		String qwltID = request.getParameter("qwltID");
		qwlt = qwltService.findQwltByID(qwltID);
		return "show";
	}
	
	
	public String modifyQwlt() throws Exception {
		QwltService qwltService = (QwltService)this.getService("qwltService");
		//设置当前登录人即发布人信息
		SysUser user = (SysUser)request.getSession().getAttribute("sessionLoginUser"); 
		
		if(null!=qwlt){
			qwlt.setSysUser(user);
			Integer fjID = (Integer)request.getSession().getAttribute("fjID");
			qwltService.modifyQwlt(qwlt, fjID);;
			request.getSession().removeAttribute("fjID");
		}
		return this.queryQwltList();
	}
	
	public String deleteQwltByID() throws Exception {
		QwltService qwltService = (QwltService)this.getService("qwltService");
		String qwltID = request.getParameter("qwltID");
		qwltService.deleteQwltByID(qwltID);
		return this.queryQwltList();
	}
	
	
	
	

}
