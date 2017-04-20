package com.jujie.bqwhg.model.service;

import java.util.List;

import com.jujie.bqwhg.model.dao.QwltDAO;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.Qwlt;
import com.jujie.bqwhg.struts.bean.SysUser;

public class QwltService {
	
	private QwltDAO qwltDAOServ;


	
	public void setQwltDAOServ(QwltDAO qwltDAOServ) {
		this.qwltDAOServ = qwltDAOServ;
	}

	/**
	 *默认列表查询 
	 */ 
	public List<Qwlt> queryDefaultQwltList(Qwlt qwlt , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != qwlt && !"".equals(qwlt)) {
			objs[0] = qwlt.getQwltID();
		}
		return qwltDAOServ.queryQwltList(objs,page);
	}
	
	/**
	 *列表查询 
	 */ 
	public List<Qwlt> queryQwltList(Qwlt qwlt , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != qwlt && !"".equals(qwlt)) {
			objs[1] = qwlt.getQwltTitle();
		}
		return qwltDAOServ.queryQwltList(objs,page);
	}
	
	
	/**
	 *查一条 
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
	 *修改 新增 
	 */
	public void modifyQwlt(Qwlt qwlt , Integer fjID) throws Exception {
		if (null != qwlt.getQwltID() && !"".equals(qwlt.getQwltID())) {
			qwltDAOServ.editQwlt(qwlt);
		} else {
			qwltDAOServ.saveQwlt(qwlt);
		}
	}
	
	/**
	 *删除 
	 */
	public void deleteQwltByID(String qwltID) throws Exception {
		int id = 0;
		if(null!=qwltID&&!"".equals(qwltID)){		
			id = Integer.valueOf(qwltID);	
			qwltDAOServ.deleteQwltByID(id);
		}
	}
	
 

}
