package com.jujie.bqwhg.model.service;

import java.util.List;

import com.jujie.bqwhg.model.dao.QwzcDAO;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.Qwzc;
import com.jujie.bqwhg.struts.bean.SysUser;

public class QwzcService {
	
	private QwzcDAO qwzcDAOServ;


	
	public void setQwzcDAOServ(QwzcDAO qwzcDAOServ) {
		this.qwzcDAOServ = qwzcDAOServ;
	}

	/**
	 *默认列表查询 
	 */ 
	public List<Qwzc> queryDefaultQwzcList(Qwzc qwzc , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != qwzc && !"".equals(qwzc)) {
			objs[0] = qwzc.getQwzcID();
		}
		return qwzcDAOServ.queryQwzcList(objs,page);
	}
	
	/**
	 *列表查询 
	 */ 
	public List<Qwzc> queryQwzcList(Qwzc qwzc , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != qwzc && !"".equals(qwzc)) {
			objs[1] = qwzc.getQwzcTitle();
		}
		return qwzcDAOServ.queryQwzcList(objs,page);
	}
	
	
	/**
	 *查一条 
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
	
	
	/**
	 *修改 新增 
	 */
	public void modifyQwzc(Qwzc qwzc , Integer fjID) throws Exception {
		if (null != qwzc.getQwzcID() && !"".equals(qwzc.getQwzcID())) {
			qwzcDAOServ.editQwzc(qwzc);
		} else {
			qwzcDAOServ.saveQwzc(qwzc);
		}
	}
	
	/**
	 *删除 
	 */
	public void deleteQwzcByID(String qwzcID) throws Exception {
		int id = 0;
		if(null!=qwzcID&&!"".equals(qwzcID)){		
			id = Integer.valueOf(qwzcID);	
			qwzcDAOServ.deleteQwzcByID(id);
		}
	}
	
 

}
