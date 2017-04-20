package com.jujie.bqwhg.model.service;

import java.util.ArrayList;
import java.util.List;

import com.jujie.bqwhg.model.dao.FyzsDAO;
import com.jujie.bqwhg.model.dao.GbkwDAO;
import com.jujie.bqwhg.model.dao.JbgkDAO;
import com.jujie.bqwhg.model.dao.QwllDAO;
import com.jujie.bqwhg.model.dao.QwltDAO;
import com.jujie.bqwhg.model.dao.QwzcDAO;
import com.jujie.bqwhg.model.dao.WhhdDAO;
import com.jujie.bqwhg.model.dao.WxshDAO;
import com.jujie.bqwhg.model.dao.YspxDAO;
import com.jujie.bqwhg.model.utils.GetPicNameUtil;
import com.jujie.bqwhg.model.utils.HtmlToTextUtil;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.Fyzs;
import com.jujie.bqwhg.struts.bean.Gbkw;
import com.jujie.bqwhg.struts.bean.Jbgk;
import com.jujie.bqwhg.struts.bean.Qwll;
import com.jujie.bqwhg.struts.bean.Qwlt;
import com.jujie.bqwhg.struts.bean.Qwzc;
import com.jujie.bqwhg.struts.bean.SysUser;
import com.jujie.bqwhg.struts.bean.Whhd;
import com.jujie.bqwhg.struts.bean.Wxsh;
import com.jujie.bqwhg.struts.bean.Yspx;

public class IndexService {

	private FyzsDAO fyzsDAOServ;
	private GbkwDAO gbkwDAOServ;
	private JbgkDAO jbgkDAOServ;
	private QwllDAO qwllDAOServ;
	private QwltDAO qwltDAOServ;
	private QwzcDAO qwzcDAOServ;
	private WhhdDAO whhdDAOServ;
	private WxshDAO wxshDAOServ;
	private YspxDAO yspxDAOServ;

	public void setFyzsDAOServ(FyzsDAO fyzsDAOServ) {
		this.fyzsDAOServ = fyzsDAOServ;
	}

	public void setGbkwDAOServ(GbkwDAO gbkwDAOServ) {
		this.gbkwDAOServ = gbkwDAOServ;
	}

	public void setJbgkDAOServ(JbgkDAO jbgkDAOServ) {
		this.jbgkDAOServ = jbgkDAOServ;
	}

	public void setQwllDAOServ(QwllDAO qwllDAOServ) {
		this.qwllDAOServ = qwllDAOServ;
	}

	public void setQwltDAOServ(QwltDAO qwltDAOServ) {
		this.qwltDAOServ = qwltDAOServ;
	}

	public void setQwzcDAOServ(QwzcDAO qwzcDAOServ) {
		this.qwzcDAOServ = qwzcDAOServ;
	}

	public void setWhhdDAOServ(WhhdDAO whhdDAOServ) {
		this.whhdDAOServ = whhdDAOServ;
	}

	public void setWxshDAOServ(WxshDAO wxshDAOServ) {
		this.wxshDAOServ = wxshDAOServ;
	}

	public void setYspxDAOServ(YspxDAO yspxDAOServ) {
		this.yspxDAOServ = yspxDAOServ;
	}
	

	
	
	
	
	
	
	/**
	 * 查询基本概况信息中最新的一个*/
	
	public Jbgk findJbgkByID( ) throws Exception {
			SysUser user = jbgkDAOServ.findUserByID();
			Jbgk jbgk = jbgkDAOServ.findJbgkByID();
			jbgk.getSysUser().setLoginName(user.getLoginName());
		return jbgk;
	}
	
	
	
