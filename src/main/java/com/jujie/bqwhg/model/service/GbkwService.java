package com.jujie.bqwhg.model.service;

import java.util.List;

import com.jujie.bqwhg.model.dao.GbkwDAO;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.Gbkw;
import com.jujie.bqwhg.struts.bean.SysUser;

public class GbkwService {
	
	private GbkwDAO gbkwDAOServ;


	
	public void setGbkwDAOServ(GbkwDAO gbkwDAOServ) {
		this.gbkwDAOServ = gbkwDAOServ;
	}

	/**
	 *默认列表查询 
	 */ 
	public List<Gbkw> queryDefaultGbkwList(Gbkw gbkw , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != gbkw && !"".equals(gbkw)) {
			objs[0] = gbkw.getGbkwID();
		}
		return gbkwDAOServ.queryGbkwList(objs,page);
	}
	
	/**
	 *列表查询 
	 */ 
	public List<Gbkw> queryGbkwList(Gbkw gbkw , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != gbkw && !"".equals(gbkw)) {
			objs[1] = gbkw.getGbkwTitle();
		}
		return gbkwDAOServ.queryGbkwList(objs,page);
	}
	
	
	/**
	 *查一条 
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
	 *修改 新增 
	 */
	public void modifyGbkw(Gbkw gbkw , Integer fjID) throws Exception {
		if (null != gbkw.getGbkwID() && !"".equals(gbkw.getGbkwID())) {
			gbkwDAOServ.editGbkw(gbkw);
		} else {
			gbkwDAOServ.saveGbkw(gbkw);
		}
	}
	
	/**
	 *删除 
	 */
	public void deleteGbkwByID(String gbkwID) throws Exception {
		int id = 0;
		if(null!=gbkwID&&!"".equals(gbkwID)){		
			id = Integer.valueOf(gbkwID);	
			gbkwDAOServ.deleteGbkwByID(id);
		}
	}
	
 

}
