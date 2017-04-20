package com.jujie.bqwhg.struts.action;

import java.util.List;

import com.jujie.bqwhg.model.service.IndexService;
import com.jujie.bqwhg.model.utils.BaseActionSupper;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.Fyzs;
import com.jujie.bqwhg.struts.bean.Gbkw;
import com.jujie.bqwhg.struts.bean.Jbgk;
import com.jujie.bqwhg.struts.bean.Qwll;
import com.jujie.bqwhg.struts.bean.Qwlt;
import com.jujie.bqwhg.struts.bean.Qwzc;
import com.jujie.bqwhg.struts.bean.Whhd;
import com.jujie.bqwhg.struts.bean.Wxsh;
import com.jujie.bqwhg.struts.bean.Yspx;

public class IndexAction extends BaseActionSupper {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Page page;
 	
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	
	private String s_token;
	
	public String getS_token() {
		return s_token;
	}
	public void setS_token(String s_token) {
		this.s_token = s_token;
	}

	private Jbgk jbgk;
	private Whhd whhd;
	private List<Whhd> whhdList;
	private Wxsh wxsh;
	private List<Wxsh> wxshList;
	private List<Wxsh> wxshList1;
	private List<Wxsh> wxshList2;
	private List<Wxsh> wxshList3;
	private List<Wxsh> wxshList4;
	private List<Wxsh> wxshList5;
	private Fyzs fyzs;
	private List<Fyzs> fyzsList;
	private Qwlt qwlt;
	private List<Qwlt> qwltList;
	private Yspx yspx;
	private List<Yspx> yspxList;
	private Gbkw gbkw;
	private List<Gbkw> gbkwList;
	private Qwll qwll;
	private List<Qwll> qwllList;
	private Qwzc qwzc;
	private List<Qwzc> qwzcList;
	
	
	
	 
	public Jbgk getJbgk() {
		return jbgk;
	}
	public void setJbgk(Jbgk jbgk) {
		this.jbgk = jbgk;
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
	public List<Wxsh> getWxshList1() {
		return wxshList1;
	}
	public void setWxshList1(List<Wxsh> wxshList1) {
		this.wxshList1 = wxshList1;
	}
	public List<Wxsh> getWxshList2() {
		return wxshList2;
	}
	public void setWxshList2(List<Wxsh> wxshList2) {
		this.wxshList2 = wxshList2;
	}
	public List<Wxsh> getWxshList3() {
		return wxshList3;
	}
	public void setWxshList3(List<Wxsh> wxshList3) {
		this.wxshList3 = wxshList3;
	}
	public List<Wxsh> getWxshList4() {
		return wxshList4;
	}
	public void setWxshList4(List<Wxsh> wxshList4) {
		this.wxshList4 = wxshList4;
	}
	public List<Wxsh> getWxshList5() {
		return wxshList5;
	}
	public void setWxshList5(List<Wxsh> wxshList5) {
		this.wxshList5 = wxshList5;
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
	 * 显示主页的信息
	 */
	public String showIndexPage() throws Exception {
	
		IndexService indexService = (IndexService) this.getService("indexService");
		//文化活动最新8个
		whhdList = indexService.queryDefaultWhhdList(null, null);
		if(whhdList.size()>8){
			whhdList = whhdList.subList(0, 8);
		}
		//馆办刊物最新8个
		gbkwList = indexService.queryDefaultGbkwList(null, null);
		if(gbkwList.size()>8){
			gbkwList = gbkwList.subList(0, 8);
		}
		//佳作展示书法
		wxshList1 = indexService.queryDefaultWxshJzzsList(null, null , 1);
		if(wxshList1.size()>4){
			wxshList1 = wxshList1.subList(0, 4);
		}
		//佳作展示美术
		wxshList2 = indexService.queryDefaultWxshJzzsList(null, null , 2);
		if(wxshList2.size()>4){
			wxshList2 = wxshList2.subList(0, 4);
		}
		//佳作展示摄影
		wxshList3 = indexService.queryDefaultWxshJzzsList(null, null , 3);
		if(wxshList3.size()>4){
			wxshList3 = wxshList3.subList(0, 4);
		}
		//佳作展示戏曲
		wxshList4 = indexService.queryDefaultWxshJzzsList(null, null , 4);
		if(wxshList4.size()>4){
			wxshList4 = wxshList4.subList(0, 4);
		}
		//佳作展示舞蹈
		wxshList5 = indexService.queryDefaultWxshJzzsList(null, null , 5);
		if(wxshList5.size()>4){
			wxshList5 = wxshList5.subList(0, 4);
		}
		//艺术培训最新11个
		yspxList = indexService.queryDefaultYspxList(null, null);
		if(yspxList.size()>11){
			yspxList = yspxList.subList(0, 11);
		}
		//群文理论最新11个
		qwllList = indexService.queryDefaultQwllList(null, null);
		if(qwllList.size()>11){
			qwllList = qwllList.subList(0, 11);
		}
		//群文政策最新11个
		qwzcList = indexService.queryDefaultQwzcList(null, null);
		if(qwzcList.size()>11){
			qwzcList = qwzcList.subList(0, 11);
		}
		//非遗展示最新9个
		fyzsList = indexService.queryDefaultFyzsList(null, null);
		if(fyzsList.size()>9){
			fyzsList = fyzsList.subList(0, 9);
		}
		return "indexpage";
	}
	
	
	/**
	 * 基本情况
	 */
	public String queryjbgkMenu() throws Exception{
		IndexService indexService = (IndexService) this.getService("indexService");
		jbgk = indexService.findJbgkByID();
		return"jbgk";
	}
	
	/**
	 * 文化活动列表
	 */
	public String queryWhhdMenu() throws Exception {
		if (page == null) {
			page = new Page(1);
		}
		IndexService indexService = (IndexService) this.getService("indexService");
		whhdList = indexService.queryDefaultWhhdList(whhd, page);
		return "whhdlist";
	}
	/**
	 * 文化活动内容
	 */
	public String findWhhdForShow() throws Exception {
		IndexService indexService = (IndexService) this.getService("indexService");
		String whhdID = request.getParameter("whhdID");
		whhd = indexService.findWhhdByID(whhdID);
		return "whhdshow";
	}
	
	
	/**
	 * 文学书画列表
	 */
	public String queryWxshMenu() throws Exception {
		if (page == null) {
			page = new Page(1);
		}
		IndexService indexService = (IndexService) this.getService("indexService");
		wxshList = indexService.queryDefaultWxshList(wxsh, page);
		return "wxshlist";
	}
	/**
	 * 文学书画内容
	 */
	public String findWxshForShow() throws Exception {
		IndexService indexService = (IndexService) this.getService("indexService");
		String wxshID = request.getParameter("wxshID");
		wxsh = indexService.findWxshByID(wxshID);
		return "wxshshow";
	}
	
	
	/**
	 * 非遗展示列表
	 */
	public String queryFyzsMenu() throws Exception {
		if (page == null) {
			page = new Page(1);
		}
		IndexService indexService = (IndexService) this.getService("indexService");
		fyzsList = indexService.queryDefaultFyzsList(fyzs, page);
		return "fyzslist";
	}
	/**
	 * 非遗展示内容
	 */
	public String findFyzsForShow() throws Exception {
		IndexService indexService = (IndexService) this.getService("indexService");
		String fyzsID = request.getParameter("fyzsID");
		fyzs = indexService.findFyzsByID(fyzsID);
		return "fyzsshow";
	}
	
	
	
	/**
	 * 群文论坛列表
	 */
	public String queryQwltMenu() throws Exception {
		if (page == null) {
			page = new Page(1);
		}
		IndexService indexService = (IndexService) this.getService("indexService");
		qwltList = indexService.queryDefaultQwltList(qwlt, page);
		return "qwltlist";
	}
	/**
	 * 群问论坛内容
	 */
	public String findQwltForShow() throws Exception {
		IndexService indexService = (IndexService) this.getService("indexService");
		String qwltID = request.getParameter("qwltID");
		qwlt = indexService.findQwltByID(qwltID);
		return "qwltshow";
	}
	
	
	
	/**
	 * 艺术培训列表
	 */
	public String queryYspxMenu() throws Exception {
		if (page == null) {
			page = new Page(1);
		}
		IndexService indexService = (IndexService) this.getService("indexService");
		yspxList = indexService.queryDefaultYspxList(yspx, page);
		return "yspxlist";
	}
	/**
	 * 艺术培训内容
	 */
	public String findYspxForShow() throws Exception {
		IndexService indexService = (IndexService) this.getService("indexService");
		String yspxID = request.getParameter("yspxID");
		yspx = indexService.findYspxByID(yspxID);
		return "yspxshow";
	}
	
	
	
	
	/**
	 * 馆办刊物列表
	 */
	public String queryGbkwMenu() throws Exception {
		if (page == null) {
			page = new Page(1);
		}
		IndexService indexService = (IndexService) this.getService("indexService");
		gbkwList = indexService.queryDefaultGbkwList(gbkw, page);
		return "gbkwlist";
	}
	/**
	 * 馆办刊物内容
	 */
	public String findGbkwForShow() throws Exception {
		IndexService indexService = (IndexService) this.getService("indexService");
		String gbkwID = request.getParameter("gbkwID");
		gbkw = indexService.findGbkwByID(gbkwID);
		return "gbkwshow";
	}
	
	
	
	
	/**
	 * 群文理论列表
	*/
	public String queryQwllMenu() throws Exception{
		if(page == null){
			page = new Page(1);
		}
		IndexService indexService = (IndexService)this.getService("indexService");
		qwllList = indexService.queryDefaultQwllList(qwll, page);
		return "qwlllist";
	}
	/**
	 * 群文理论内容
	*/
	public String findQwllForShow() throws Exception{
		IndexService indexService = (IndexService)this.getService("indexService");
		String qwllID = request.getParameter("qwllID");
		qwll = indexService.findQwllByID(qwllID);
		return "qwllshow";
	}
	
	
	
	/**
	 * 群文政策列表
	*/
	public String queryQwzcMenu() throws Exception{
		if(page == null){
			page = new Page(1);
		}
		IndexService indexService = (IndexService)this.getService("indexService");
		qwzcList = indexService.queryDefaultQwzcList(qwzc, page);
		return "qwzclist";
	}
	/**
	 * 群文政策内容
	*/
	public String findQwzcForShow() throws Exception{
		IndexService indexService = (IndexService)this.getService("indexService");
		String qwzcID = request.getParameter("qwzcID");
		qwzc = indexService.findQwzcByID(qwzcID);
		return "qwzcshow";
	}
	
}