	/**
	 * 文化活动列表
	 */
	public List<Whhd> queryDefaultWhhdList(Whhd whhd , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != whhd && !"".equals(whhd)) {
			objs[0] = whhd.getWhhdID();
		}
		List<Whhd> whhdList = new ArrayList<Whhd>(); 
		whhdList = whhdDAOServ.queryWhhdList(objs,page);
		for (Whhd whhdl : whhdList) {
			//列表页面显示缩略图
			GetPicNameUtil picName = new GetPicNameUtil(); 
			String pic = picName.picName(whhdl.getWhhdContent());
			whhdl.setHold(pic);
			//列表页面显示内容
			HtmlToTextUtil htmlToText = new HtmlToTextUtil();
			String text = htmlToText.htmlToText(whhdl.getWhhdContent());
			whhdl.setWhhdContent(text);
		}
		return whhdList;
	}
	/**
	 * 文化活动内容
	 */
	public Whhd findWhhdByID(String whhdID) throws Exception {
		int id = 0;
			if(null!=whhdID&&!"".equals(whhdID)){		
				id = Integer.valueOf(whhdID);			
			}
			SysUser user = whhdDAOServ.findUserByID(id);
			Whhd whhd = whhdDAOServ.findWhhdByID(id);
			whhd.getSysUser().setLoginName(user.getLoginName());
			return whhd;
	}
	
	
	
	
	
	/**
	 * 文学书画列表
	 */
	public List<Wxsh> queryDefaultWxshList(Wxsh wxsh , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != wxsh && !"".equals(wxsh)) {
			objs[0] = wxsh.getWxshID();
		}
		List<Wxsh> wxshList = new ArrayList<Wxsh>(); 
		wxshList = wxshDAOServ.queryWxshList(objs,page);
		for (Wxsh wxshl : wxshList) {
			//列表页面显示缩略图
			GetPicNameUtil picName = new GetPicNameUtil(); 
			String pic = picName.picName(wxshl.getWxshContent());
			wxshl.setHold(pic);
			//列表页面显示内容
			HtmlToTextUtil htmlToText = new HtmlToTextUtil();
			String text = htmlToText.htmlToText(wxshl.getWxshContent());
			wxshl.setWxshContent(text);
		}
		return wxshList;
	}
	
	
	/**
	 * 文学书画内容
	 */
	public Wxsh findWxshByID(String wxshID) throws Exception {
		int id = 0;
			if(null!=wxshID&&!"".equals(wxshID)){		
				id = Integer.valueOf(wxshID);			
			}
			SysUser user = wxshDAOServ.findUserByID(id);
			Wxsh wxsh = wxshDAOServ.findWxshByID(id);
			wxsh.getSysUser().setLoginName(user.getLoginName());
			return wxsh;
	}
	
	/**
	 * 文学书画佳作展示
	 */
	public List<Wxsh> queryDefaultWxshJzzsList(Wxsh wxsh , Page page ,int type) throws Exception {
		Object[] objs = new Object[3];
//		if (null != wxsh && !"".equals(wxsh)) {
//			objs[0] = wxsh.getWxshID();
			objs[2] = type;
//		}
		List<Wxsh> wxshList = new ArrayList<Wxsh>(); 
		wxshList = wxshDAOServ.queryWxshJzzsList(objs , page);
		for (Wxsh wxshl : wxshList) {
			//列表页面显示缩略图
			GetPicNameUtil picName = new GetPicNameUtil(); 
			String pic = picName.picName(wxshl.getWxshContent());
			wxshl.setHold(pic);
			//列表页面显示内容
			HtmlToTextUtil htmlToText = new HtmlToTextUtil();
			String text = htmlToText.htmlToText(wxshl.getWxshContent());
			wxshl.setWxshContent(text);
		}
		return wxshList;
	}
	
	
	
	/**
	 * 非遗展示列表
	 */
	public List<Fyzs> queryDefaultFyzsList(Fyzs fyzs , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != fyzs && !"".equals(fyzs)) {
			objs[0] = fyzs.getFyzsID();
		}
		List<Fyzs> fyzsList = new ArrayList<Fyzs>(); 
		fyzsList = fyzsDAOServ.queryFyzsList(objs,page);
		for (Fyzs fyzsl : fyzsList) {
			//列表页面显示缩略图
			GetPicNameUtil picName = new GetPicNameUtil(); 
			String pic = picName.picName(fyzsl.getFyzsContent());
			fyzsl.setHold(pic);
			//列表页面显示内容
			HtmlToTextUtil htmlToText = new HtmlToTextUtil();
			String text = htmlToText.htmlToText(fyzsl.getFyzsContent());
			fyzsl.setFyzsContent(text);
		}
		return fyzsList;
	}
	/**
	 * 非遗展示内容
	 */
	public Fyzs findFyzsByID(String fyzsID) throws Exception {
		int id = 0;
			if(null!=fyzsID&&!"".equals(fyzsID)){		
				id = Integer.valueOf(fyzsID);			
			}
			SysUser user = fyzsDAOServ.findUserByID(id);
			Fyzs fyzs = fyzsDAOServ.findFyzsByID(id);
			fyzs.getSysUser().setLoginName(user.getLoginName());
			return fyzs;
	}
	
	
	
	
	/**
	 * 群文论坛列表
	 */
	public List<Qwlt> queryDefaultQwltList(Qwlt qwlt , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != qwlt && !"".equals(qwlt)) {
			objs[0] = qwlt.getQwltID();
		}
		List<Qwlt> qwltList = new ArrayList<Qwlt>(); 
		qwltList = qwltDAOServ.queryQwltList(objs,page);
		for (Qwlt qwltl : qwltList) {
			//列表页面显示缩略图
			GetPicNameUtil picName = new GetPicNameUtil(); 
			String pic = picName.picName(qwltl.getQwltContent());
			qwltl.setHold(pic);
			//列表页面显示内容
			HtmlToTextUtil htmlToText = new HtmlToTextUtil();
			String text = htmlToText.htmlToText(qwltl.getQwltContent());
			qwltl.setQwltContent(text);
		}
		return qwltList;
	}
	/**
	 * 群文论坛内容
	 */
	public Qwlt findQwltByID(String qwltID) throws Exception {
		int id = 0;
			if(null!=qwltID&&!"".equals(qwltID)){		
				id = Integer.valueOf(qwltID);			
			}
			SysUser user = qwltDAOServ.findUserByID(id);
			Qwlt qwlt = qwltDAOServ.findQwltByID(id);
			qwlt.getSysUser().setLoginName(user.getLoginName());
			return qwlt;
	}
	
	
	
	
	/**
	 * 艺术培训列表
	 */
	public List<Yspx> queryDefaultYspxList(Yspx yspx , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != yspx && !"".equals(yspx)) {
			objs[0] = yspx.getYspxID();
		}
		List<Yspx> yspxList = new ArrayList<Yspx>(); 
		yspxList = yspxDAOServ.queryYspxList(objs,page);
		for (Yspx yspxl : yspxList) {
			//列表页面显示内容
			HtmlToTextUtil htmlToText = new HtmlToTextUtil();
			String text = htmlToText.htmlToText(yspxl.getYspxContent());
			yspxl.setYspxContent(text);
		}
		return yspxList;
	}
	/**
	 * 艺术培训内容
	 */
	public Yspx findYspxByID(String yspxID) throws Exception {
		int id = 0;
			if(null!=yspxID&&!"".equals(yspxID)){		
				id = Integer.valueOf(yspxID);			
			}
			SysUser user = yspxDAOServ.findUserByID(id);
			Yspx yspx = yspxDAOServ.findYspxByID(id);
			yspx.getSysUser().setLoginName(user.getLoginName());
			return yspx;
	}
	
	
	
	
	/**
	 * 馆办刊物列表
	 */
	public List<Gbkw> queryDefaultGbkwList(Gbkw gbkw , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != gbkw && !"".equals(gbkw)) {
			objs[0] = gbkw.getGbkwID();
		}
		List<Gbkw> gbkwList = new ArrayList<Gbkw>(); 
		gbkwList = gbkwDAOServ.queryGbkwList(objs,page);
		for (Gbkw gbkwl : gbkwList) {
			//列表页面显示内容
			HtmlToTextUtil htmlToText = new HtmlToTextUtil();
			String text = htmlToText.htmlToText(gbkwl.getGbkwContent());
			gbkwl.setGbkwContent(text);
		}
		return gbkwList;
	}
	/**
	 * 馆办刊物内容
	 */
	public Gbkw findGbkwByID(String gbkwID) throws Exception {
		int id = 0;
			if(null!=gbkwID&&!"".equals(gbkwID)){		
				id = Integer.valueOf(gbkwID);			
			}
			SysUser user = gbkwDAOServ.findUserByID(id);
			Gbkw gbkw = gbkwDAOServ.findGbkwByID(id);
			gbkw.getSysUser().setLoginName(user.getLoginName());
			return gbkw;
	}
	
	
	/**
	 * 群文理论列表
	 */
	public List<Qwll> queryDefaultQwllList(Qwll qwll , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != qwll && !"".equals(qwll)) {
			objs[0] = qwll.getQwllID();
		}
		List<Qwll> qwllList = new ArrayList<Qwll>(); 
		qwllList = qwllDAOServ.queryQwllList(objs,page);
		for (Qwll qwlll : qwllList) {
			//列表页面显示内容
			HtmlToTextUtil htmlToText = new HtmlToTextUtil();
			String text = htmlToText.htmlToText(qwlll.getQwllContent());
			qwlll.setQwllContent(text);
		}
		return qwllList;
	}
	/**
	 * 群文理论内容
	 */
	public Qwll findQwllByID(String qwllID) throws Exception {
		int id = 0;
			if(null!=qwllID&&!"".equals(qwllID)){		
				id = Integer.valueOf(qwllID);			
			}
			SysUser user = qwllDAOServ.findUserByID(id);
			Qwll qwll = qwllDAOServ.findQwllByID(id);
			qwll.getSysUser().setLoginName(user.getLoginName());
			return qwll;
	}
	
	
	
	/**
	 * 群文政策列表
	 */
	public List<Qwzc> queryDefaultQwzcList(Qwzc qwzc , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != qwzc && !"".equals(qwzc)) {
			objs[0] = qwzc.getQwzcID();
		}
		List<Qwzc> qwzcList = new ArrayList<Qwzc>(); 
		qwzcList = qwzcDAOServ.queryQwzcList(objs,page);
		for (Qwzc qwzcl : qwzcList) {
			//列表页面显示内容
			HtmlToTextUtil htmlToText = new HtmlToTextUtil();
			String text = htmlToText.htmlToText(qwzcl.getQwzcContent());
			qwzcl.setQwzcContent(text);
		}
		return qwzcList;
	}
	/**
	 * 群文政策内容
	 */
	public Qwzc findQwzcByID(String qwzcID) throws Exception {
		int id = 0;
			if(null!=qwzcID&&!"".equals(qwzcID)){		
				id = Integer.valueOf(qwzcID);			
			}
			SysUser user = qwzcDAOServ.findUserByID(id);
			Qwzc qwzc = qwzcDAOServ.findQwzcByID(id);
			qwzc.getSysUser().setLoginName(user.getLoginName());
			return qwzc;
	}

}
