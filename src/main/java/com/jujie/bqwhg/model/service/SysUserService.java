package com.jujie.bqwhg.model.service;

import java.util.List;

import com.jujie.bqwhg.model.dao.SysUserDAO;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.struts.bean.SysUser;

public class SysUserService {
	
	private SysUserDAO sysUserDAOServ;

	
	
	
	public void setSysUserDAOServ(SysUserDAO sysUserDAOServ) {
		this.sysUserDAOServ = sysUserDAOServ;
	}

	/**
	 *默认列表查询 
	 */ 
	public List<SysUser> queryDefaultUserList(SysUser sysUser , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != sysUser && !"".equals(sysUser)) {
			objs[0] = sysUser.getUserID();
		}
		return sysUserDAOServ.queryUserList(objs,page);
	}
	
	/**
	 *条件列表查询 
	 */ 
	public List<SysUser> queryUserList(SysUser sysUser , Page page) throws Exception {
		Object[] objs = new Object[2];
		if (null != sysUser && !"".equals(sysUser)) {
			objs[1] = sysUser.getLoginName();
		}
		return sysUserDAOServ.queryUserList(objs , page );
	}
	
	
	public SysUser findUserByID(String userID) throws Exception {
		int id = 0;
			if(null!=userID&&!"".equals(userID)){		
				id = Integer.valueOf(userID);			
			}
			return sysUserDAOServ.findUserByID(id);
	}
	
	public void modifyUser(SysUser sysUser) throws Exception {
		if (null != sysUser.getUserID() && !"".equals(sysUser.getUserID())) {
			sysUserDAOServ.editUser(sysUser);
		} else {
			sysUser.setHold("0");
			sysUserDAOServ.saveUser(sysUser);
		}
	}
	
	public void deleteUserByID(String userID) throws Exception {
		int id = 0;
		if(null!=userID&&!"".equals(userID)){		
			id = Integer.valueOf(userID);		
			sysUserDAOServ.deleteUserByID(id);
		}
	}
	
	public void resetUserByID(String userID) throws Exception {
		int id = 0;
		if(null!=userID&&!"".equals(userID)){		
			id = Integer.valueOf(userID);		
			sysUserDAOServ.resetUserByID(id);
		}
	}
	

}
