package com.jujie.bqwhg.model.service;

import java.util.List;

import com.jujie.bqwhg.model.dao.JbgkDAO;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.Jbgk;
import com.jujie.bqwhg.struts.bean.SysUser;

public class JbgkService {
	
	private JbgkDAO jbgkDAOServ;


	
	public void setJbgkDAOServ(JbgkDAO jbgkDAOServ) {
		this.jbgkDAOServ = jbgkDAOServ;
	}

	/**
	 *默认列表查询 
	 */ 
	public List<Jbgk> queryDefaultJbgkList(Jbgk jbgk , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != jbgk && !"".equals(jbgk)) {
			objs[0] = jbgk.getJbgkID();
		}
		return jbgkDAOServ.queryJbgkList(objs,page);
	}
	
	/**
	 *列表查询 
	 */ 
	public List<Jbgk> queryJbgkList(Jbgk jbgk , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != jbgk && !"".equals(jbgk)) {
			objs[1] = jbgk.getJbgkTitle();
		}
		return jbgkDAOServ.queryJbgkList(objs,page);
	}
	
	
	/**
	 *查一条 
	 */
	public Jbgk findJbgkByID( ) throws Exception {
			SysUser user = jbgkDAOServ.findUserByID();
			Jbgk jbgk = jbgkDAOServ.findJbgkByID();
			jbgk.getSysUser().setLoginName(user.getLoginName());
			
			return jbgk;
	}
	
	
	/**
	 *修改 新增 
	 */
	public void modifyJbgk(Jbgk jbgk , Integer fjID) throws Exception {
		if (null != jbgk.getJbgkID() && !"".equals(jbgk.getJbgkID())) {
			jbgkDAOServ.editJbgk(jbgk);
		} 
//		else {
//			jbgkDAOServ.saveJbgk(jbgk);
//		}
	}
	
//	/**
//	 *删除 
//	 */
//	public void deleteJbgkByID(String jbgkID) throws Exception {
//		int id = 0;
//		if(null!=jbgkID&&!"".equals(jbgkID)){		
//			id = Integer.valueOf(jbgkID);	
//			jbgkDAOServ.deleteJbgkByID(id);
//		}
//	}
	
 

}
