package com.jujie.bqwhg.model.service;

import java.util.List;

import com.jujie.bqwhg.model.dao.QwllDAO;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.Qwll;
import com.jujie.bqwhg.struts.bean.SysUser;

public class QwllService {
	
	private QwllDAO qwllDAOServ;


	
	public void setQwllDAOServ(QwllDAO qwllDAOServ) {
		this.qwllDAOServ = qwllDAOServ;
	}

	/**
	 *默认列表查询 
	 */ 
	public List<Qwll> queryDefaultQwllList(Qwll qwll , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != qwll && !"".equals(qwll)) {
			objs[0] = qwll.getQwllID();
		}
		return qwllDAOServ.queryQwllList(objs,page);
	}
	
	/**
	 *列表查询 
	 */ 
	public List<Qwll> queryQwllList(Qwll qwll , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != qwll && !"".equals(qwll)) {
			objs[1] = qwll.getQwllTitle();
		}
		return qwllDAOServ.queryQwllList(objs,page);
	}
	
	
	/**
	 *查一条 
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
	 *修改 新增 
	 */
	public void modifyQwll(Qwll qwll , Integer fjID) throws Exception {
		if (null != qwll.getQwllID() && !"".equals(qwll.getQwllID())) {
			qwllDAOServ.editQwll(qwll);
		} else {
			qwllDAOServ.saveQwll(qwll);
		}
	}
	
	/**
	 *删除 
	 */
	public void deleteQwllByID(String qwllID) throws Exception {
		int id = 0;
		if(null!=qwllID&&!"".equals(qwllID)){		
			id = Integer.valueOf(qwllID);	
			qwllDAOServ.deleteQwllByID(id);
		}
	}
	
 

}
