package com.jujie.bqwhg.model.service;

import java.util.List;

import com.jujie.bqwhg.model.dao.WhhdDAO;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.SysUser;
import com.jujie.bqwhg.struts.bean.Whhd;

public class WhhdService {
	private WhhdDAO whhdDAOServ;

	public void setWhhdDAOServ(WhhdDAO whhdDAOServ) {
		this.whhdDAOServ = whhdDAOServ;
	}

	/**
	 *默认列表查询 
	 */ 
	public List<Whhd> queryDefaultWhhdList(Whhd whhd , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != whhd && !"".equals(whhd)) {
			objs[0] = whhd.getWhhdID();
		}
		return whhdDAOServ.queryWhhdList(objs,page);
	}
	
	
	/**
	 *列表查询 
	 */ 
	public List<Whhd> queryWhhdList(Whhd whhd , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != whhd && !"".equals(whhd)) {
			objs[1] = whhd.getWhhdTitle();
		}
		return whhdDAOServ.queryWhhdList(objs,page);
	}
	
	
	/**
	 *查一条 
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
	 *修改 新增 
	 */
	public void modifyWhhd(Whhd whhd , Integer fjID) throws Exception {
		if (null != whhd.getWhhdID() && !"".equals(whhd.getWhhdID())) {
			whhdDAOServ.editWhhd(whhd);
		} else {
			whhdDAOServ.saveWhhd(whhd);
			 
		}
	}
	
	/**
	 *删除 
	 */
	public void deleteWhhdByID(String whhdID) throws Exception {
		int id = 0;
		if(null!=whhdID&&!"".equals(whhdID)){		
			id = Integer.valueOf(whhdID);	
			whhdDAOServ.deleteWhhdByID(id);
		}
	}
	
	 
}
