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
import com.jujie.bqwhg.struts.bean.Fyzs;
import com.jujie.bqwhg.struts.bean.SysUser;

public class FyzsDAO extends SpringJDBCTemplate{
	
	/**
	 *查询所有 
	 */
	@SuppressWarnings("unchecked")
	public List<Fyzs> queryFyzsList(Object[] objs , Page page) throws Exception{
		String sql = "select * from fyzs where 1=1 ";
		List<Object> list = new ArrayList<Object>();
		if(objs!=null&&objs.length>0){
			if(objs.length>=1&&objs[0]!=null&&!"".equals(objs[0])){
				sql+=" and fyzs_id = ? ";
				list.add(objs[0]);
			}
			if(objs.length>=2&&objs[1]!=null&!"".equals(objs[1])){
				sql += " and fyzs_title like ? ";
				list.add("%" +objs[1] + "%" );
			}
		}
		sql += " and fyzs_title <> '' order by fyzs_id desc";
		return this.getJdbcTemplate().query(PageUtil.fyPage(sql, list.toArray(), page, this.getJdbcTemplate(), Page.DATABASE_TYPE_MYSQL),list.toArray(), new Fyzs());
	}
	
	
	/**
	 *按id查询一条记录
	 */
	@SuppressWarnings("unchecked")
	public Fyzs findFyzsByID(int id) throws Exception{
		String sql = " select * from fyzs where fyzs_id =" +id;
		List<Fyzs> fyzsList = this.getJdbcTemplate().query(sql, new Fyzs());
		if(fyzsList!=null&&fyzsList.size()>0){
			return fyzsList.get(0);
		}
		return null;
	}
	
	/**
	 *查询发布人
	 */
	@SuppressWarnings("unchecked")
	public SysUser findUserByID(int id) throws Exception {
		String sql = " select t2.* from fyzs t1 , sys_user t2 where t1.user_id = t2.user_id and t1.fyzs_id="+id;
		List<SysUser> userList = this.getJdbcTemplate().query(sql,new SysUser());
		if(userList!=null&&userList.size()>0){
			return userList.get(0);
		}
		return null;
	}
	
	/**
	 *保存
	 */
	public int saveFyzs(Fyzs fyzs) throws Exception {
		final String sql = "insert into fyzs (fyzs_title,fyzs_type,fyzs_content,sub_date,user_id,hold) values (?,?,?,?,?,?)";
		final Object[] objs = {fyzs.getFyzsTitle(),fyzs.getFyzsType(),fyzs.getFyzsContent(),fyzs.getSubDate(),fyzs.getSysUser().getUserID(),fyzs.getHold()};
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
	public void editFyzs(Fyzs fyzs) throws Exception {
		String sql = " update fyzs set fyzs_title=?,fyzs_type=?,fyzs_content=?,sub_date=?,user_id=?,hold=?  where fyzs_id=? ";
		Object[] objs = {fyzs.getFyzsTitle(),fyzs.getFyzsType(),fyzs.getFyzsContent(),fyzs.getSubDate(),fyzs.getSysUser().getUserID(),fyzs.getHold(),fyzs.getFyzsID()};
		this.getJdbcTemplate().update(sql,objs);   
	}
	
	/**
	 *删除
	 */
	public void deleteFyzsByID(int id) throws Exception {
		String sql = " delete from fyzs where fyzs_id="+id;
		this.getJdbcTemplate().update(sql);
	}

}
