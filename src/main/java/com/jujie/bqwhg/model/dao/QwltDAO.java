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
import com.jujie.bqwhg.struts.bean.Qwlt;
import com.jujie.bqwhg.struts.bean.SysUser;

public class QwltDAO extends SpringJDBCTemplate{
	
	/**
	 *查询所有 
	 */
	@SuppressWarnings("unchecked")
	public List<Qwlt> queryQwltList(Object[] objs , Page page) throws Exception{
		String sql = "select * from qwlt where 1=1 ";
		List<Object> list = new ArrayList<Object>();
		if(objs!=null&&objs.length>0){
			if(objs.length>=1&&objs[0]!=null&&!"".equals(objs[0])){
				sql+=" and qwlt_id = ? ";
				list.add(objs[0]);
			}
			if(objs.length>=2&&objs[1]!=null&!"".equals(objs[1])){
				sql += " and qwlt_title like ? ";
				list.add("%" +objs[1] + "%" );
			}
		}
		sql += " and qwlt_title <> '' order by qwlt_id desc";
		return this.getJdbcTemplate().query(PageUtil.fyPage(sql, list.toArray(), page, this.getJdbcTemplate(), Page.DATABASE_TYPE_MYSQL),list.toArray(), new Qwlt());
	}
	
	
	/**
	 *按id查询一条记录
	 */
	@SuppressWarnings("unchecked")
	public Qwlt findQwltByID(int id) throws Exception{
		String sql = " select * from qwlt where qwlt_id =" +id;
		List<Qwlt> qwltList = this.getJdbcTemplate().query(sql, new Qwlt());
		if(qwltList!=null&&qwltList.size()>0){
			return qwltList.get(0);
		}
		return null;
	}
	
	/**
	 *查询发布人
	 */
	@SuppressWarnings("unchecked")
	public SysUser findUserByID(int id) throws Exception {
		String sql = " select t2.* from qwlt t1 , sys_user t2 where t1.user_id = t2.user_id and t1.qwlt_id="+id;
		List<SysUser> userList = this.getJdbcTemplate().query(sql,new SysUser());
		if(userList!=null&&userList.size()>0){
			return userList.get(0);
		}
		return null;
	}
	
	/**
	 *保存
	 */
	public int saveQwlt(Qwlt qwlt) throws Exception {
		final String sql = "insert into qwlt (qwlt_title,qwlt_type,qwlt_content,sub_date,user_id,hold) values (?,?,?,?,?,?)";
		final Object[] objs = {qwlt.getQwltTitle(),qwlt.getQwltType(),qwlt.getQwltContent(),qwlt.getSubDate(),qwlt.getSysUser().getUserID(),qwlt.getHold()};
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
	public void editQwlt(Qwlt qwlt) throws Exception {
		String sql = " update qwlt set qwlt_title=?,qwlt_type=?,qwlt_content=?,sub_date=?,user_id=?,hold=?  where qwlt_id=? ";
		Object[] objs = {qwlt.getQwltTitle(),qwlt.getQwltType(),qwlt.getQwltContent(),qwlt.getSubDate(),qwlt.getSysUser().getUserID(),qwlt.getHold(),qwlt.getQwltID()};
		this.getJdbcTemplate().update(sql,objs);   
	}
	
	/**
	 *删除
	 */
	public void deleteQwltByID(int id) throws Exception {
		String sql = " delete from qwlt where qwlt_id="+id;
		this.getJdbcTemplate().update(sql);
	}

}
