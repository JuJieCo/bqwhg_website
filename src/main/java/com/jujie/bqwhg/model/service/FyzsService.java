package com.jujie.bqwhg.model.service;

import java.util.List;

import com.jujie.bqwhg.model.dao.FyzsDAO;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.Fyzs;
import com.jujie.bqwhg.struts.bean.SysUser;

public class FyzsService {
	
	private FyzsDAO fyzsDAOServ;


	
	public void setFyzsDAOServ(FyzsDAO fyzsDAOServ) {
		this.fyzsDAOServ = fyzsDAOServ;
	}

	/**
	 *默认列表查询 
	 */ 
	public List<Fyzs> queryDefaultFyzsList(Fyzs fyzs , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != fyzs && !"".equals(fyzs)) {
			objs[0] = fyzs.getFyzsID();
		}
		return fyzsDAOServ.queryFyzsList(objs,page);
	}
	
	/**
	 *列表查询 
	 */ 
	public List<Fyzs> queryFyzsList(Fyzs fyzs , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != fyzs && !"".equals(fyzs)) {
			objs[1] = fyzs.getFyzsTitle();
		}
		return fyzsDAOServ.queryFyzsList(objs,page);
	}
	
	
	/**
	 *查一条 
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
	 *修改 新增 
	 */
	public void modifyFyzs(Fyzs fyzs , Integer fjID) throws Exception {
		if (null != fyzs.getFyzsID() && !"".equals(fyzs.getFyzsID())) {
			fyzsDAOServ.editFyzs(fyzs);
		} else {
			fyzsDAOServ.saveFyzs(fyzs);
		}
	}
	
	/**
	 *删除 
	 */
	public void deleteFyzsByID(String fyzsID) throws Exception {
		int id = 0;
		if(null!=fyzsID&&!"".equals(fyzsID)){		
			id = Integer.valueOf(fyzsID);	
			fyzsDAOServ.deleteFyzsByID(id);
		}
	}
	
 

}
