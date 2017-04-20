package com.jujie.bqwhg.struts.action;

import java.util.Date;
import java.util.List;

import com.jujie.bqwhg.model.service.QwzcService;
import com.jujie.bqwhg.model.utils.BaseActionSupper;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.Qwzc;
import com.jujie.bqwhg.struts.bean.SysUser;

public class QwzcAction extends BaseActionSupper {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
//文化馆概况
 
	private Page page;
	private String s_token;
	private Qwzc qwzc;
	private List<Qwzc> qwzcList;

	
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
	public Qwzc getQwzc() {
		return qwzc;
	}
	public void setQwzc(Qwzc qwzc) {
		this.qwzc = qwzc;
	}
	public List<Qwzc> getQwzcList() {
		return qwzcList;
	}
	public void setQwzcList(List<Qwzc> qwzcList) {
		this.qwzcList = qwzcList;
	}

	/**
	 *跳转到 list 页面 
	 */
	public String queryDefaultQwzcList() throws Exception {
		if (page == null) {
			page = new Page(1);
		}
		QwzcService qwzcService = (QwzcService)this.getService("qwzcService");
		qwzcList = qwzcService.queryDefaultQwzcList(qwzc, page);
		return "list";
	}
	
	/**
	 *条件查询 
	 */
	public String queryQwzcList() throws Exception {
		if(page==null){
			page = new Page(1);
		}
		QwzcService qwzcService = (QwzcService)this.getService("qwzcService");
		qwzcList = qwzcService.queryQwzcList(qwzc , page );
		return "list";
	}
	
	/**
	 *跳转到 新增&修改 页面
	 */
	public String findQwzcForModify() throws Exception {
		QwzcService qwzcService = (QwzcService)this.getService("qwzcService");
		String modify = request.getParameter("modify"); 
		if(null!=modify&&"save".equals(modify)){
			qwzc = new Qwzc();
			//设置发布时间
			qwzc.setSubDate(new Date());
			//设置当前登录人即发布人信息
			SysUser user = (SysUser)request.getSession().getAttribute("sessionLoginUser"); 
			qwzc.setSysUser(user);
		}else if(null!=modify&&"update".equals(modify)){
			String qwzcID = request.getParameter("qwzcID");
			qwzc = qwzcService.findQwzcByID(qwzcID);
		}
		return "modify";
	}
	
	
	public String findQwzcForShow() throws Exception {
		QwzcService qwzcService = (QwzcService)this.getService("qwzcService");
		String qwzcID = request.getParameter("qwzcID");
		qwzc = qwzcService.findQwzcByID(qwzcID);
		return "show";
	}
	
	
	public String modifyQwzc() throws Exception {
		QwzcService qwzcService = (QwzcService)this.getService("qwzcService");
		//设置当前登录人即发布人信息
		SysUser user = (SysUser)request.getSession().getAttribute("sessionLoginUser"); 
		
		if(null!=qwzc){
			qwzc.setSysUser(user);
			Integer fjID = (Integer)request.getSession().getAttribute("fjID");
			qwzcService.modifyQwzc(qwzc, fjID);;
			request.getSession().removeAttribute("fjID");
		}
		return this.queryQwzcList();
	}
	
	public String deleteQwzcByID() throws Exception {
		QwzcService qwzcService = (QwzcService)this.getService("qwzcService");
		String qwzcID = request.getParameter("qwzcID");
		qwzcService.deleteQwzcByID(qwzcID);
		return this.queryQwzcList();
	}
	
	
	
	

}
