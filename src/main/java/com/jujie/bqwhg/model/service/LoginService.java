package com.jujie.bqwhg.model.service;

import com.jujie.bqwhg.model.dao.LoginDAO;
import com.jujie.bqwhg.struts.bean.SysUser;

public class LoginService {
	private LoginDAO loginDAOServ;

	
	
 

	public void setLoginDAOServ(LoginDAO loginDAOServ) {
		this.loginDAOServ = loginDAOServ;
	}

	public SysUser findSysUserByNameAndPassword(String name, String password) throws Exception{
		
		return loginDAOServ.findSysUserByNameAndPassword(name, password);
	}
	
	public SysUser findSysUserByID(String userID) throws Exception {
		int id = 0;
			if(null!=userID&&!"".equals(userID)){		
				id = Integer.valueOf(userID);			
			}
			return loginDAOServ.findUserByID(id);
	}
	

}
