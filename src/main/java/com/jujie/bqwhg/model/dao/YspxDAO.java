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
import com.jujie.bqwhg.struts.bean.Yspx;
import com.jujie.bqwhg.struts.bean.SysUser;

public class YspxDAO extends SpringJDBCTemplate{
	
	/**
	 *查询所有 
	 */
	@SuppressWarnings("unchecked")
	public List<Yspx> queryYspxList(Object[] objs , Page page) throws Exception{
		String sql = "select * from yspx where 1=1 ";
		List<Object> list = new ArrayList<Object>();
		if(objs!=null&&objs.length>0){
			if(objs.length>=1&&objs[0]!=null&&!"".equals(objs[0])){
				sql+=" and yspx_id = ? ";
				list.add(objs[0]);
			}
			if(objs.length>=2&&objs[1]!=null&!"".equals(objs[1])){
				sql += " and yspx_title like ? ";
				list.add("%" +objs[1] + "%" );
			}
		}
		sql += " and yspx_title <> '' order by yspx_id desc";
		return this.getJdbcTemplate().query(PageUtil.fyPage(sql, list.toArray(), page, this.getJdbcTemplate(), Page.DATABASE_TYPE_MYSQL),list.toArray(), new Yspx());
	}
	
	
	/**
	 *按id查询一条记录
	 */
	@SuppressWarnings("unchecked")
	public Yspx findYspxByID(int id) throws Exception{
		String sql = " select * from yspx where yspx_id =" +id;
		List<Yspx> yspxList = this.getJdbcTemplate().query(sql, new Yspx());
		if(yspxList!=null&&yspxList.size()>0){
			return yspxList.get(0);
		}
		return null;
	}
	
	/**
	 *查询发布人
	 */
	@SuppressWarnings("unchecked")
	public SysUser findUserByID(int id) throws Exception {
		String sql = " select t2.* from yspx t1 , sys_user t2 where t1.user_id = t2.user_id and t1.yspx_id="+id;
		List<SysUser> userList = this.getJdbcTemplate().query(sql,new SysUser());
		if(userList!=null&&userList.size()>0){
			return userList.get(0);
		}
		return null;
	}
	
	/**
	 *保存
	 */
	public int saveYspx(Yspx yspx) throws Exception {
		final String sql = "insert into yspx (yspx_title,yspx_type,yspx_content,sub_date,user_id,hold) values (?,?,?,?,?,?)";
		final Object[] objs = {yspx.getYspxTitle(),yspx.getYspxType(),yspx.getYspxContent(),yspx.getSubDate(),yspx.getSysUser().getUserID(),yspx.getHold()};
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
	public void editYspx(Yspx yspx) throws Exception {
		String sql = " update yspx set yspx_title=?,yspx_type=?,yspx_content=?,sub_date=?,user_id=?,hold=?  where yspx_id=? ";
		Object[] objs = {yspx.getYspxTitle(),yspx.getYspxType(),yspx.getYspxContent(),yspx.getSubDate(),yspx.getSysUser().getUserID(),yspx.getHold(),yspx.getYspxID()};
		this.getJdbcTemplate().update(sql,objs);   
	}
	
	/**
	 *删除
	 */
	public void deleteYspxByID(int id) throws Exception {
		String sql = " delete from yspx where yspx_id="+id;
		this.getJdbcTemplate().update(sql);
	}

}
