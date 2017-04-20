package com.jujie.bqwhg.model.service;

import java.util.List;

import com.jujie.bqwhg.model.dao.WxshDAO;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.Wxsh;
import com.jujie.bqwhg.struts.bean.SysUser;

public class WxshService {
	
	private WxshDAO wxshDAOServ;


	
	public void setWxshDAOServ(WxshDAO wxshDAOServ) {
		this.wxshDAOServ = wxshDAOServ;
	}

	/**
	 *默认列表查询 
	 */ 
	public List<Wxsh> queryDefaultWxshList(Wxsh wxsh , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != wxsh && !"".equals(wxsh)) {
			objs[0] = wxsh.getWxshID();
		}
		return wxshDAOServ.queryWxshList(objs,page);
	}
	
	/**
	 *列表查询 
	 */ 
	public List<Wxsh> queryWxshList(Wxsh wxsh , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != wxsh && !"".equals(wxsh)) {
			objs[1] = wxsh.getWxshTitle();
		}
		return wxshDAOServ.queryWxshList(objs,page);
	}
	
	
	/**
	 *查一条 
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
	 *修改 新增 
	 */
	public void modifyWxsh(Wxsh wxsh , Integer fjID) throws Exception {
		if (null != wxsh.getWxshID() && !"".equals(wxsh.getWxshID())) {
			wxshDAOServ.editWxsh(wxsh);
		} else {
			wxshDAOServ.saveWxsh(wxsh);
		}
	}
	
	/**
	 *删除 
	 */
	public void deleteWxshByID(String wxshID) throws Exception {
		int id = 0;
		if(null!=wxshID&&!"".equals(wxshID)){		
			id = Integer.valueOf(wxshID);	
			wxshDAOServ.deleteWxshByID(id);
		}
	}
	
 

}
