package com.jujie.bqwhg.model.service;

import java.util.List;

import com.jujie.bqwhg.model.dao.YspxDAO;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.Yspx;
import com.jujie.bqwhg.struts.bean.SysUser;

public class YspxService {
	
	private YspxDAO yspxDAOServ;


	
	public void setYspxDAOServ(YspxDAO yspxDAOServ) {
		this.yspxDAOServ = yspxDAOServ;
	}

	/**
	 *默认列表查询 
	 */ 
	public List<Yspx> queryDefaultYspxList(Yspx yspx , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != yspx && !"".equals(yspx)) {
			objs[0] = yspx.getYspxID();
		}
		return yspxDAOServ.queryYspxList(objs,page);
	}
	
	/**
	 *列表查询 
	 */ 
	public List<Yspx> queryYspxList(Yspx yspx , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != yspx && !"".equals(yspx)) {
			objs[1] = yspx.getYspxTitle();
		}
		return yspxDAOServ.queryYspxList(objs,page);
	}
	
	
	/**
	 *查一条 
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
	 *修改 新增 
	 */
	public void modifyYspx(Yspx yspx , Integer fjID) throws Exception {
		if (null != yspx.getYspxID() && !"".equals(yspx.getYspxID())) {
			yspxDAOServ.editYspx(yspx);
		} else {
			yspxDAOServ.saveYspx(yspx);
		}
	}
	
	/**
	 *删除 
	 */
	public void deleteYspxByID(String yspxID) throws Exception {
		int id = 0;
		if(null!=yspxID&&!"".equals(yspxID)){		
			id = Integer.valueOf(yspxID);	
			yspxDAOServ.deleteYspxByID(id);
		}
	}
	
 

}
