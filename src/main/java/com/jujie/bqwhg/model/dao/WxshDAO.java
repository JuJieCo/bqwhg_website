package com.jujie.bqwhg.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.jujie.bqwhg.model.utils.DataUtil;
import com.jujie.bqwhg.model.utils.Page;
import com.jujie.bqwhg.model.utils.PageUtil;
import com.jujie.bqwhg.model.utils.SpringJDBCTemplate;
import com.jujie.bqwhg.struts.bean.SysUser;
import com.jujie.bqwhg.struts.bean.Wxsh;

public class WxshDAO extends SpringJDBCTemplate{
	
	/**
	 *查询所有 
	 */
	@SuppressWarnings("unchecked")
	public List<Wxsh> queryWxshList(Object[] objs , Page page) throws Exception{
		String sql = "select * from wxsh where 1=1 ";
		List<Object> list = new ArrayList<Object>();
		if(objs!=null&&objs.length>0){
			if(objs.length>=1&&objs[0]!=null&&!"".equals(objs[0])){
				sql+=" and wxsh_id = ? ";
				list.add(objs[0]);
			}
			if(objs.length>=2&&objs[1]!=null&!"".equals(objs[1])){
				sql += " and wxsh_title like ? ";
				list.add("%" +objs[1] + "%" );
			}
		}
		sql += " and wxsh_title <> '' order by wxsh_id desc";
		return this.getJdbcTemplate().query(PageUtil.fyPage(sql, list.toArray(), page, this.getJdbcTemplate(), Page.DATABASE_TYPE_MYSQL),list.toArray(), new Wxsh());
	}
	
	/**
	 *查询佳作展示
	 */
	@SuppressWarnings("unchecked")
	public List<Wxsh> queryWxshJzzsList(Object[] objs , Page page ) throws Exception{
		String sql = "select * from wxsh where 1=1 ";
		List<Object> list = new ArrayList<Object>();
		if(objs!=null&&objs.length>0){
			if(objs.length>=1&&objs[0]!=null&&!"".equals(objs[0])){
				sql+=" and wxsh_id = ? ";
				list.add(objs[0]);
			}
			if(objs.length>=2&&objs[1]!=null&!"".equals(objs[1])){
				sql += " and wxsh_title like ? ";
				list.add("%" +objs[1] + "%" );
			}
			if(objs.length>=3&&objs[2]!=null&!"".equals(objs[2])){
				sql += " and wxsh_type = ? ";
				list.add(objs[2]);
			}
		}
		sql += " and wxsh_title <> '' order by wxsh_id desc";
		return this.getJdbcTemplate().query(PageUtil.fyPage(sql, list.toArray(), page, this.getJdbcTemplate(), Page.DATABASE_TYPE_MYSQL),list.toArray(), new Wxsh());
	}
	
	
	/**
	 *按id查询一条记录
	 */
	@SuppressWarnings("unchecked")
	public Wxsh findWxshByID(int id) throws Exception{
		String sql = " select * from wxsh where wxsh_id =" +id;
		List<Wxsh> wxshList = this.getJdbcTemplate().query(sql, new Wxsh());
		if(wxshList!=null&&wxshList.size()>0){
			return wxshList.get(0);
		}
		return null;
	}
	
	/**
	 *查询发布人
	 */
	@SuppressWarnings("unchecked")
	public SysUser findUserByID(int id) throws Exception {
		String sql = " select t2.* from wxsh t1 , sys_user t2 where t1.user_id = t2.user_id and t1.wxsh_id="+id;
		List<SysUser> userList = this.getJdbcTemplate().query(sql,new SysUser());
		if(userList!=null&&userList.size()>0){
			return userList.get(0);
		}
		return null;
	}
	
	/**
	 *保存
	 */
	public int saveWxsh(Wxsh wxsh) throws Exception {
		final String sql = "insert into wxsh (wxsh_title,wxsh_type,wxsh_content,sub_date,user_id,hold) values (?,?,?,?,?,?)";
		final Object[] objs = {wxsh.getWxshTitle(),wxsh.getWxshType(),wxsh.getWxshContent(),wxsh.getSubDate(),wxsh.getSysUser().getUserID(),wxsh.getHold()};
		KeyHolder keyHolder = new GeneratedKeyHolder(); 
		try {
			this.getJdbcTemplate().update(new PreparedStatementCreator(){
				public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
					int i = 0;
					int n = 0;
					PreparedStatement pst = con.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
					pst.setString(++i, DataUtil.toString(objs[n++])); 
					pst.setInt(++i, DataUtil.toInt(objs[n++]));
					pst.setString(++i, DataUtil.toString(objs[n++])); 
					pst.setTimestamp(++i, DataUtil.toTimestamp(objs[n++]));
					pst.setInt(++i, DataUtil.toInt(objs[n++]));
					pst.setString(++i, DataUtil.toString(objs[n++]));    
					return pst;
				}}, keyHolder);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return keyHolder.getKey().intValue();
	}
	
	
	/**
	 *修改
	 */
	public void editWxsh(Wxsh wxsh) throws Exception {
		String sql = " update wxsh set wxsh_title=?,wxsh_type=?,wxsh_content=?,sub_date=?,user_id=?,hold=?  where wxsh_id=? ";
		Object[] objs = {wxsh.getWxshTitle(),wxsh.getWxshType(),wxsh.getWxshContent(),wxsh.getSubDate(),wxsh.getSysUser().getUserID(),wxsh.getHold(),wxsh.getWxshID()};
		this.getJdbcTemplate().update(sql,objs);   
	}
	
	/**
	 *删除
	 */
	public void deleteWxshByID(int id) throws Exception {
		String sql = " delete from wxsh where wxsh_id="+id;
		this.getJdbcTemplate().update(sql);
	}

}
